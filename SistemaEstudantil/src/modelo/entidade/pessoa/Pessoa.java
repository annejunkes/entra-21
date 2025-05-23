package modelo.entidade.pessoa;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	protected Pessoa(String nome, String sobrenome, String cpf) {
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
		
	}
	
	private String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	private String getSobrenome() {
		return sobrenome;
	}
	private void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}

}
