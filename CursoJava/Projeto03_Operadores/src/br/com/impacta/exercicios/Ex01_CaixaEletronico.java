package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

/*
 * Um caixa eletronico possuia cedulas de 50,20,10,5
 * Escrever o programa para solicitar ao usuário o valor de saque. 
 * com base no valor, vamos apresentar a quantidade de cedulas dispensáveis, 
 * considerando que as cedulas de maior valor serão liberadas primeiro
 */


public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		
		//Solicitar o valor do saque
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque!"));
		
		//obter o calor como sendo inteiro
		
		int valorSaque = (int)valor; //typecast
		
		//Toda variavel devemos atribuir um valor
		int qtde50, qtde20,	qtde10, qtde5;
		qtde50 = qtde20 = qtde10 = qtde5 = 0;
		
		qtde50 = valorSaque / 50; //2 notas de 50
		valorSaque %= 50; //receber o resto da divisão e atribui no valor saque
		
		qtde20 = valorSaque / 20; //1 nota de 20
		valorSaque %= 20;
		
		qtde10 = valorSaque / 10; // 0 nota(s) de 10
		valorSaque %= 10;
		
		qtde5 = valorSaque / 5; //1 nota de 5
		
		String resposta = "Valor do Saque é: " + valor + 
				
				"\n  Notas de 50: " + qtde50 +
				"\n Notas de 20: " + qtde20 +
				"\n Notas de 10: " + qtde10 +
				"\n Notas de 5: " + qtde5;

		JOptionPane.showMessageDialog(null, resposta);
		
	
		
		
	}
}
