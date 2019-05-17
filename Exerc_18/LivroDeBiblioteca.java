
public class LivroDeBiblioteca extends Livro implements ItemDeBibliotecaa{
	private boolean statusEmprestimo;
	private String localizacao, descricao;
	
	public LivroDeBiblioteca(String titulo, String autor, int numPaginas, int anoEdicao, boolean statusEmprestimo,
			String localizacao, String descricao) {
		
		super(titulo, autor, numPaginas, anoEdicao);
		this.setLocalizacao(localizacao);
		this.setDescricao(descricao);
		this.setStatusEmprestimo(statusEmprestimo);
	}

	public boolean isStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public boolean isEmprestado() {
		return this.isStatusEmprestimo();
	}

	@Override
	public void empresta() {
		if(this.isEmprestado() == false){
			this.setStatusEmprestimo(true);
		}
	}

	@Override
	public void devolve() {
		this.setStatusEmprestimo(false);
	}

	@Override
	public String localiza() {
		return this.getLocalizacao();
	}

	@Override
	public String apresetacaoDescricao() {
		return this.getDescricao();
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("'");
		dado.append(super.toString());
		dado.append(",");
		dado.append(this.isStatusEmprestimo());
		dado.append(",");
		dado.append(this.getLocalizacao());
		dado.append(",");
		dado.append(this.getDescricao());
		dado.append("' ");
		return dado.toString();
	}
}
