package exercicio11;

public class PacienteDeClinica extends Pessoa {
	private String planoSaude;
	
	public PacienteDeClinica(String nome, String identidade, Data dataNasc, String planoSaude) throws Exception{
		super(nome, identidade, dataNasc);
		this.setPlanoSaude(planoSaude);
	}
	
	public PacienteDeClinica(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc , String planoSaude) throws Exception{
		super(nome, identidade, diaNasc, mesNasc, anoNasc);
		this.setPlanoSaude(planoSaude);
	}

	public String getPlanoSaude() {
		return this.planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.getPlanoSaude());
		dado.append(")");
		return dado.toString();
	}
}
