package application;

import entities.Casa;
import entities.Porta;

public class Program {

	public static void main(String[] args) {
		//Exercício do capítulo 4.14 (Programa 2 e 3)
		Casa casa = new Casa();
		casa.porta1 = new Porta();
		casa.porta2 = new Porta();
		casa.porta3 = new Porta();
		casa.porta1.cor = "Azul";
		casa.porta1.dimensaoX = 5;
		casa.porta1.dimensaoY = 12;
		casa.porta1.dimensaoZ = 2;
		casa.porta1.abre();
		casa.porta2.abre();
		casa.porta3.abre();
		System.out.println(casa.porta1.estaAberta());
		casa.porta1.pinta("Vermelho");
		casa.pinta("Roxo");
		System.out.println("A quantidade de portas abertas é: " + casa.quantasPortasEstaoAbertas());
	}

}
