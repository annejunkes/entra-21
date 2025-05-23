package modelo.entidade.pessoa.empregado;

import modelo.entidade.pessoa.Pessoa;
import modelo.entidade.pessoa.Situacao;

public abstract class Empregado extends Pessoa{
	
	private float salario;
	private Situacao situacao;
	
	protected Empregado(String nome, String sobrenome, String cpf, float salario, Situacao situacao) {
		super(nome,sobrenome,cpf);
		setSalario(salario);
		setSituacao(Situacao.ATIVO);
	}
	
	protected Empregado(String nome, String sobrenome, String cpf, float salario) {
		super(nome,sobrenome,cpf);
		setSalario(salario);
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario=salario;
	}
	
	public Situacao getSituacao() {
		return situacao;
	}
	
	public void setSituacao(Situacao situacao) {
		this.situacao=situacao;
	}
	
	public abstract float calcularSalario();
	

}
