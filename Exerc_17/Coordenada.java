
public class Coordenada {
	private double a;
	
	public Coordenada(double a) {
		this.setA(a);
	}
	public Coordenada() {
		this.setA(0);
	}
	
	public double getA() {
		return this.a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public boolean equals(Coordenada cord) {
		if (this.a == cord.getA()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Coordenada: " + a);
		return dados.toString();
	}
}
