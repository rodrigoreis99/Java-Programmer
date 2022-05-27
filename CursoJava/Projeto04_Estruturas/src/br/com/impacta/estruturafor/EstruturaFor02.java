package br.com.impacta.estruturafor;
import javax.swing.JOptionPane;

public class EstruturaFor02 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas na sala? "));

		int maior = 0;
		int posicao = 0;

		for (int i = 1; i <= quantidade; i++) {

			String pergunta = "Pessoa " + i + "\n Qual a idade da pessoa " + i + "?";
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

			//System.out.println("a idade atual: " + idade);
			
			if (idade > maior) {
				maior = idade;
				posicao = i;
			}

		}
		
		String resposta = "Maior idade: " + maior + "\n Pessoa: " + posicao;
		JOptionPane.showMessageDialog(null, resposta);
	}

}
