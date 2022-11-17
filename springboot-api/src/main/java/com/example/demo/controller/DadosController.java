package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dados;
import com.example.demo.repository.DadosRepository;

@RestController
@RequestMapping("/dados")
public class DadosController {
	
	@Autowired
	private DadosRepository dadosRepository;
	
	@GetMapping
	public List<Dados> listarDados() {
		return dadosRepository.findAll();
	}
	
	@PostMapping(path = "/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Dados addDados(@RequestBody Dados dados) {
		return dadosRepository.save(dados);
	}
	
}


