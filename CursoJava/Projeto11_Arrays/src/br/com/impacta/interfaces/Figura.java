package br.com.impacta.interfaces;

import javax.swing.JOptionPane;

//interface é abstrato por definição
public interface Figura {

	// todos os metodos de uma interface sao publicos abstratos por definição

	double calcularArea();

	// todos os atributos de uma interface sao publicos, estaticos e
	// constante(final), por definição

	// public static final
	String AUTOR = "Equipe impacta. ";

	
	//método default = metodo definido na interface, acessivel por todos os objetos de todas as classes que implementarem
	default String apresentarFigura() {

		String resposta = "Classe: " + this.getClass().getSimpleName() + "\nArea: " + this.calcularArea();
		
		return resposta;
		
		//this é uma referencia ao objeto da classe que vai implementar
	}

}
