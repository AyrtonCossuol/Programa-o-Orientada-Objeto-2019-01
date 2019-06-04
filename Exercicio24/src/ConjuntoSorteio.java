import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos para
 * inclusão como instâncias da classe Sorteio
 *
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
*/

public class ConjuntoSorteio implements Serializable{
	private List<Sorteio> valoresSorteios;
	private Sorteio aux;
	
	public ConjuntoSorteio() {
		valoresSorteios = new LinkedList<Sorteio>();
	}
	
	/**
	 * Insere uma instância da classe Sorteio dados valores do Sorteio e do numero de sorteios
	 *
	 * @param sorteio objeto que possui a Data e os numeros sortedos
	 * @param numSort quantidade de sorteios
	 * @throws Exception para datas invalidas
	 */
	public void insere(Sorteio sorteio, int numSort) throws Exception {
		this.valoresSorteios.add(sorteio);
		for (int i = 1 ; i < numSort ; i++) {
			if (Sorteio.isDataValida(sorteio.getDia()+1, sorteio.getMes(), sorteio.getAno())) {
				this.valoresSorteios.add(new Sorteio(sorteio.getDia()+1, sorteio.getMes(), sorteio.getAno()));
				sorteio = new Sorteio(sorteio.getDia()+1, sorteio.getMes(), sorteio.getAno());
			}
			else if (Sorteio.isDataValida(1, sorteio.getMes()+1, sorteio.getAno())) {
				this.valoresSorteios.add(new Sorteio(1, sorteio.getMes()+1, sorteio.getAno()));
				sorteio = new Sorteio(1, sorteio.getMes()+1, sorteio.getAno());
			}
			else if (Sorteio.isDataValida(1, 1, sorteio.getAno()+1)) {
				this.valoresSorteios.add(new Sorteio(1, 1, sorteio.getAno() + 1));
				sorteio = new Sorteio(1, 1, sorteio.getAno()+1);
			}
			else {
				throw new Exception("Data invalida");
			}
		}
	}
	
	/**
	 * Insere uma instância da classe Sorteio dados valores do dia, mês, ano, objeto de numeros sorteados
	 * e a quantidade de sorteios.
	 * 
	 * @param d valor para o dia
	 * @param m valor para o mês
	 * @param a valor para o ano
	 * @param sorteioV objeto que possui os valores sortedos
	 * @param numSort quantidade de sorteios
	 * @throws Exception para datas invalidas
	 */
	public void insere(int d, int m, int a, NumeroSorteados sorteioV, int numSort) throws Exception {
		this.valoresSorteios.add(new Sorteio(d, m, a, sorteioV));
		aux = new Sorteio(d, m, a, sorteioV);
		for (int i = 1 ; i < numSort ; i++) {
			if (Sorteio.isDataValida(aux.getDia()+1, aux.getMes(), aux.getAno())) {
				this.valoresSorteios.add(new Sorteio(aux.getDia()+1, aux.getMes(), aux.getAno()));
				aux = new Sorteio(aux.getDia()+1, aux.getMes(), aux.getAno());
			}
			else if (Sorteio.isDataValida(1, aux.getMes()+1, aux.getAno())) {
				this.valoresSorteios.add(new Sorteio(1, aux.getMes()+1, aux.getAno()));
				aux = new Sorteio(1, aux.getMes()+1, aux.getAno());
			}
			else if (Sorteio.isDataValida(1, 1, aux.getAno()+1)) {
				this.valoresSorteios.add(new Sorteio(1, 1, aux.getAno() + 1));
				aux = new Sorteio(1, 1, aux.getAno()+1);
			}
			else {
				throw new Exception("Data invalida");
			}
		}
	}
	
	/**
	 * Insere uma instância da classe Sorteio dados valores do dia, mês, ano, quantidade de numeros,
	 * faixa inicial dos valores, faixa final dos valores sorteados e quantidade de sorteios.
	 * 
	 * @param d valor para o dia
	 * @param m valor para o mês
	 * @param a valor para o ano
	 * @param quant quantidade de numeros a serem sorteados
	 * @param faixaI valor de inicio dos numeros a serem sorteados
	 * @param faixaF valor de final dos numeros a serem sorteados
	 * @param numSort quantidade de sorteios
	 * @throws Exception para datas invalidas
	 */
	public void insere(int d, int m, int a, int quant, int faixaI, int faixaF, int numSort) throws Exception {
		aux = new Sorteio(d, m, a, quant, faixaI, faixaF);
		this.valoresSorteios.add(aux);
		for (int i = 1 ; i < numSort ; i++) {
			if (Sorteio.isDataValida(aux.getDia()+1, aux.getMes(), aux.getAno())) {
				aux = new Sorteio(aux.getDia()+1, aux.getMes(), aux.getAno(), quant, faixaI, faixaF);
				this.valoresSorteios.add(aux);
			}
			else if (Sorteio.isDataValida(1, aux.getMes()+1, aux.getAno())) {
				aux = new Sorteio(1, aux.getMes()+1, aux.getAno(), quant, faixaI, faixaF);
				this.valoresSorteios.add(aux);
			}
			else if (Sorteio.isDataValida(1, 1, aux.getAno()+1)) {
				aux = new Sorteio(1, 1, aux.getAno()+1, quant, faixaI, faixaF);
				this.valoresSorteios.add(aux);
			}
			else {
				throw new Exception("Data invalida");
			}
		}
	}
	
	/**
	 * Sobreposição do método toString para retornar todo o conteúdo do Conjunto Sorteio
	 * separados por quebras de linha
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		for (int i = 0; i < this.valoresSorteios.size() ; i++) {
			info.append(this.valoresSorteios.get(i) + "\r\n");
		}
		return info.toString();
	}
}
