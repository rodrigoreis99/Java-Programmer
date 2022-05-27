package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {

	public static void main(String[] args) {
		
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
		
		double desconto = 0;
		
		if(salario > 5000) {
			desconto = (salario - 5000) * 10 / 100;
		}
		
		String resposta = "Salário bruto: " + salario
						+ "\nDesconto: " + desconto 
						+ "\nSalario Liquido: " + (salario - desconto); 
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
	
	
}
