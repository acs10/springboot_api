package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Produto;

@SpringBootTest
public class ProdutoTest {

	@Test
	void contextLoads() {
		Produto produto = new Produto();
		produto.setCodProdt("");
		produto.setIdentdLinhaBilat("");
		produto.setTpDeb_Cred("");
		produto.setISPBIFCredtd("");
		produto.setISPBIFDebtd("");
		produto.setVlrLanc("");
		produto.setCNPJNLiqdantDebtd("");
		produto.setNomCliDebtd("");
		produto.setCNPJNLiqdantCredtd("");
		produto.setNomCliCredtd("");
		produto.setTpTranscSLC("");
	}
	
}
