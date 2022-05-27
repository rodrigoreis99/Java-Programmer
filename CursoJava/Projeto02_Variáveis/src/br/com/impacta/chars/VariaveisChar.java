package br.com.impacta.chars;

import javax.swing.JOptionPane;

public class VariaveisChar {
	
	public static void main(String[] args) {
		
		char ch1 = 'x';
		char ch2 = 65;
		char ch3 = '\n'; // o caracter especial /n pula linha
		char ch4 = 27554;
				
		
		System.out.println("ch1: " + ch1);
		System.out.println(ch3); // pula linha
		System.out.println("ch2 " + ch2);
		System.out.println("ch4: " + ch4);
		
		
		
		JOptionPane.showMessageDialog(null, "ch4: " + ch4);
		
	}
}
