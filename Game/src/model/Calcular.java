package model;

import java.util.Random;

public class Calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int opracao;
	private int resultado;
	
	
	public Calcular(int dificuldade) {
		
		Random rand = new Random();
		
		this.opracao = rand.nextInt(3);
		this.dificuldade = dificuldade;
		
		if(dificuldade == 1) {
			//facil
			this.valor1 = rand.nextInt(10);
			this.valor2 = rand.nextInt(10);
		}
		else if(dificuldade == 2){
			//Medio
			this.valor1 = rand.nextInt(100);
			this.valor2 = rand.nextInt(100);
		}
		else if(dificuldade == 3){
			//dificil
			this.valor1 = rand.nextInt(1000);
			this.valor2 = rand.nextInt(1000);
		}
		else if(dificuldade == 4){
			//insano
			this.valor1 = rand.nextInt(10000);
			this.valor2 = rand.nextInt(10000);
		}else {
			//ultra
			this.valor1 = rand.nextInt(100000);
			this.valor2 = rand.nextInt(100000);
		}
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}


	public int getOpracao() {
		return opracao;
	}
	
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public String toString() {
		String op;
		if(this.getOpracao() == 0) {
			op = "Somar";
		}else if(this.getOpracao() == 1) {
			op = "Subtrair";
		}else if(this.getOpracao() == 2) {
			op = "Mutipilcar";
		}else {
			op = "Desconhecida";
		}
		return " Valor 1: " + this.getValor1() + 
				" Valor 2: " + this.getValor2() +
				" Dificuldade: " + this.getDificuldade() + 
				" Operação: " + op;
	}
	
	public boolean somar(int resposta) {
		this.resultado = this.valor1 + this.valor2;
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta Correta");
			certo = true;
		}else {
			System.out.println("Resposta errda");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	public boolean diminuir(int resposta) {
		this.resultado = this.valor1 + this.valor2;
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta Correta");
			certo = true;
		}else {
			System.out.println("Resposta errda");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	public boolean multiplicar(int resposta) {
		this.resultado = this.valor1 + this.valor2;
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta Correta");
			certo = true;
		}else {
			System.out.println("Resposta errda");
		}
		System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
}
