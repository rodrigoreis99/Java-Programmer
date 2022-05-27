package br.com.impacta.estruturawhile;

public class EstruturaWhile02 {

	public static void main(String[] args) {
		
			
			int numero = (int)(Math.random() * 20);
			
			//faça
			do {
				System.out.println(numero++);
			}
			
			//enquanto
			while(numero < 10) ;
			System.out.println("--FIm do programa--");
		

	}

}
