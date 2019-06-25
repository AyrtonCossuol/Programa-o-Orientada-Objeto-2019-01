package codigos;
/**
 * Classe Lembrete constitui em caracterizar um tipo de Lembre que possui
 * um registro do item, uma descrição do lembrete, um periodo e o tempo que 
 * antecede o lembre acontecer.
 * <p>
 * 
 * A classe Lembrete a classe Abstrata ItemAgenda pelo meio do Extends
 * <p>
 * 
 * Utilizando o compareTo da Classe Lembrete pelo implements Comparable
 * <p>
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 *
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	/** Minutos que antecede o Lembrete */
	public int minAntecedencia;
	/**
	 * SObreposição do contrutor Lembrete em que recebe um regitro do item, uma descrição, 
	 * uma data inicial, uma data final, um horario inicial, horario final e os minutos que antecede 
	 * o Lembrete
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao String da descrição do Lembrete
	 * @param dataInicio Data inicial dada pelo Usuario
	 * @param dataFim Data final dada pelo Usuario
	 * @param horarioInicio Horario inicial dada pelo Usuario
	 * @param horarioFim Horario final dada pelo Usuario
	 * @param minAntecedencia Tempo que irá anteceder o Lembrete
	 * @throws Exception Tratamento de valores ou String indevidas
	 */
	public Lembrete(String registroItem, String descricao, Data dataInicio, Data dataFim, Horario horarioInicio, 
			Horario horarioFim, int minAntecedencia) throws Exception {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(dataInicio, dataFim, horarioInicio, horarioFim);
		this.setMinAntecedencia(minAntecedencia);
	}
	/**
	 * Construtor Lembrete em que recebe um registro do item, uma descrição,
	 * um periodo e um minuto de antecedencia para o Lembrete
	 * 
	 * @param registroItem Uma String do registro do Item
	 * @param descricao String da descrição do Lembrete
	 * @param periodo Data do lembrete
	 * @param minAntecedencia Tempo que irá anteceder o Lembrete
	 * @throws Exception Tratamento de valores ou String indevidas
	 */
	public Lembrete(String registroItem, String descricao, Periodo periodo, int minAntecedencia) throws Exception {
		super.setRegistroItem(registroItem);
		super.setDescricao(descricao);
		super.setPeriodo(periodo);
		this.setMinAntecedencia(minAntecedencia);
	}
	/**
	 * Captura o tempo que antecede o Lembrete
	 * 
	 * @return o tempo que antecede o Lembrete
	 */
	public int getMinAntecedencia() {
		return this.minAntecedencia;
	}
	/**
	 * Modifica o tempo que antecede o Lembrete 
	 * 
	 * @param minAntecedencia tempo a ser modificado 
	 * @throws Exception Tratamento para valores indevidos
	 */
	public void setMinAntecedencia(int minAntecedencia) throws Exception {
		if (minAntecedencia >= 0) {
			this.minAntecedencia = minAntecedencia;
		}
		else {
			throw new Exception("\nErro\n");
		}
	}
	/**
	 * Método compareTo em que utiliza por meio do implements Comparable,
	 * em que deixa os Lembretes em ordem crescente
	 */
	public int compareTo(Lembrete lembrete) {
		if (this.getMinAntecedencia() < lembrete.getMinAntecedencia()) return -1;
		else if (this.getMinAntecedencia() > lembrete.getMinAntecedencia()) return 1;
		else return 0;
	}
	/**
	 * Sobreposição do método toString em que retorna todo o conteudo 
	 * na classe Lembrete
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(super.toString());
		info.append("\nO lembrete vai ser acionado faltando: " + this.getMinAntecedencia() + " minutos\n");
		return info.toString();
	}

}
