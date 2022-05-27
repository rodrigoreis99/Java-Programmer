package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rodrigo R");
		funcionario.setIdade(28);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Aluno");
		funcionario.setSalario(100000);
		funcionario.setDocumento( new DocumentoCpf());
		
		
	}
	
}
