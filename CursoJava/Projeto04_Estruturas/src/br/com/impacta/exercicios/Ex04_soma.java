package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_soma {
	
	//perguntar para o usuario quantos numeros ele deseja
	// essa quantidade devera ser armazenado em uma variavel
	//perguntar para o usuario quantos irm�os ele tem e armazenar em uma variavel
	//perguntar ao usu�rio qual cidade ele mora
	//perguntar qual salario, incluindo os centavos, armazenar em uma variavel chamada salario
	// declarar uma variavel do tipo String chamada Status
	//se o salario informado foi maior qu R$6.000,00
	//esta variavel deve armazenar "voce esta acima da media"
	//caso contratrio, voce esta dentro da media
	
	
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros voce deseja? "));
		int irmaos = Integer.parseInt(JOptionPane.showInputDialog("Quantos irm�os voce tem? "));
		String cidade = (JOptionPane.showInputDialog("Qual cidade voc� mora? "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu sal�rio ? "));
		String status; 
		
		if(salario > 6000) {
			status ="voc� esta acima da m�dia ";
		}else {
			status = "Voce esta dentro da m�dia ";
		}
		
		
		
		String resposta = "os numeros desejados foram: " + numero +
						"\n a quantidade de irm�o �: " + irmaos +
						"\n sua Cidade �: " + cidade;
		System.out.println(status);
		System.out.println(resposta);
	}
}
