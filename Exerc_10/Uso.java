
import java.util.Scanner;

public class Uso {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		int cont = 0, menu;
		double x, y;
		String ponto="";
		Ponto p = new Ponto();
		
		/*	UTILIZAÇÃO DA CLASSE RETANGULO.JAVA
		Ponto p1 = new Ponto(2,4);
		Ponto p2 = new Ponto(6,8);
		Ponto p3 = new Ponto(2,4);
		Ponto p4 = new Ponto(7,8);
		Retangulo ret = new Retangulo(p1,p2);
		Retangulo ret2 = new Retangulo(p3,p4);
		
		System.out.println("Retangulo 1: " + ret.toString());
		System.out.println("Ret 1 - Comprimento Lado X: " + Retangulo.ladoX(p1,p2));
		System.out.println("Ret 1 - Comprimento Lado Y: " + Retangulo.ladoY(p1,p2));
		System.out.println();
		System.out.println("Retangulo 2: " + ret2.toString());
		System.out.println("Ret 2 - Comprimento Lado X: " + Retangulo.ladoX(p3,p4));
		System.out.println("Ret 2 - Comprimento Lado Y: " + Retangulo.ladoY(p3,p4));
		System.out.println();
		System.out.println("Area Retangulo 1: " + Retangulo.areaRet(ret.getP1(), ret.getP2()));
		System.out.println("Area Retangulo 2: " + Retangulo.areaRet(ret2.getP1(), ret2.getP2()));
		System.out.println();
		System.out.println("Equals: " + ret.equals(ret2));
		System.out.println("Equals Area: " + ret.equalsArea(ret2));
		System.out.println("Compara Retangulo: " + ret.compareTo(ret2));
		*/
			
		System.out.println("  1. Duas Coordenadas;");
		System.out.println("  2. String de Coordenada '(x,y)';");
		System.out.println("  0. Sair;");
		System.out.print("\n  Opção: ");
		menu = new Scanner(System.in).nextInt(); 
		System.out.println("");
		 
		while(menu!=0) {
			if(menu>2 || menu<0) {
				break;
			}
			while(cont != 3){
				try{
					if(menu==1) {
						System.out.print("    => Coordenada x: ");
					    x = new Scanner(System.in).nextDouble();  
					    System.out.print("    => Coordenada y: ");
					    y = new Scanner(System.in).nextDouble(); 
					    p.setPonto(x,y);
					}
					if(menu==2) {  
					    System.out.print("    => Coordenada '(x,y)': ");
					    ponto = new Scanner(System.in).next();  
					    p = new Ponto(ponto);
					}
					
					break;
				}
				catch(Exception e){
					cont ++;
					System.out.println("\n       ! Coordenada inválida !\n");
					p = new Ponto();
				}
			}
			 
			System.out.println("\n    => Ponto: "+p.toString()+"\n");

			System.out.println("  1. Duas Coordenadas;");
			System.out.println("  2. String de Coordenada '(x,y)';");
			System.out.println("  0. Sair;");
			System.out.print("\n  Opção: ");
			menu = new Scanner(System.in).nextInt(); 
			System.out.println("");			
		}
		
		System.out.print("\n      Saindo");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");	
		Thread.sleep(300);
	}
	
}
