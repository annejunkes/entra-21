package br.senac.estudantil;

import java.util.ArrayList;
import java.util.List;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.professor.Professor;
import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Principal {


	public static void main(String[] args) {
		
		
		
		List<Empregado> empregados = new ArrayList<>();
		
		try {
		
		empregados.add(new Professor("e", "Kubischeck", "188.134.222-45", 3000));
		
		empregados.add(new Diretor("Juscelino", "Kubischeck", "188.134.222-45", 3000));
		
		empregados.add(new Professor("Juscelino", "Kubischeck", "", 3000));

		
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
