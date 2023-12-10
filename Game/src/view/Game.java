package view;

import java.util.Scanner;
import model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;
	
	public static void main(String[] args) {
		Game.jogar();
		
	}
	public static void jogar() {
		System.out.println("Informe o nivel de dificuldade desejado (1, 2, 3, ou 4)");
		
		int dificuldade =  Game.teclado.nextInt();
		
		Game.calc = new Calcular(dificuldade);
		
		System.out.println("Informe o resultado para a seguinte operação: ");
		
		//somar
		if(calc.getOpracao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			
			if(calc.somar(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s) ");
			}
		}
		
	}

}
