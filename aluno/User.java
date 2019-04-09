package aluno;

public class User {

	public static void main(String[] args) throws Exception {
		Aluno x = new Aluno("ze",9,8,6);
    	System.out.println(x);
    	
    	Aluno y;          	// ‘y’ é apenas uma referência
    	y = new Aluno();  	// ‘y’ agora é um objeto, isto é, 
					// aponta para uma alocação de memória feita pelo construtor
    	y.setNotas(8,10);     // o acesso aos seus membros privados ocorre somente
    	y.setNome("maria");   // por intermédio dos métodos de interface ou contrutores
    	System.out.println(y);

	}

}
