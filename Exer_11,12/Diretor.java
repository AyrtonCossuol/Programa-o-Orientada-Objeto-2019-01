package exercicio11;

public class Diretor extends Chefe{
	private Data dataPromocao;
	
	public Diretor(String nome, String departamento, float salario, String identidade,
			Data dataNasci, Data dataAdim, Data dataPromocao, float reajuste) throws Exception{
		super(nome, departamento, salario, identidade, dataNasci, dataAdim, reajuste);
		this.setDataPromocao(dataPromocao);
	}

	public Diretor(String nome, String departamento, float salario, String identidade,
			int diaNasc, int mesNasc, int anoNasc,int diaAdim, int mesAdim, int anoAdim,
				int diaPro, int mesPro, int anoPro, float reajuste) throws Exception{
		super(nome, departamento, salario, identidade, diaNasc, mesNasc, anoNasc, diaAdim, mesAdim, anoAdim, reajuste);
		dataPromocao = new Data(diaPro, mesPro, anoPro);
	}
	
	public Data getDataPromocao() {
		return this.dataPromocao;
	}

	public void setDataPromocao(Data dataPromocao) {
		this.dataPromocao = dataPromocao;
	}
	
	public double emprestimo(){
		return super.emprestimo() * 1.5;
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("(");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.getDataPromocao());
		dado.append(")");
		return dado.toString();
	}
	
}
