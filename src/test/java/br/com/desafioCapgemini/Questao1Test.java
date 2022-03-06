package br.com.desafioCapgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao1Test {

	@Test
	public void testMain() {
		Questao1 qto = new Questao1();
		int mediana = qto.mediana(9,2,1,4,6);
		assertEquals(1, mediana);
	}

}
