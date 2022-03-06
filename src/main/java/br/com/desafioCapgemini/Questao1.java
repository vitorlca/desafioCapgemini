package br.com.desafioCapgemini;

public class Questao1 {

	public int mediana (int a, int b, int c, int d, int e) {
		
		int[] listaNumeros = new int[5];
		
			listaNumeros[0] = a;
			listaNumeros[1] = b;
			listaNumeros[2] = c;
			listaNumeros[3] = d;
			listaNumeros[4] = e;
		
		int posicaoNumero = ((listaNumeros.length + 1) / 2) -1;
		
		return listaNumeros[posicaoNumero];

	}

}
