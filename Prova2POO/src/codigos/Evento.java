package codigos;
/**
 * Classe Evento constitui em caracterizar o mesmo utilizando um registro
 * de um Iten, uma Descrição, um periodo passado pelo usuario, um local especifico,
 * uma hora de inicio e uma hora de fim do Evento.
 * 
 * <p>
 * Extende a Classe Abstrata ItemAgenda
 * <p>
 * Utilizando o compareTo da Classe Evento pelo implements Comparable
 * <p>
 * 
 * @author Ayrton S. C
 * @version 1.0 (junho - 2019)
 *
 */
public class Evento extends ItemAgenda implements Comparable<Evento> {
	/** String passada pelo Usuario para definir o local*/
	private String local;
	/**
	 * Construtor Evento sobrecarregado onde recebe um registro de Item, uma Descriçãodo evento,
	 * uma data de Inicio, uma data de Fim, um horario de inicio, um horario de fim e 
	 * um local.
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao Uma descrição do Evento
	 * @param dataInicio Data de inicio do Evento
	 * @param dataFim Data de fim do Evento
	 * @param horarioInicio Horario de inicio do Evento
	 * @param horarioFim Horario final do Evento
	 * @param local Um local para o evento
	 */
	public Evento(String registroItem, String descricao, Data dataInicio, Data dataFim, Horario horarioInicio, 
			Horario horarioFim, String local) {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(dataInicio, dataFim, horarioInicio, horarioFim);
		this.setLocal(local);
	}
	/**
	 * Construtor Evento em que recebe uma String do registro item, uma descrição,
	 *  um periodo de duração e um local.
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao Uma descrição do Evento
	 * @param periodo Uma data para o Evento
	 * @param local Um local para o evento
	 */
	public Evento(String registroItem, String descricao, Periodo periodo, String local) {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(periodo);
		this.setLocal(local);
	}
	/**
	 * Captura o local digitado pelo Usuaio.
	 * 
	 * @return o local do Evento
	 */
	public String getLocal() {
		return this.local;
	}
	/**
	 * Modifica a String local 
	 * 
	 * @param local String a ser inserida em local
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * Método compareTo em que utiliza por meio do implements Comparable,
	 * o compareTo da Classe ordena a lista de Eventos
	 */
	public int compareTo(Evento evento) {
		return this.getLocal().compareTo(evento.getLocal());
	}
	/**
	 * Sobreposição do método toString em que retorna todo o conteudo 
	 * na classe Evento
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nLocal do Evento: " + this.getLocal() + "\n");
		return info.toString();
	}
	
}
