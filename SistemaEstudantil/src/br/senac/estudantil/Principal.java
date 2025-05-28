package br.senac.estudantil;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.professor.Professor;
import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Principal {


	public static void main(String[] args) {
		
		Empregado[] empregados = new Empregado[3];
		
		try {
		
		empregados[0]= new Professor("e", "Kubischeck", "188.134.222-45", 3000);
		
		
		empregados[1]= new Diretor("Juscelino", "Kubischeck", "188.134.222-45", 3000);
		
		empregados[2]= new Professor("Juscelino", "Kubischeck", "", 3000);
		
		for(Empregado empregado : empregados) {
			System.out.println(empregado.calcularSalario());
		}
		
		}
		catch(NomeInvalidoException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(SobrenomeInvalidoException e) {
			e.printStackTrace();
		}
		catch(CpfInvalidoException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("entrou");
		}
		
		
		

	}

}
