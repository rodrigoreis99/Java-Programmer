package br.com.impacta.interfaces;

import javax.swing.JOptionPane;

//interface � abstrato por defini��o
public interface Figura {

	// todos os metodos de uma interface sao publicos abstratos por defini��o

	double calcularArea();

	// todos os atributos de uma interface sao publicos, estaticos e
	// constante(final), por defini��o

	// public static final
	String AUTOR = "Equipe impacta. ";

	
	//m�todo default = metodo definido na interface, acessivel por todos os objetos de todas as classes que implementarem
	default String apresentarFigura() {

		String resposta = "Classe: " + this.getClass().getSimpleName() + "\nArea: " + this.calcularArea();
		
		return resposta;
		
		//this � uma referencia ao objeto da classe que vai implementar
	}

}
