
public class Retangulo extends Quadrado {
	private double largura;
	
	public Retangulo() {
		super(0, 0, 0, 0, false);
		this.setLargura(0);
	}
	public Retangulo (double a1, double a2, double comp, double larg, double espe, boolean value) {
		super(a1, a2, comp, espe, value);
		this.largura = larg;
	}
	public Retangulo (Coordenada a1, Coordenada a2, double comp, double larg, double espe, boolean value) {
		super(a1, a2, comp, espe, value);
		this.setLargura(larg);
	}
	public Retangulo (Ponto ponto, double comp, double larg, double espe, boolean value) {
		super(ponto, comp, espe, value);
		this.setLargura(larg);
	}
	
	public double getLargura() {
		return this.largura;
	}
	public void setLargura(double larg) {
		this.largura = larg;
	}
	
	public double calculaArea() {
		return this.getComprimento() * this.largura;
	}
	public double calculaPerimetro() {
		return 2 * this.getComprimento() + 2 * this.largura;
	}
	public boolean equals(Retangulo ret) {
		if (this.getComprimento() == ret.getComprimento() && this.getEspessura() == ret.getEspessura() && 
				this.isSolido() == ret.isSolido() && this.largura == ret.getLargura()) {
			return true;
		}
		return false;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Coordenada: " + this.getPontoQuadrado());
		dados.append("\nComprimento: " + this.getComprimento());
		return dados.toString();
	}
	
	
}
