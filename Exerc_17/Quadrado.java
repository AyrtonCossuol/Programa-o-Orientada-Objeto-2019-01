
public class Quadrado {
	private Ponto ponto;
	private double comprimento;
	private double espessura;
	private boolean solido;
	
	public Quadrado() {
		this.setPontoQuadrado(0, 0);
		this.setComprimento(0);
		this.setEspessura(0);
		this.setSolido(false);
	}
	public Quadrado(double a1, double a2, double comp, double espe, boolean value) {
		this.setPontoQuadrado(a1, a2);
		this.setComprimento(comp);
		this.setEspessura(espe);
		this.setSolido(value);
	}
	public Quadrado (Coordenada a1, Coordenada a2, double comp, double espe, boolean value) {
		this.setPontoQuadrado(a1, a2);
		this.setComprimento(comp);
		this.setEspessura(espe);
		this.setSolido(value);
	}
	public Quadrado (Ponto ponto, double comp, double espe, boolean value) {
		this.setPontoQuadrado(ponto);
		this.setComprimento(comp);
		this.setEspessura(espe);
		this.setSolido(value);
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	public Ponto getPontoQuadrado() {
		return this.ponto;
	}
	public double getEspessura() {
		return this.espessura;
	}
	public void setPontoQuadrado(double a1, double a2) {
		this.ponto = new Ponto(a1, a2);
	}
	public void setPontoQuadrado(Coordenada a1, Coordenada a2) {
		this.ponto = new Ponto(a1, a2);
	}
	public void setPontoQuadrado(Ponto ponto) {
		this.ponto = ponto;
	}
	public void setComprimento(double comp) {
		this.comprimento = comp;
	}
	public void setEspessura(double espe) {
		this.espessura = espe;
	}
	public void setSolido(boolean value) {
		this.solido = value;
	}
	public boolean isSolido() {
		return this.solido;
	}
	
	public double calculaArea() {
		return Math.pow(this.comprimento, 2);
	}
	public double calculaPerimetro() {
		return 4 * this.comprimento;
	}
	public boolean equals(Quadrado quad) {
		if (this.comprimento == quad.getComprimento() && this.espessura == quad.getEspessura() && 
				this.solido == quad.isSolido()) {
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
