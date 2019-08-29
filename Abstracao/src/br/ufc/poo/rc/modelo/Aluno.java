package br.ufc.poo.rc.modelo;

public class Aluno {
	private String nome;
	private int idade;
	private String curso;
	private double ira;
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0) {
		this.idade = idade;
		} else {
			System.out.println("idade invalida");
		}
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		if (curso == "RC" || curso == "SI" || curso == "ES" || curso == "CC" || curso == "ES" || curso == "DD") {
			this.curso = curso;
		}else {
			System.out.println("Curso invalido");
		}
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		if (ira > 0) {
			this.ira = ira;
		}else {
			System.out.println("Ira invalido");
		}
	}
	
	/*public void estudar(String disciplina) {
		System.out.println("Estou estudando \n"+disciplina);
		System.out.println("------------------");
	} 
	public void matricular(String disciplina) {
		System.out.println("Me matriculei em: \n"+disciplina);
		System.out.println("------------------");
		
		}*/

	@Override
	public String toString() {
		String informação;
		if (ira >= 8) {
		informação = "O nome do aluno é: "
				+this.nome+"\n";
		informação += "O curso de aluno é: "
				+this.curso+"\n";
		informação += "IRA: "
				+this.ira+"\n";
		return informação;
		} else {
			informação = "O nome do aluno é: "
					+this.nome+"\n";
			informação += "O curso de aluno é: "
					+this.curso+"\n";
			return informação;
			
		}
		
		
		}
}





























