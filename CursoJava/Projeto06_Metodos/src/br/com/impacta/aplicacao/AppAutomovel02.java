package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel02 {
	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel();  // 1
		auto1.lerDados("Honda", "Civic", 2021, "EBX1234");		
		Automovel auto2 = auto1;// 2 
		auto1 = null;
		
		auto2.setAno(2022);  // 3		
		JOptionPane.showMessageDialog(null, auto1.mostrar());
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
