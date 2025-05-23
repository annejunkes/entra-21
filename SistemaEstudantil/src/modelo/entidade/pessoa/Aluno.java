package modelo.entidade.pessoa;

import classes.Turma;

public class Aluno extends Pessoa{
	
	private int matricula;
	private Turma turma;
	
	
	
	//construtor usando set
	public Aluno (String nome, String sobrenome, String cpf, int matricula, Turma turma) {
		super(nome,sobrenome,cpf);
		setMatricula(matricula);
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula=matricula;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma=turma;
	}
	
	
	public void responderChamada() {
		
		System.out.println(nome + " está presente, professor querido!");
		
	}
	

}
