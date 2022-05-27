package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	
	public static void main(String[] args) {
	
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade."));
		
		//if = condição SE
		if(idade < 18) { // se a condição for verdadeira
			JOptionPane.showMessageDialog(null,"Menor de Idade");
		}else {
			JOptionPane.showMessageDialog(null,"Maior de Idade");
		}
			JOptionPane.showMessageDialog(null,"Idade fornecida " + idade);
		
	}
}
