package exercicio11;

public class Funcionario extends Pessoa{
	private float salario;
	private Data dataAdim; 
	
	public Funcionario(String nome, String identidade, Data dataNasc, Data dataAdm, float salario, float reajuste) throws Exception{
		super(nome, identidade, dataNasc);
		setDataAdim(dataAdm);
		this.setSalario(salario);
		this.setReajuste(reajuste);
	}
	public Funcionario(String nome, String identidade, Data dataNasc, Data dataAdm, float salario) throws Exception{
		super(nome, identidade, dataNasc);
		setDataAdim(dataAdim);
		this.setSalario(salario);
	}
	
	public Funcionario(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc,
			int diaAdim, int mesAdim, int anoAdim, float salario, float reajuste) throws Exception{
		super(nome, identidade, diaNasc, mesNasc, anoNasc);
		setDataAdim(diaAdim, mesAdim, anoAdim);
		this.setSalario(salario);
		this.setReajuste(reajuste);
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Data getDataAdim() {
		return this.dataAdim;
	}

	public void setDataAdim(Data dataAdim) {
		this.dataAdim = dataAdim;
	}
	
	public void setDataAdim(int diaAdim, int mesAdim, int anoAdim) throws Exception{
		dataAdim = new Data(diaAdim, mesAdim, anoAdim);
	}

	public void setReajuste(float reajuste) {
		this.salario += this.salario * reajuste;
	}
	
	public double emprestimo(){
		return this.getSalario();
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.getDataAdim());
		dado.append(",");
		dado.append(this.getSalario());
		dado.append(")");
		return dado.toString();
	}
}
