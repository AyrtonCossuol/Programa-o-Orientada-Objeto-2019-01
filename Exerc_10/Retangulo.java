
public class Retangulo extends Ponto {	
	private Ponto p1;	//Esquerdo superior
	private Ponto p2;	//Direito inferior
	
	public Retangulo(Ponto p1, Ponto p2) throws Exception {
		this.setRetangulo(p1,p2);
	}
	
	public Retangulo(double x1, double y1, double x2, double y2) throws Exception {
		Ponto ponto1 = new Ponto(x1,y1);
		Ponto ponto2 = new Ponto(x2,y2);
		this.setRetangulo(ponto1,ponto2);
	}
	
	public Retangulo() throws Exception {
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		this.setRetangulo(ponto1, ponto2);
	}
	
	public Ponto getP1() {
		return this.p1;
	}
	
	public Ponto getP2() {
		return this.p2;
	}
	
	public void setRetangulo(Ponto p1, Ponto p2) throws Exception {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public static double ladoX(Ponto p1, Ponto p2) {
		double comprimento = Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()));
		return comprimento;
	}
	
	public static double ladoY(Ponto p1, Ponto p2) {
		double comprimento = Math.sqrt((p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
		return comprimento;
	}
	
	public static double areaRet(Ponto p1, Ponto p2) {
		double area = ladoX(p1,p2) * ladoY(p1,p2);
		return area;
	}
	
	public boolean equals(Object objeto) {
		Retangulo aux = (Retangulo)objeto;
		if(this.getP1().equals(aux.getP1()) &&
			this.getP2().equals(aux.getP2())) {
			return true;
		}
		return false;
	}
	
	public boolean equalsArea(Object objeto) {
		Retangulo aux = (Retangulo)objeto;
		if(Retangulo.areaRet(this.getP1(),this.getP2()) == 
			Retangulo.areaRet(aux.getP1(),aux.getP2()) ) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Retangulo ret) {
		double area1 = Retangulo.areaRet(this.getP1(), this.getP2());
		double area2 = Retangulo.areaRet(ret.getP1(), ret.getP2());
		if( area1 > area2 ) {
			return 1;
		}
		if( area1 < area2 ) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return p1.toString() + " - " + p2.toString();
	}
}
