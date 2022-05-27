package br.com.impacta.inteiros;

public class VariaveisShort {
	public static void main(String[] args) {
		
		//criar variavel
		//tipo > nome> valor
		short idade = 28;  // -128 a 127
		short idade2 = 30;
		
		
		
		//somando as duas idades, e armazenando em uma terceira variavel
		short soma = (short)(idade + idade2);//typecast
		System.out.println("Soma das idades: " + soma);
		
		
	}
}
