package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_AdvinhaNumero {
	public static void main(String[] args) {
		int numero =(int)(Math.random() * 100)+1;
		
		int minimo = 1, maximo = 100;
		int tentativas = 0;
		
		while(true) {
			
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre "  + minimo + " e " + maximo));
			
			if(valor > maximo || valor < minimo) {
				JOptionPane.showMessageDialog(null, "Informe um número válido.");
				continue; //colta para o começo e pergunta de novo
			}
			
			tentativas++;
			
			if(valor < numero) {
				minimo = valor + 1;
			}
			else if(valor == numero){
				break;
			}
						
			else {
				maximo = valor -1;				
			}
		}
		
		String resposta = "Voce acertou em " + tentativas + " tentativas";
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}
}
