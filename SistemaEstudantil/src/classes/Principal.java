package classes;

import modelo.entidade.pessoa.Professor;
import modelo.entidade.pessoa.empregado.Diretor;
import modelo.entidade.pessoa.empregado.Empregado;

public class Principal {


	public static void main(String[] args) {
		
		Empregado[] empregados = new Empregado[3];
		
		empregados[0]= new Professor("Juscelino", "Kubischeck", "188.134.222-45", 3000);
		
		empregados[1]= new Diretor("Juscelino", "Kubischeck", "188.134.222-45", 3000);
		
		empregados[2]= new Professor("Juscelino", "Kubischeck", "188.134.222-45", 3000);
		
		for(Empregado empregado : empregados) {
			System.out.println(empregado.calcularSalario());
		}
		
		
		

	}

}
