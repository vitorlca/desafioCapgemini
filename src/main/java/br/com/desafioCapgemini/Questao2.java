package br.com.desafioCapgemini;


public class Questao2 {

	public int vetor(int a, int b, int c, int d, int e) {
		
		
		int vetor[] = new int[5];
		
		int x = 2;
		
		int contador =0;
		
		vetor[0] = a;
		vetor[1] = b;
		vetor[2] = c;
		vetor[3] = d;
		vetor[4] = e;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				int diferenca = vetor[i] - vetor[j];
				if (diferenca == x) {
					contador++;
				}
			}
		}
		
		return contador;

	}

}
