package exercicio11;

import java.util.Scanner;

public class Uso {

	public static void main(String[] args) throws Exception {
		final int QTDE = 3;
		Funcionario vetor[] = new Funcionario[QTDE];
		String nome, identidade, dtNascStr, dtAdmStr, depto, dtPromoStr;
		float salario;
		int opcao;

		for(int i=0; i < QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1)Funcionario, (2)Chefe, (3)Diretor: ");
			opcao = new Scanner(System.in).nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).next();
					System.out.println("Identidade: ");
					identidade = new Scanner(System.in).next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = new Scanner(System.in).next();
					System.out.println("Data admissao: ");
					dtAdmStr = new Scanner(System.in).next();
					System.out.println("Salario: ");
					salario = new Scanner(System.in).nextFloat();
					vetor[i] = new Funcionario(nome, identidade, dtNascStr,dtAdmStr, salario);
					break;
				case 2: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).next();
					System.out.println("Identidade: ");
					identidade = new Scanner(System.in).next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = new Scanner(System.in).next();
					System.out.println("Data admissao: ");
					dtAdmStr = new Scanner(System.in).next();
					System.out.println("Salario: ");
					salario = new Scanner(System.in).nextFloat();
					System.out.println("Departamento: ");
					depto = new Scanner(System.in).next();
					vetor[i] = new Chefe(nome, identidade, dtNascStr, dtAdmStr, salario, depto);
					break;
				case 3: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).next();
					System.out.println("Identidade: ");
					identidade = new Scanner(System.in).next();
					System.out.println("Data nascimento (dd/mm/aaaa): ");
					dtNascStr = new Scanner(System.in).next();
					System.out.println("Data admissao: ");
					dtAdmStr = new Scanner(System.in).next();
					System.out.println("Salario: ");
					salario = new Scanner(System.in).nextFloat();
					System.out.println("Departamento: ");
					depto = new Scanner(System.in).next();
					System.out.println("Data promocao: ");
					dtPromoStr = new Scanner(System.in).next();
					vetor[i] = new Diretor(nome, identidade, dtNascStr, dtAdmStr, salario, depto, dtPromoStr);
					break;
				default:
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		System.out.println("\nTaxa de reajuste: ");
		float taxa = new Scanner(System.in).nextFloat();

		for(int i=0; i < QTDE; i++) {
			vetor[i].setReajuste(taxa);
		}

		for(int i=0; i < QTDE; i++) {
			System.out.println("\n" + vetor[i].toString());
			System.out.println("Max emprestimo: " + vetor[i].emprestimo());
		}
	}

}
