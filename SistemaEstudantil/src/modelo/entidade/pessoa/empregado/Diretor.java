package modelo.entidade.pessoa.empregado;

import modelo.entidade.pessoa.RH;
import modelo.entidade.pessoa.Situacao;

public class Diretor extends Empregado implements RH{

	
	
	public Diretor(String nome, String sobrenome, String cpf, float salario, Situacao situacao) {
		super(nome, sobrenome, cpf, salario, situacao);
	}
	
	public Diretor(String nome, String sobrenome, String cpf, float salario) {
		super(nome, sobrenome, cpf, salario);
	}
	
	public float calcularSalario() {
		return getSalario() + 1500;
	}
	
	public void contratarEmpregado(Empregado empregado) {
		empregado.setSituacao(Situacao.ATIVO);
	}
	
	public void demitirEmpregado(Empregado empregado) {
		empregado.setSituacao(Situacao.INATIVO);
		
	}
	

}
