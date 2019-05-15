package exercicio11;

public class Chefe extends Funcionario{
	private String departamento;
	
	//CONStrutor
	public Chefe (String nome, String departamento, float salario, String identidade, Data dataNasci, Data dataAdim, float reajuste) throws Exception{
		super(nome, identidade, dataNasci, dataAdim, salario,reajuste);
		this.setDepartamento(departamento);
	}
	
	public Chefe (String nome, String departamento, float salario, String identidade, int diaNasc, int mesNasc, int anoNasc,
			int diaAdim, int mesAdim, int anoAdim, float reajuste) throws Exception{
		super(nome, identidade, diaNasc, mesNasc, anoNasc, diaAdim, mesAdim, anoAdim, salario, reajuste);
		this.setDepartamento(departamento);
	}
	
	//Métodos de interfaces
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double emprestimo(){
		return super.emprestimo()*2;
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.getDepartamento());
		dado.append(")");
		return dado.toString();
	}
}
