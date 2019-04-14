package ponto;

public class Ponto {
	private double x , y;
	private final static double LIMSUPERIOR = 500;
	private final static double LIMINFERIOR = 0;
	private static double limSuperior = Ponto.LIMSUPERIOR;
	private static double limInferior = Ponto.LIMINFERIOR;
	
	// Quatro construtores sobrecarregados
	public Ponto(double x, double y) throws Exception{
		this.setPonto(x,y);
	}
	public Ponto(String coord) throws Exception{
		double coordX, coordY;
		int aux1, aux2;
		
		aux1 = coord.indexOf(1);
		coordX = Double.parseDouble(coord.substring(aux1, aux1 + 1));
		aux2 = coord.indexOf(3);
		coordY = Double.parseDouble(coord.substring(aux2, aux2 + 1));
		setPonto(coordX, coordY);
	}
	
	public Ponto() throws Exception{
		setPonto(0,0);
	}
	
	//Método de interfaces gets
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getLimSuperior(){
		return Ponto.limSuperior;
	}
	
	public double getLimInferior(){
		return Ponto.limInferior;
	}
	
	//Método de interfaces gets
	public static void setLimSuperior(double limSuperior){
		Ponto.limSuperior = limSuperior;
	}
	
	public static void setLimInferior(double limInferior){
		Ponto.limInferior = limInferior;
	}
	
	public void setPonto(double x, double y) throws Exception{
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(double x) throws Exception{
		if(x >= Ponto.limInferior && x <= Ponto.limSuperior){
			this.x = x;
		}else{
			throw new Exception("Erro");
		}
	}
	
	public void setY(double y) throws Exception{
		if(y >= Ponto.limInferior && y <= Ponto.limSuperior){
			this.y = y;
		}else{
			throw new Exception("Erro");
		}
	}
	
	//Método equals para a verificação de pontos semelhantes
	public boolean equals(Object objeto){
		Ponto aux = (Ponto)objeto;
		if(this.x == aux.x || this.y == aux.y) return true;
		else return false;
	}
	
	//Método clonar duplica os pontos passados
	public Ponto clonar() throws Exception{
		Ponto clone = new Ponto(this.getX(), this.getY());
		return clone;
	}
	
	//Método swap troca o valor de X com Y
	public Ponto criaSwap() throws Exception{
		Ponto ponto = new Ponto(this.getY(), this.getX());
		return ponto;
	}
	
	//Método que verifica se existe semelhança no eixo X ou no eixo Y
	public static boolean isTemEixoComum(Ponto P){
		if (Math.abs(P.getX()) == Math.abs(Uso.pontoArg.getX()) || Math.abs(P.getY()) == Math.abs(Uso.pontoArg.getY())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Métodos distancias sobrecarregados 
	public static double distancia(Ponto P) {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow((P.getX() - ((Ponto) Uso.pontoArg).getX()),2) + Math.pow((P.getY() - ((Ponto) Uso.pontoArg).getY()),2));
		return dist;
	}
	
	public static double distancia(double x1,double y1) throws Exception{
		double dist = 0.0;
		Ponto P = new Ponto(x1,y1);
		dist = Math.sqrt(Math.pow((P.getX() - Uso.pontoArg.getX()),2) + Math.pow((P.getY() - Uso.pontoArg.getY()),2));
		return dist;
	}
	public double distancia(double x1,double y1,double x2,double y2) throws Exception{
		double dist = 0.0;
		Ponto P = new Ponto(x1,y1);
		Ponto P2 = new Ponto(x2,y2);
		dist = Math.sqrt(Math.pow((P.getX() - P2.getX()),2) + Math.pow((P.getY() - P2.getY()),2));
		return dist;
	}
	public static double distancia(Ponto P,Ponto P2) {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow((P.getX() - P2.getX()),2) + Math.pow((P.getY() - P2.getY()),2));
		return dist;
	}
	
	//Método que calcula a distancia do ponto até a origem
	public static double distanciaDaOrigem() {
		double dist = 0.0;
		dist = Math.sqrt(Math.pow(Uso.pontoArg.getX(),2) + Math.pow(Uso.pontoArg.getY(),2));
		return dist;
	}
	
	//Método que compara dois objetos em relação a sua distancia até a origem
	public static int compareTo(Ponto P) throws Exception{
		double dist1 = Ponto.distanciaDaOrigem(),dist2 = Ponto.distanciaDaOrigem();
		if (dist1 > dist2) {
			return 1;
		}
		if (dist2 < dist2) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	//Método para conversão em string com o formato "(x,y)"
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(this.getX());
		dado.append(",");
		dado.append(this.getY());
		dado.append(")");
		return dado.toString();
	}
}
