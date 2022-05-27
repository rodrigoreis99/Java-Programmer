package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	
	public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usuário fornece uma certa quantidadae de numeros.
		 * a entrega de dados termina quando o usuario digitar o numero 0
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de numeros informados
		 */
		
		int quantidade = 0;
		int soma = 0;
		
		while(true) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero. "));
			
			if(numero == 0) {
				break; //interrompe a estrutura de repetição
			}
			
			if(numero < 0 ) {
				continue; // próxima instrução, onde estiver o continue ele não faz nada abaixo dele, continua para o inicio 
			}
			
			System.out.println(numero);
			soma += numero;
			quantidade ++;
		}
		
		
		System.out.println("A soma dos numeros informados: " + soma);
		System.out.println("quantidade de numeros informados " + quantidade);
		
		//return sai do método
		//BReak interrompe a estrutura de repetição
		//Continue, volta a repetição do inicio
	}

}
