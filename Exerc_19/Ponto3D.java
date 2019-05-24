
public class Ponto3D extends Ponto{
	private double z;
	
	public Ponto3D(double x,double y,double z) throws Exception{
		super(x, y);
		this.setZ(z);
	}
	public double getZ() {
		return this.z;
	}
	public void setZ(double z) throws Exception{
		if(super.isLimite(z)) 	
			this.z = z;
		else
			throw new Exception ("Valor de x fora dos limites");
	}
	public Ponto clonar() throws Exception {
		return new Ponto3D(super.getX(), super.getY(), this.getZ());
	}
	public Ponto criaSwap() throws Exception {
		return new Ponto3D(super.getY(), super.getX(), this.getZ());
	}
	public boolean temEixoComum(Ponto3D ponto){
		return super.getX() == ponto.getX() || super.getY() == ponto.getY() || this.getZ() == ponto.getZ();
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("(");
		s.append(super.getX());
		s.append(",");
		s.append(super.getY());
		s.append(",");
		s.append(this.getZ());
		s.append(")");
		return s.toString();
	}
}
