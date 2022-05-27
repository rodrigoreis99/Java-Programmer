package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rodrigo");
		pessoa.setIdade(27);
		pessoa.setSexo(Sexo.MASCULINO);
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		//instancia da classe funcionario
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(45);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Analista Field Service");
		funcionario.setSalario(1500);
		JOptionPane.showMessageDialog(null, funcionario.mostrar());

//		Curso novoCurso = new Curso();
//		novoCurso.setCodigo(222);
//		novoCurso.setDescricao("Java Programmer");
//		novoCurso.setCargaHoraria(100);
//		novoCurso.setPreco(1000);
				
		
		//instancia classe aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Goku");
		aluno.setIdade(87);
		aluno.setSexo(Sexo.MASCULINO);
		aluno.setMatricula(123);
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
		aluno.setCurso( new Curso(111,"Java Programer", 100, 1000));
	}
	
}
