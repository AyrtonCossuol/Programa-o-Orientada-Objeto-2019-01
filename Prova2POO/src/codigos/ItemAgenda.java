package codigos;
/**
 * Classe Abstrata em que obriga as demais classes do item Agenda,
 * a criação dos metodos listadados nessa Classe.
 * <p>
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 *
 */
public abstract class ItemAgenda {
	/** Registro do item */
	private String registroItem;
	/** Descrição do Agenda*/
	private String descricao;
	/** Periodo de tempo de algo da Agenda*/
	private Periodo periodo;
	/**
	 * Captura a Descrição 
	 * 
	 * @return a descrição
	 */
	public String getDescricao() {
		return this.descricao;
	}
	/**
	 * Captura a String do registro do Item
	 * 
	 * @return o registro do item
	 */
	public String getRegistroItem() {
		return this.registroItem;
	}
	/**
	 * Captura um periodo determinado
	 * 
	 * @return o periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	/**
	 * Modifica o Registro Item com uma String passada pelo Usuario
	 * 
	 * @param registroItem String passada pelo Usuario
	 */
	public void setRegistroItem(String registroItem) {
		this.registroItem = registroItem;
	}
	/**
	 * Modifica a descrição com uma String passada pelo Usuario
	 * 
	 * @param descricao String passada pelo Usuario
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * Modifica o Periodo 
	 * 
	 * @param periodo Objeto periodo 
	 */
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	/**
	 * Sobreposição do setPeriodo em que modifica utilizando data de inicio,
	 * data de fim, hora de inicio e hora de fim
	 * 
	 * @param dataInicio Data inicial do periodo
	 * @param dataFim Data final do periodo
	 * @param horarioInicio Hora inicial do periodo
	 * @param horarioFim Hora final do periodo
	 */
	public void setPeriodo(Data dataInicio, Data dataFim, Horario horarioInicio, Horario horarioFim) {
		this.periodo = new Periodo(dataInicio, dataFim, horarioInicio, horarioFim);
	}
	/**
	 * Sobreposição do toString em que retorna todo o conteudo 
	 * na classes
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("\nRegistro do Item: " + this.getRegistroItem());
		info.append("\nDescricao: " + this.getDescricao());
		info.append("\nPeriodo: " + this.getPeriodo());
		return info.toString();
	}
	
}
