package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppFiguras {
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		ret.setBase(12);
		ret.setAltura(23);
		
		Circulo cir = new Circulo();
		cir.setRaio(5);
		
		//apresentar os dados
		
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
		
		
	}
	
	
	
}
