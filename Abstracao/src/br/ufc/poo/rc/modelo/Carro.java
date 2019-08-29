package br.ufc.poo.rc.modelo;

public class Carro {
	public String modelo;
	public String cor;
	public int ano;
	public int velocidade;
	
	public Carro() {
		this.modelo = "Celta";
		this.cor = "Preto";
		this.ano = 2018;
		this.velocidade = 0;
	}
	/*public Carro(String modelo, String cor, int ano, int velocidade) {
		this.modelo = 
	}*/
	
	public void acelerar() {
		this.velocidade += 10;
	}
	public void buzinar() {
		System.out.println("Fon fon");
	}
	public void frear () {
		this.velocidade -= 10;
	}
	public void darPartida() {
		System.out.println("O carro ligou!!!");
	}
	public void desligar() {
		System.out.println("O carro desligou!!!");
		this.velocidade -= 10;
	}
	public static int contarCarrosDeUmAno(Carro vetor[], int ano) {
		int cont = 0;
		for(Carro c : vetor) {
			if(c.ano == ano)cont++;
		}
		return cont;
	
	
	
	
	
	}
}
