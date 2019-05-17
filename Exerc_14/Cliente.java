
public class Cliente extends Contato{
	private int celular;
	private String endereco;
	private double rendaFamiliar;
	
	private final static double RENDAFAMILIAR = 2000.00;
	private static double rendaFamilia = Cliente.RENDAFAMILIAR;
	
	public Cliente(String nome, String email, int celular, String endereco, double rendaFamiliar) throws Exception{
		super(nome, email);
		this.setCelular(celular);
		this.setEndereco(endereco);
		this.setRendaFamiliar(rendaFamiliar);
	}
	
	public Cliente(){
		super();
		this.setCelular(0);
		this.setEndereco("");
		this.setRendaFamiliar(0.0);
	}
	
	public int getCelular() {
		return this.celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendaFamiliar() {
		return this.rendaFamiliar;
	}
	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}
	public double getRendaLimite() {
		return Cliente.rendaFamilia;
	}
	public void setRendaLimite(double rendaLimite) {
		Cliente.rendaFamilia = rendaLimite;
	}
	
	public String categoriaCliente(){
		if(this.getRendaFamiliar() > Cliente.rendaFamilia){
			return "Top";
		}
		else{
			return "Usual";
		}
	}
	
	public static String categoriaCliente(Cliente cliente){
		if(cliente.getRendaFamiliar() > Cliente.rendaFamilia){
			return "Top";
		}
		return "Usual";
	}
	
	public boolean equals(Object objeto){
		Cliente cliente = (Cliente)objeto;
		if(this.getNome() == cliente.getNome() && this.getDescricaoEmail() == cliente.getDescricaoEmail() 
				&& this.getCelular() == cliente.getCelular() && this.getEndereco() == cliente.getEndereco() 
				 && this.getRendaFamiliar() == cliente.getRendaFamiliar()){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return super.toString() + "\nCelular = " + this.getCelular() 
			+ "\nEndereco = " + this.getEndereco() + "\nRenda Familiar = " + this.getRendaFamiliar();
	}
}
