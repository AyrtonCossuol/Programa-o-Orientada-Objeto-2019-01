
public class Ponto {
	private Coordenada c1, c2;
	
	public Ponto() {
		this.setPonto(0,0);
	}
	public Ponto(double c1) {
		this.setPonto(c1,0);
	}
	public Ponto(double c1, double c2) {
		this.setPonto(c1,c2);
	}
	public Ponto(Coordenada c1, Coordenada c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public Coordenada getC1() {
		return this.c1;
	}
	public Coordenada getC2() { 
		return this.c2;
	}
	public void setPonto(double c1, double c2) {
		this.c1 = new Coordenada(c1);
		this.c2 = new Coordenada(c2);
	}
	public void setPonto(Coordenada c1, Coordenada c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean equals(Ponto ponto) {
		if (this.c1 == ponto.getC1() && this.c2 == ponto.getC2()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Ponto: ("+c1+","+c2+")");
		return dados.toString();
	}
}
