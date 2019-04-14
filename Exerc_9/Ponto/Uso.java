package ponto;

import java.util.Scanner;
import java.util.Random;

public class Uso {
	public static Ponto pontoArg;
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		Uso.pontoArg = new Ponto(3,5);
		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();
		double x, y, dist = 0;
		int i=0, compare = 0;
		String stringPonto = "";
		
		
		System.out.println("Entre com a coordenada X do ponto: ");
		x = scanner.nextDouble();
		System.out.println("Entre com a coordenada Y do ponto: ");
		y = scanner.nextDouble();
		ponto1.setPonto(x,y);
		//compare = Ponto.compareTo(ponto1);
		//System.out.println(+compare);
		//dist = Uso.pontoArg.distanciaDaOrigem();
		//System.out.println(+dist);
		//System.out.println("Os pontos possuem eixos comuns?\n"+Uso.pontoArg.temEixoComum(ponto1));
		//ponto2 = Ponto.criaSwap(ponto1);
		//System.out.println(ponto2);
		//ponto2 = Ponto.clonar(ponto1);
		//System.out.println(ponto2);
		//stringPonto = ponto1.toString();
		//System.out.println(stringPonto);
		//dist = Ponto.distancia(x,y);
		//System.out.println(+dist);
		//System.out.println("As datas sao iguais?\n "+ponto1.equals(Uso.pontoArg));
		/*while(i < 100) {
			x = gerador.nextDouble();
			y = gerador.nextDouble();
			Ponto ponto = new Ponto(x,y);
			dist = Ponto.distancia(ponto,ponto1);
			System.out.println("A distancia do ponto: "+(i+1)+" e: "+dist);
			i++;
		 }*/

	}

}
