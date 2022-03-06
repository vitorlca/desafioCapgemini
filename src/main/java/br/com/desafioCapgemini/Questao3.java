package br.com.desafioCapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao3 {

	public String encriptar(String texto) {
		
		String tSemEpaco = null;
		List<String> textoSemEspaco = Arrays.asList(texto.split("\\s+"));
		for (int i = 0; i < textoSemEspaco.size(); i++) {
			if(tSemEpaco != null) {
				tSemEpaco += textoSemEspaco.get(i);
			}else {
				tSemEpaco = textoSemEspaco.get(i);
			}
		}
		List<String> textoSepardo = Arrays.asList(tSemEpaco.split(""));
		Collections.shuffle(textoSepardo);
	    StringBuilder t = new StringBuilder(texto.length());
	    for (String k : textoSepardo) {
	        t.append(k);
	    }
		String textoMisturado = t.toString();
		
		List<String> divisao = new ArrayList<String>();
		
		int tamandoTexto = (int) Math.sqrt(textoMisturado.length()) + 1;
		
		for (int i = 0; i < textoMisturado.length(); i += tamandoTexto) {
			divisao.add(textoMisturado.substring(i, Math.min(i + tamandoTexto, textoMisturado.length())));
		}
		
		String encriptado = null;
		for (int i = 0; i < divisao.size(); i++) {
			if(encriptado != null) {
				encriptado += " " + divisao.get(i);
			}else {
				encriptado = divisao.get(i);
			}
		}
		
		return encriptado;

	}

}
