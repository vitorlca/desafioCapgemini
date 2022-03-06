package br.com.desafioCapgemini;

import static org.junit.Assert.*;
import org.junit.Test;

public class Questao3Test {

	@Test
	public void testEncriptar() {
		Questao3 qto = new Questao3();
		String encriptar = qto.encriptar("tenha um bom dia");
		assertNotNull(encriptar);
		
	}

}

