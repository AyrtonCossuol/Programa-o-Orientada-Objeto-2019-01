package codigos;
/**
 * Classe Meta tem por caracteristica uma prioridade a ser execultada,
 * ainda utilizando os atributos como registro de item, uma descrição,
 * um periodo, e a prioridade.
 * <p>
 * A classe Lembrete a classe Abstrata ItemAgenda pelo meio do Extends
 * <p>
 * 
 * Utilizando o compareTo da Classe Lembrete pelo implements Comparable
 * <p>
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 */
public class Meta extends ItemAgenda implements Comparable<Meta> {
	/** Valor da prioridade escolhida pelo Usuario*/
	private int prioridade;
	/**
	 * Sobrecarregamento do Construtor Meta onde é inicializado com os parametros de 
	 * registro de item, uma descrição, uma data de inicio, uma data de fim, um horario de
	 * inicio, horario de fim e a prioridade
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao String da descrição da Meta
	 * @param dataInicio Data do inicio da Meta
	 * @param dataFim Data do fim da Meta
	 * @param horarioInicio Horario do inicio da Meta
	 * @param horarioFim Horario do fim da Meta
	 * @param prioridade Valor da Prioridade da Meta
	 * @throws Exception Tratamento de valores ou String indevidas
	 */
	public Meta(String registroItem, String descricao, Data dataInicio, Data dataFim, Horario horarioInicio, 
			Horario horarioFim, int prioridade) throws Exception {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(dataInicio, dataFim, horarioInicio, horarioFim);
		this.setPrioridade(prioridade);
	}
	/**
	 * Construtor Meta em que é inicializado com os parametros de um registro de item,
	 * uma descrição, um periodo e uma prioridade.
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao String da descrição da Meta
	 * @param periodo Data da Meta
	 * @param prioridade Valor que é considerado a prioridade da Meta
	 * @throws Exception Tratamento de valores ou String indevidas
	 */
	public Meta(String registroItem, String descricao, Periodo periodo, int prioridade) throws Exception {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(periodo);
		this.setPrioridade(prioridade);
	}
	/**
	 * Captura do valor da prioridade
	 * 
	 * @return o valor da prioridade
	 */
	public int getPrioridade() {
		return this.prioridade;
	}
	/**
	 * Modificação da prioridade
	 * 
	 * @param prioridade Valor da prioridade
	 * @throws Exception Tratamento de valor Indevido
	 */
	public void setPrioridade(int prioridade) throws Exception {
		if (prioridade < 1) {
			throw new Exception("\nErro\n");
		}
		else {
			this.prioridade = prioridade;
		}
	}
	/**
	 * Método compareTo em que utiliza por meio do implements Comparable,
	 * em que deixa as Metas em ordem crescente
	 */
	public int compareTo(Meta meta) {
		if (this.getPrioridade() < meta.getPrioridade()) return -1;
		else if (this.getPrioridade() > meta.getPrioridade()) return 1;
		else return 0;
	}
	/**
	 * Sobreposição do método toString em que retorna todo o conteudo 
	 * na classe Meta
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nPrioridade da meta: " + this.getPrioridade() + "\n");
		return info.toString();
	}

	

	

	

	
	
}
