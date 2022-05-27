package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_soma {
	
	//perguntar para o usuario quantos numeros ele deseja
	// essa quantidade devera ser armazenado em uma variavel
	//perguntar para o usuario quantos irmãos ele tem e armazenar em uma variavel
	//perguntar ao usuário qual cidade ele mora
	//perguntar qual salario, incluindo os centavos, armazenar em uma variavel chamada salario
	// declarar uma variavel do tipo String chamada Status
	//se o salario informado foi maior qu R$6.000,00
	//esta variavel deve armazenar "voce esta acima da media"
	//caso contratrio, voce esta dentro da media
	
	
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros voce deseja? "));
		int irmaos = Integer.parseInt(JOptionPane.showInputDialog("Quantos irmãos voce tem? "));
		String cidade = (JOptionPane.showInputDialog("Qual cidade você mora? "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário ? "));
		String status; 
		
		if(salario > 6000) {
			status ="você esta acima da média ";
		}else {
			status = "Voce esta dentro da média ";
		}
		
		
		
		String resposta = "os numeros desejados foram: " + numero +
						"\n a quantidade de irmão é: " + irmaos +
						"\n sua Cidade é: " + cidade;
		System.out.println(status);
		System.out.println(resposta);
	}
}
