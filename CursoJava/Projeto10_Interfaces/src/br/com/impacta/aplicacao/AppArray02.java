package br.com.impacta.aplicacao;

public class AppArray02 {

	public static void main(String[] args) {

		
		//definir array de inteiros implicitamente
		int[] numeros = {17,13,18,25,39,17};
		
		//apresentar os dados do array utilizando a estrutura for aprimorada (java 5.0)
		
		//elemento da coleção : coleção
		for( int elemento : numeros) {
			System.out.println(elemento);
		}

	}

}
