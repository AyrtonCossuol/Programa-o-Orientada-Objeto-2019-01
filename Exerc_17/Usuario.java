import java.util.Random;

public class Usuario {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		double vet_x[] = new double[50];
		double vet_y[] = new double[50];
		double vet_raio[] = new double[50];
		double vet_comp[] = new double[50];
		double vet_larg[] = new double[50];
		
		Circulo circ = null;
		Quadrado quad = null;
		for(int i = 0 ; i < 10 ; i++) {
			for (int j = 0 ; j < 10 ; j++) {
				vet_x[j] = gerador.nextDouble();
				vet_y[j] = gerador.nextDouble();
				vet_raio[j] = gerador.nextDouble();
				vet_comp[j] = gerador.nextDouble();
				vet_larg[j] = gerador.nextDouble();
			}
			if(i % 2 == 0){
				if(i >= 6){
					quad = new Retangulo(vet_x[i], vet_y[i], vet_comp[i], vet_larg[i], 0, false);
				}
				else{
					quad = new Quadrado(vet_x[i], vet_y[i], vet_comp[i], 0, false);
				}
				System.out.print(""+ (i+1) +": \n");
				System.out.println(quad.calculaArea());
				System.out.println(quad.calculaPerimetro());
			}
			else{
				circ = new Circulo(vet_x[i], vet_y[i], vet_raio[i], 0, false);
				System.out.print(""+ (i+1) +": \n");
				System.out.println(circ.calculaArea());
				System.out.println(circ.calculaPerimetro());
			}
			
		}
	}

}
