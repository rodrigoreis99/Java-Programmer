package br.com.impacta.classes;

import br.com.impacta.interfaces.Figura;

public class Circulo implements Figura{

		private double raio;

		public double getRaio() {
			return raio;
		}

		public void setRaio(double raio) {
			this.raio = raio;
		}

		
		public double calcularArea() {
		
			// PI * Raio ao quadrado
			                          //base     expoente
			return Math.PI * Math.pow(this.getRaio(), 2);
			
			
		}
		
	
}
