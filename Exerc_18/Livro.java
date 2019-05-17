
public class Livro {
	private String titulo, autor;
	private int numPaginas, anoEdicao;
	
	public Livro(String titulo, String autor, int numPaginas, int anoEdicao){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumPaginas(numPaginas);
		this.setAnoEdicao(anoEdicao);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return this.numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	public String toString() {
		StringBuilder dado = new StringBuilder();
		dado.append("'");
		dado.append(this.getTitulo());
		dado.append(",");
		dado.append(this.getAutor());
		dado.append(",");
		dado.append(this.getNumPaginas());
		dado.append(",");
		dado.append(this.getAnoEdicao());
		dado.append("' ");
		return dado.toString();
	}
}
