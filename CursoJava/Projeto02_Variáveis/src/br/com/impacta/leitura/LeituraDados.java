package br.com.impacta.leitura;

import javax.swing.JOptionPane;


public class LeituraDados {
	
	public static void main(String[] args) {
		
		String usuario = JOptionPane.showInputDialog( "Qual ? o seu Nome? ");
		//JOptionPane.showMessageDialog(null, "Ol? " + usuario + " seja bem vindo ao JavaProgrammer");
		System.out.println("Seu nome: " + usuario);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade " + usuario + "?"));
		//JOptionPane.showMessageDialog(null, usuario + " voc? tem " + idade );
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura? " + usuario));
		//JOptionPane.showMessageDialog(null, usuario + "voc? tem" + altura + "cm de altura");
		
		
		//Resposta Unificada
		String resposta = "Seu nome ?: " + usuario + " \n a sua idade ?: " + idade + "\n sua altura ? " + altura;
				JOptionPane.showMessageDialog(null, resposta);
	}

}
