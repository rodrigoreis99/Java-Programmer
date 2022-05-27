package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex02_Ingressos {
	public static void main(String[] args) {
		/* Em um clube, o valor do ingresso é cobrado de acordo com a idade
		 * 
		 * se a idade for monor que 18: R$ 20,00
		 * entre 18 a 59 anos R$ 30,00
		 * acima de 59 anos r$ 15,00
		 * 
		 * com base nessas informações escreva o programa que solicite a idade ao usuário
		 * em seguida apresente idade informada e valor do ingresso* 
		 */
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
		double ingresso;
		
		if(idade < 18) {
			ingresso = 20;
		}
		else if (idade >= 18 && idade <= 59) {
			ingresso = 30;
		}
		else {
			ingresso = 15;
		}
		
		//String resposta = "idade: " + idade +
		//					"\n Valor do ingresso: + ingresso";
		
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + 
											"\n e o valor do ingresso para sua idade é: " + ingresso );
	}
}
