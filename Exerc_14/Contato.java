
public class Contato extends Email{
	private String nome;

	public Contato(String nome, String email) throws Exception{
		super(email);
		this.setNome(nome);
	}
	
	public Contato(){
		super();
		this.setNome("");
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Object objeto){
		Contato nome = (Contato)objeto;
		if(this.getNome() == nome.getNome() 
				&& super.getDescricaoEmail() == nome.getDescricaoEmail()){
			return true;
		}
		return false;
	}
	
	public String toString(){
		return super.toString() + "\nNome = " + this.getNome();
	}
}
