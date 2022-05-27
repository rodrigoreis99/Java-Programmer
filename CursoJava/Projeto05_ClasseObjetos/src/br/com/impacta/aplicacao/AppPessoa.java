package br.com.impacta.aplicacao;

import com.br.impacta.classes.Pessoa;

import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Rodrigo";
		pessoa.idade =  27;
		pessoa.sexo = Sexo.MASCULINO;
				

	}

}
