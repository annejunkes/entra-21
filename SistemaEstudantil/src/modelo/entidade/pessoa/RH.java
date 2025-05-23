package modelo.entidade.pessoa;

import modelo.entidade.pessoa.empregado.Empregado;

public interface RH {
	
	public abstract void contratarEmpregado(Empregado empregado);
	public abstract void demitirEmpregado(Empregado empregado);
	
	

}
