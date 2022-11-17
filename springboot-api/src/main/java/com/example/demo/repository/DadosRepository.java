package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dados;

@Repository
public interface DadosRepository extends JpaRepository<Dados, Long>{

}
