package br.com.impacta.aplicacao;

public class AppArray01 {

		//definindo um array de inteiros - parte 1 
	
	public static void main(String[] args) {
		int[] numeros = new int [5];
		
		//atribuir valores individualmente
		
		numeros [0] = 20;
		numeros [1] = 30;
		numeros [2] = 10;
		numeros [3] = 90;
		numeros [4] = 8;
		
//		System.out.println(numeros[0]);
//		System.out.println(numeros[4]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
	}
	
}
