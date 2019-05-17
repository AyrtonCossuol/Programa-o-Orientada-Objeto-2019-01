import java.util.Scanner;

public class Uso {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		int escolha, numeroCelular;
		String nome, email, endereco;
		double rendaFamiliar;
		
		Contato[] vet = new Contato[50];
		
		
		for(int i = 0; i < 50 ; i++){
			System.out.println("Entre com 1 se deseja Cliente\nEntre com 2 se deseja Contato: ");
			escolha = new Scanner(System.in).nextInt();
			Contato x = null;
			
			if(escolha == 1){
				System.out.println("Entre com o nome: ");
				nome = new Scanner(System.in).next();
				while(true){
					System.out.println("Entre com o email: ");
					email = new Scanner(System.in).next();
					try{
						if(Email.isEmailValido(email)){
							break;
						}
					}catch (Exception e){
						System.out.println("Email invalido. Deve conter @: ");
					}
				}
				System.out.println("Entre com o numero de celular: ");
				numeroCelular = new Scanner(System.in).nextInt();
				System.out.println("Entre com o endereco: ");
				endereco = new Scanner(System.in).next();
				System.out.println("Entre com a renda familiar: ");
				rendaFamiliar = new Scanner(System.in).nextDouble();
				try{
					x = new Cliente(nome, email, numeroCelular, endereco, rendaFamiliar);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(escolha == 2){
				System.out.println("Entre com o nome: ");
				nome = new Scanner(System.in).next();
				while(true){
					System.out.println("Entre com o email: ");
					email = new Scanner(System.in).next();
					try{
						if (Email.isEmailValido(email)) {
							break;
						}
					}catch(Exception e){
						System.out.println("Email invalido. Deve conter @: ");
					}
				}
				
				try{
					x = new Contato(nome, email);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			vet[i] = x;
		}
		
		for(int j = 0 ; j < 50 ; j++){
			System.out.println(vet[j].toString());
		}
	}

}
