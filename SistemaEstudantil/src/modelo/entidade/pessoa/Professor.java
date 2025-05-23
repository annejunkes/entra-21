package modelo.entidade.pessoa;

import classes.Turma;
import modelo.entidade.pessoa.empregado.Empregado;

public class Professor extends Empregado{
	
	private Turma turma;
	
	public Professor (String nome, String sobrenome, String cpf, float salario) {
		super(nome,sobrenome,cpf,salario);
	}
	
	public Professor (String nome, String sobrenome, String cpf, float salario, Turma turma) {
		super(nome,sobrenome,cpf,salario);
		setTurma(turma);
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma=turma;
	}
	
	
	public float calcularSalario() {
		return getSalario() + 500;
	}
	
	public void efetuarChamada() {
		
		System.out.println("Pessoal, vamos responder a chamada!");
		
	}

}
