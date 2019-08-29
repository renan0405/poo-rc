package br.ufc.poo.rc.exec;
import br.ufc.poo.rc.modelo.Aluno;
public class Principal {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setCurso("RC");
		aluno.setNome("Renan");
		aluno.setIdade(20);
		aluno.setIra(10);
		//aluno.estudar("POO");
		//aluno.matricular ("PROBABILIDADE");
		
		System.out.println("O nome do Aluno:");
		System.out.println(aluno.getNome());
		System.out.println(aluno);
		
	}


		

	
}

	
