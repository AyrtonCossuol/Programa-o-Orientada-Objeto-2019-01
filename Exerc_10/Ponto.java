
import java.lang.Object;

public class Ponto {
	private double x, y;
	private static final double LIMITEINFERIOR = 0;
	private static final double LIMITESUPERIOR = 500;
	private static double limInferior = LIMITEINFERIOR;
	private static double limSuperior = LIMITESUPERIOR;
	

	public Ponto(double x, double y) throws Exception {
		this.setPonto(x,y);
	}

	public Ponto(String coordenada) throws Exception {
		double x, y;
		x = Double.parseDouble(coordenada.substring(1,2));
		y = Double.parseDouble(coordenada.substring(3,4));
		this.setPonto(x,y);
	}	
	
	public Ponto() throws Exception {
		this(0,0);
	}	
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public static double getLimInferior() {
		return Ponto.limInferior;
	}
	
	public static double getLimSuperior() {
		return Ponto.limSuperior;
	}
	
	public static void setLimInferior(double limite) {
		Ponto.limInferior = limite;
	}
	
	public static void setLimSuperior(double limite) {
		Ponto.limSuperior = limite;
	}
	
	public void setPonto(double x, double y) throws Exception {
		setX(x);
		setY(y);
	}
	
	public void setX(double x) throws Exception {
		if( x > Ponto.getLimInferior() || x < Ponto.getLimSuperior() ) {
			this.x = x;
		}else {
			throw new Exception("Coordenada X inválida.");
		}
	}
	
	public void setY(double y) throws Exception {
		if( y > Ponto.getLimInferior() || y < Ponto.getLimSuperior() ) {
			this.y = y;
		}else {
			throw new Exception("Coordenada Y inválida.");
		}
	}
	
	public Ponto clonar() {
		Ponto ponto;
		try{
			ponto = new Ponto(getX(),getY());
		}
		catch(Exception e){
			return null;
		}
		return ponto;
	}
	
	public void criaSwap() {
		double aux = getX();
		this.x = getY();
		this.y = aux;
	}
	
	public boolean temEixoComum(Object objeto) {
		Ponto aux = (Ponto)objeto;
		if( this.getX() == (aux.getX()) ||
				this.getY() == (aux.getY())) {
			return true;
		}
		return false;
	}
	
	public double distancia(Ponto ponto) {
		double d = Math.sqrt((this.getX()-ponto.getX())*(this.getX()-ponto.getX())+(this.getY()-ponto.getX())*(this.getY()-ponto.getX()));
		return d;
	}
	
	public double distancia(double x, double y) {
		double d = Math.sqrt((this.getX()-x)*(this.getX()-x)+(this.getY()-y)*(this.getY()-y));
		return d;
	}
	
	public static double distancia(double x1, double y1, double x2, double y2) {
		double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d;
	}
	
	public static double distancia(Ponto p1, Ponto p2) {
		double d = Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
		return d;
	}
	
	public double distanciaDaOrigem() {
		double d = Math.sqrt((this.getX())*(this.getX())+(this.getY())*(this.getY()));
		return d;
	}
	
	public boolean equals(Object objeto) {
		Ponto aux = (Ponto)objeto;
		if( this.getX() == (aux.getX()) &&
				this.getY() == (aux.getY())) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Ponto p2) throws Exception{
		double distanciaP1 = this.distanciaDaOrigem();
		double distanciaP2 = p2.distanciaDaOrigem();
		if( distanciaP1 > distanciaP2 ) {
			return 1;
		}
		if( distanciaP1 < distanciaP2 ) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getX());
		dados.append(",");
		dados.append(this.getY());
		dados.append(")");
		return dados.toString();
	}

	
}
