package br.com.impacta.exercicios;

public class Ex03_SenhaAlfaNumerica {
	
	public static void main(String[] args) {
		/*
		 * Este programa deve gerar uma senha com 6 digitos
		 * onde cada digito senha um numero entre 0-9. A senha final é uma String
		 */
		
		String senha = "";
		
		for(int i = 0; i < 6; i++) {
		senha += (int)(Math.random() * 10);
		}
		
		System.out.println(senha);
	}
}
