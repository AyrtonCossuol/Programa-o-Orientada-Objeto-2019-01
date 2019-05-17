
public class Email {
	private String descricaoEmail;
	
	public Email(String descricaoEmail) throws Exception{
		isEmailValido(descricaoEmail);
	}

	public Email(){
		this.setDescricaoEmail("");
	}

	public String getDescricaoEmail() {
		return this.descricaoEmail;
	}

	public void setDescricaoEmail(String descricaoEmail) {
		this.descricaoEmail = descricaoEmail;
	}
	
	public static boolean isEmailValido(String email) throws Exception {
		if (email.indexOf("@") != -1) {
			return true;
		}
		throw new Exception ("Email invalido");
	}
	
	public boolean equals(Object objeto){
		Email email = (Email)objeto;
		if(this.getDescricaoEmail() == email.getDescricaoEmail())return true;
		return false;
	}
	
	public String toString(){
		return "Email = " + this.getDescricaoEmail();
	}
}
