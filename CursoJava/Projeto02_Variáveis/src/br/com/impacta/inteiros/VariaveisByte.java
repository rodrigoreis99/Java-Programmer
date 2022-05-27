package br.com.impacta.inteiros;

public class VariaveisByte {
	public static void main(String[] args) {
		
		//criar variavel
		//tipo > nome> valor
		byte idade = 28;  // -128 a 127
		byte idade2 = 30;
		
		
		
		//somando as duas idades, e armazenando em uma terceira variavel
		byte soma = (byte)(idade + idade2);//typecast
		System.out.println("Soma das idades: " + soma);
		
		
	}
}
