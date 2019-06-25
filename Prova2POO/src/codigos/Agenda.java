package codigos;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * Classe Agenda contendo uma serie de Listas onde é utilizado uma Lista Encadeada
 * para o armazenamento de todos os metodos da Classe Item Agenda e ainda contendo 
 * listas de prioridade, lembrete por antencedencia, evento por local, informa todos os itens,
 * e o intervalo da data.
 * <p>
 * 
 * 
 * @author Ayrton S.C
 * @version 1.0 (junho - 2019)
 *
 */
public class Agenda {
	private List<ItemAgenda> itenDaAgenda;
	/**
	 * Contrutor em que inicia o Iten da Agenda como uma LinkedList de Item Agenda
	 */
	public Agenda() {
		itenDaAgenda = new LinkedList<ItemAgenda>();
	}
	/**
	 * Captura os itens da agenda
	 * 
	 * @return o item da agenda
	 */
	public List getItensDaAgenda() {
		return this.itenDaAgenda;
	}
	/**
	 * Metodo Insere Item tem como intuito adicionar um novo item 
	 * na Agenda fazendo uma abstração do método da lista encadeada
	 * para um mais usual
	 *  
	 * @param novoItem insere um novo Item
	 */
	public void insereItem(ItemAgenda novoItem) {
		this.itenDaAgenda.add(novoItem);
	}
	/**
	 * Método Informa Metas por Prioridade utiliza a lista encadeada para guardar 
	 * todas as metas em uma lista e deixando-a em ordem.
	 * 
	 * @return retorna uma lista de metas ordenadas
	 */
	public List infMetasPrioridade() {
		int i;
		List<Meta> metaOrdenadas = new LinkedList<Meta>();
		for (i = 0 ; i < this.itenDaAgenda.size() ; i++) {
			if (this.itenDaAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Meta")) {
				metaOrdenadas.add((Meta) this.itenDaAgenda.get(i));
			}
		}
		Collections.sort(metaOrdenadas);
		return metaOrdenadas;
	}
	/**
	 * Método Informa Lembrete por Minutos de Antecedencia em que utiliza a lista 
	 * encadeada para inserir e ordenar lembretes.
	 * 
	 * @return lembretes ordenados em uma lista
	 */
	public List infLembretesMinAntecedencia() {
		int i;
		List<Lembrete> lembreteOrdenados = new LinkedList<Lembrete>();
		for (i = 0 ; i < this.itenDaAgenda.size() ; i++) {
			if (this.itenDaAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Lembrete")) {
				lembreteOrdenados.add((Lembrete) this.itenDaAgenda.get(i));
			}
		}
		Collections.sort(lembreteOrdenados);
		return lembreteOrdenados;
	}
	/**
	 * Método Evento Ordenados constitui em armazenar em uma lista encadeada 
	 * eventos passados pelo Usuario e são separados em ordem.
	 * 
	 * @return eventos ordenados em lista
	 */
	public List infEventosLocal() {
		int i;
		List<Evento> eventosOrdenados = new LinkedList<Evento>();
		for (i = 0 ; i < this.itenDaAgenda.size() ; i++) {
			if (this.itenDaAgenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Evento")) {
				eventosOrdenados.add((Evento) this.itenDaAgenda.get(i));
			}
		}
		Collections.sort(eventosOrdenados);
		return eventosOrdenados;
	}
	/**
	 * Método onde informa todos os itens da Agenda
	 * 
	 * @return todos os itens da Agenda
	 */
	public List infTodosItens() {
		return this.getItensDaAgenda();
	}
	/**
	 * Método onde informa os itens em um intervalo entre datas e 
	 * utilizando o compareTo da Classe mãe do Java.
	 * 
	 * @param inicial Data inicial passada pelo Usuario
	 * @param fim Data final passada pelo Usuario
	 * @return retorna itens entre as datas informadas
	 */
	//informaItensNoIntervaloDeData
	public List infItensIntervaloData(Data inicial, Data fim) {
		int i;
		List<ItemAgenda> itenEntreDataInformada = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itenDaAgenda.size(); i++) {
			if (Data.compareTo(this.itenDaAgenda.get(i).getPeriodo().getDataInicio(), inicial) != -1 && 
					Data.compareTo(this.itenDaAgenda.get(i).getPeriodo().getDataFim(), fim) != 1) {
				itenEntreDataInformada.add(this.itenDaAgenda.get(i));
			}
		}
		return itenEntreDataInformada;
	}
	/**
	 * Sobreposição do metodo toString em que retorna todo o conteudo
	 * do tipo agenda.
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.itenDaAgenda);
		return info.toString();
	}
}
