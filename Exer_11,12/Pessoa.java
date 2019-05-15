package exercicio11;

public class Pessoa{
	private String nome;
	private String identidade;
	private Data dataNasc;
	
	public Pessoa(String nome, String identidade, Data dataNasc) throws Exception{
		this.setPessoa(nome, identidade, dataNasc);
	}

	public Pessoa(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc) throws Exception{
		setPessoa(nome, identidade, diaNasc, mesNasc, anoNasc);
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return this.identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public Data getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	private void setPessoa(String nome2, String identidade2, Data dataNasc2) throws Exception{
		this.setNome(nome2);
		this.setIdentidade(identidade2);
		this.setDataNasc(dataNasc2);
	}
	
	private void setPessoa(String nome2, String identidade2, int diaNasc, int mesNasc, int anoNasc) throws Exception{
		dataNasc = new Data(diaNasc, mesNasc, anoNasc);
		this.setNome(nome2);
		this.setIdentidade(identidade2);
	}
	
	public double emprestimo(){
		return 1000;
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(this.getNome());
		dado.append(",");
		dado.append(this.getIdentidade());
		dado.append(",");
		dado.append(this.getDataNasc());
		dado.append(")");
		return dado.toString();
	}
	
}
