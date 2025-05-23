package classes;

import modelo.entidade.pessoa.Aluno;
import modelo.entidade.pessoa.Professor;

public class Turma {
	
	private String codigo;
	private byte cargaHoraria;
	private Professor professor;
	private Aluno[] alunos;
	private final static byte TAMANHO_TURMA=10;
	private int quantidadeAlunos;
	
	public Turma(String codigo, byte cargaHoraria, Professor professor) {
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		setProfessor(professor);
		alunos = new Aluno[TAMANHO_TURMA];
		quantidadeAlunos=0;
	}
	
	public Turma(String codigo, byte cargaHoraria) {
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[TAMANHO_TURMA];
		quantidadeAlunos=0;
	}
	
	public Turma(String codigo) {
		setCodigo(codigo);
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria=cargaHoraria;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor=professor;
	}
	
	public boolean adicionarAluno(Aluno aluno) {
		
		if(TAMANHO_TURMA == quantidadeAlunos) {
			return false;
		}
		
		for(int i=0; i<TAMANHO_TURMA; i++) {
			
			if(alunos[i].getCpf().equals(aluno.getCpf())) {
			return false;
		}
		}
		
		alunos[quantidadeAlunos]=aluno;
		quantidadeAlunos++;
		
		
		return true;
	}
	
	public boolean removerAluno(Aluno aluno) {
		
		if(TAMANHO_TURMA == quantidadeAlunos) {
			return false;
		}
		
		for(int i=0; i<TAMANHO_TURMA; i++) {
			
			if(alunos[i].getCpf().equals(aluno.getCpf())) {
			alunos[i]=null;
			quantidadeAlunos--;
			
			return true;
		}
		}
	}
		
		private Aluno[] reorganizarVetor(Aluno[] alunos) {
			return null;
		}
		
		alunos[quantidadeAlunos]=aluno;
		quantidadeAlunos++;
		
		
		return true;
	}
	
	

}
