package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCNPJ implements Documento {

	private String cnpj;

	
	
	
	public DocumentoCNPJ(String cnpj) {
		super();
		this.setNumero(cnpj);
	}
	@Override
	public void setNumero(String numero) {

		// express?o regular
		if (!numero.matches("[0-9]{14}")) {
			throw new NumberFormatException("O CNPJ deve ter 14 digitos");
		}

		this.cnpj = numero;

	}
	@Override
	public String getNumero() {
		return this.cnpj;
	}

}
