package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Documento;

@SpringBootTest
public class DocumentoTest {
	
	@Test
	void contextLoads() {
		Documento documento = new Documento();
		documento.setCodMsg("SLC0001");
		documento.setNumCtrlSLC("");
		documento.setISPBIF("");
		documento.setDtLiquid("");
		documento.setNumSeqCicloLiquid("");
		documento.setDtHrSLC("");
		documento.setDtMovto("");
	}
}
