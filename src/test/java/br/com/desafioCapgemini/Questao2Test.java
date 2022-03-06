package br.com.desafioCapgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao2Test {

	@Test
	public void testVetor() {
		Questao2 qto = new Questao2();
		int vetor = qto.vetor(1,5,3,4,2);
		assertEquals(3, vetor);
	}

}
