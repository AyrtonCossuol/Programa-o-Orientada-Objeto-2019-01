import java.io.Serializable;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * TreeSet.
 * <p>
 * Oferece métodos de sortear numeros aleatorios sem repedições.
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 */
public class NumeroSorteados implements Serializable{
	/** Quantidade de Numero*/
	private int quantNumero;
	
	/** Faixa de Inicio*/
	private int faixaInicio;
	
	/** Faixa de Fim*/
	private int faixaFim;
	
	private Set<Integer> sorteioVal;
	
	/**
	 * construtor para inicializar valores vazios
	 */
	public NumeroSorteados() {
		this.setQuantidade(4);
		this.setIntervaloInicio(1);
		this.setIntervaloFim(99);
		this.Gerador();
	}
	
	/**
	 * construtor para inicializar valores das faixas
	 *
	 * @param faixaI valor inicial do intervalo
	 * @param faixaF valor final do intervalo
	 */
	public NumeroSorteados(int faixaI, int faixaF) {
		this.setQuantidade(4);
		this.setIntervaloInicio(faixaI);
		this.setIntervaloFim(faixaF);
		this.Gerador();
	}
	
	/**
	 * construtor para inicializar valores da quantidade
	 *
	 * @param quant quantidade de numeros a serem sorteados 
	 */
	public NumeroSorteados(int quant) {
		this.setQuantidade(quant);
		this.setIntervaloInicio(1);
		this.setIntervaloFim(99);
		this.Gerador();
	}
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param quant quantidade de numeros a serem sorteados
	 * @param faixaI valor inicial do intervalo
	 * @param faixaF valor final do intervalo
	 */
	public NumeroSorteados(int quant, int faixaI, int faixaF) {
		this.setQuantidade(quant);
		this.setIntervaloInicio(faixaI);
		this.setIntervaloFim(faixaF);
		this.Gerador();
	}

	/**
	 * pega a quantidade de numeros
	 * 
	 * @return quantidade de numeros
	 */
	public int getQuantidade() {
		return this.quantNumero;
	}
	
	/**
	 * pega o inicio do intervalo
	 * 
	 * @return inicio do intervalo
	 */
	public int getIntervaloInicio() {
		return this.faixaInicio;
	}
	
	/**
	 * pega  o fim do intervalo
	 * 
	 * @return fim do intervalo
	 */
	public int getIntervaloFim() {
		return this.faixaFim;
	}
	
	/**
	 * pega os valores sorteados
	 * 
	 * @return valores sorteados
	 */
	public Set getSorteioVal() {
		return this.sorteioVal;
	}

	/**
	 * modificar a quantidade de numeros
	 * 
	 * @param quant quantidade de numeros que deseja
	 */
	public void setQuantidade(int quant) {
		this.quantNumero = quant;
	}
	
	/**
	 * modificar o inicio do intervalo
	 * 
	 * @param inicio valor inicial dos numeros sorteados
	 */
	public void setIntervaloInicio(int inicio) {
		this.faixaInicio = inicio;
	}
	
	/**
	 * modificar o fim do intervalo
	 * 
	 * @param fim valor final dos numeros sorteados
	 */
	public void setIntervaloFim(int fim) {
		this.faixaFim = fim;
	}

	/**
	 * Método para produzir numeros aleatorios utilizando o Random e a classe 
	 * TreeSet, pois ela tem que verificar se há
	 * elementnos repetidos no conjunto através do critério determinado por
	 * compareTo nela mesmo ja construida. Com isso tem a adição dos valores
	 * inteiros na variavel sorteioVal
	 * 
	 */
	public void Gerador() {
		int i = 0;
		int a;
		Random gerador = new Random();
		this.sorteioVal = new TreeSet<Integer>();
		while (i < this.quantNumero) {
			a = gerador.nextInt(this.faixaFim - this.faixaInicio + 1) + this.faixaInicio;
			if (this.sorteioVal.contains(a)) {
				continue;
			}
			else {
				this.sorteioVal.add(new Integer(a));
				i++;
			}
		}
	}
	
	/**
	 * Sobreposição do método toString para retornar todo o conteúdo dos 
	 * numeros sorteados
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.sorteioVal);
		//for (int i = 0; i < this.getSorteioVal().size();i++) {
		//	info.append(this.sorteio_val.toString());
		//}
		return info.toString();
	}
}
