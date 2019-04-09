package aluno;

public class Aluno {
	private String nome;
  	private double nota1, nota2, media, pontos;
  	
  	static public double NOTAMAXIMA = 10.0;
 
  	// quatro construtores sobrecarregados
  	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) throws Exception {
        	this.setNome(_nome);
        	this.setNotas(_nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2, double _pontos) throws Exception {
        	this("sem nome", _nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2) throws Exception {
        	this(_nota1, _nota2, 0.0);
  	}
  	public Aluno() throws Exception {
        	this(0.0,0.0);
  	}
 
  	// métodos de interface para acesso aos campos privados
  	public String getNome() {      	
  	  	return this.nome;     
  	}
  	public void setNome(String _nome) {
        	this.nome = _nome; 	
  	}
  	public double getNota1() {
        	return this.nota1; 	
  	}
  	public double getNota2() {
        	return this.nota2; 	
  	}
  	public double getMedia() {
        	return this.media; 	
  	}
  	public double getPontos()  {
        	return this.pontos;	
  	}
  	public void setPontos(double _pontos) {
        	this.pontos = _pontos;
        	this.calculaMedia(10);
  	}
  	
  	//Metodo para alterar a nota maxima passada pelo usuario.
  	public static double notaMaxima(){
  		return Aluno.NOTAMAXIMA;
  	}
  	
  	//Metodo para verificar se a nota e maior que o limite permitido.
  	static public boolean verificarNotaLimite(double nota){
  		if(nota > Aluno.NOTAMAXIMA){
  			return false;
  		}
  		return true;
  	}
  	
  	public boolean equals(Object objeto) {
    	Aluno aux = (Aluno)objeto;
    	if (this.getNome().equals(aux.getNome()) &&
                	this.getNota1() == aux.getNota1() &&
                	this.getNota2() == aux.getNota2() &&
                	this.getPontos() == aux.getPontos())
          	return true;
    	return false;
	} 
 
  	// tratamento de erro ainda inadequado, será melhorado mais adiante
  	public void setNotas(double _nota1, double _nota2, double _pontos) throws Exception {
        	this.pontos = _pontos;
        	if(_nota1 >= 0 && _nota1 <= NOTAMAXIMA && _nota2 >= 0 && _nota2 <= NOTAMAXIMA) {
              	this.nota1 = _nota1;
              	this.nota2 = _nota2;
              	this.calculaMedia(10);
        	}
        	else
        		throw new Exception("nota invalida");
  	}
 
  	public void setNotas(double _nota1, double _nota2)throws Exception {
        	this.setNotas(_nota1, _nota2, 0);
  	}
 

  	// método para calcular a média. Privado pois o uso é apenas interno a classe
  	private double calculaMedia() {
        	this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
        	return this.media;
  	}
 
  	// sobrecarregamento do cálculo da média para limitar o valor máximo
  	private double calculaMedia(int _limite) {
        	this.calculaMedia();
        	if(this.media > _limite)
              	this.media = _limite;
        	return this.media;
  	}
 
  	public String toString(){
        StringBuilder dados = new StringBuilder();
    	dados.append(this.getNome());
        dados.append(";");
    	dados.append(this.getNota1());
    	dados.append(";");
    	dados.append(this.getNota2());
    	dados.append(";");
    	dados.append(this.getPontos());
    	dados.append(";");
    	dados.append(this.getMedia());
    	return dados.toString();
     }
}
