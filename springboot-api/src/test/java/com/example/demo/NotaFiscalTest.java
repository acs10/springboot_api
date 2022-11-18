package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.NotaFiscal;

@SpringBootTest
public class NotaFiscalTest {

	@Test
	void contextLoads() {
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setIdentdEmissor("");
		notaFiscal.setIdentdDestinatario("");
		notaFiscal.setNumSeq("");
		notaFiscal.setIndrCont("");
		notaFiscal.setDomSist("");
		notaFiscal.setNUOp("");
	}
	
}
