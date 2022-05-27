package br.com.impacta.incdec;

public class OperadoresIncrementais {
	
	public static void main(String[] args) {
		int numero = 10;
		System.out.println("numero " + numero);
		
		
		numero++;
		System.out.println("numero " + numero);
		
		++numero;
		System.out.println("numero " + numero);
		
		// Instrutura(;)
		// Operação = Operadores como --, +, ++
		
		int x = numero ++;
		
		System.out.println();
		System.out.println("x " + x); //12
		System.out.println("numero " + numero); //13
		
		x = ++ numero;
		System.out.println("x " + x);
	}
}
