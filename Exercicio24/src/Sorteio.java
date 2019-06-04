import java.io.Serializable;

/**
 * Usada para organizar cada sorteio, com data e uma agregacao de NumeroSorteados.
 * Assim, um objeto de Sorteio vai possuir uma data e uma certa quantidade de numeros sorteados correspondentes a essa data
 *
 * <p>
 * Implementa a interface Serializable, para permitir que as suas instâncias possam
 * ser usadas numa serialização (por exemplo, gravação em disco)
 *
 * @author Ayrton S. C
 * @version 1.0 (junho - 2019)
 */

public class Sorteio implements Serializable {
	/** dia da data referente ao sorteio */
	private int dia;
	
	/** mês da data referente ao sorteio */
	private int mes;
	
	/** ano da data referente ao sorteio */
	private int ano;
	
	/** valores sorteados */
	private NumeroSorteados sorteioVal;

	/**
     * construtor default que inicializa a data com o valor default 01/01/1900
     * e faz o sorteio com os parametros 'quantidade de numeros no sorteio', 'limite superior' e 'limite inferior'
     * respectivamente iguais a 4, 99 e 1
     * 
     * @throws Exception para a verificação dos this utilizados
     */
	public Sorteio() throws Exception {
		this.setData(1,1,1900);
		this.setNumeroSorteado();
	}
	
	/**
     * construtor para inicializar valores nos campos
     *
     * @param d dia da data
     * @param m mes da data
     * @param a ano da data
     * @param sorteioV numeros sorteados previamente
     * @throws Exception para dia, mês, ano ou numeros sorteados invalidos
     */
	public Sorteio (int d, int m, int a, NumeroSorteados sorteioV) throws Exception {
		this.setData(d, m, a);
		this.setNumeroSorteado(sorteioV);
	}
	
	 /**
     * construtor para inicializar valores nos campos e inicializando o sorteio com parametros default
     * 'quantidade de numeros no sorteio', 'limite superior' e 'limite inferior'
     * respectivamente iguais a 4, 99 e 1
     *
     * @param d dia da data
     * @param m mes da data
     * @param a ano da data
     * @throws Exception para dia, mês ou ano invalido
     */
	public Sorteio (int d, int m, int a) throws Exception {
		this.setData(d, m, a);
		this.setNumeroSorteado();
	}
	
	/**
     * construtor para inicializar valores nos campos
     *
     * @param data objeto do formato Data
     * @param quant quantidade de numeros sorteados
     * @throws Exception para o objeto data ou a quantidade invalidos
     */
	public Sorteio (String data, int quant) throws Exception {
		this.setData(data);
		this.setNumeroSorteado(quant);
	}
	
	/**
     * construtor para inicializar valores nos campos
     *
     * @param d dia da data
     * @param m mes da data
     * @param a ano da data
     * @param quant quantidade de numeros a serem sorteados
     * @param faixaI limite inferior
     * @param faixaF limite superior
     * @throws Exception para todos os parametros no campo quando serão invalidos
     */
	public Sorteio (int d, int m, int a, int quant, int faixaI, int faixaF) throws Exception {
		this.setData(d, m, a);
		this.setNumeroSorteado(quant, faixaI, faixaF);
	}
	
	/**
     * construtor para inicializar valores nos campos
     *
     * @param d dia da data
     * @param m mes da data
     * @param a ano da data
     * @param quant quantidade de numeros a serem sorteados
     * @param faixaF limite superior
     * @throws Exception para todos os parametros no campo quando serão invalidos
     */
	public Sorteio (int d, String m, int a, int quant, int faixaF) throws Exception {
		this.setData(d, m, a);
		this.setNumeroSorteado(quant, faixaF);
	}
	
	/**
     * construtor para inicializar valores nos campos
     *
     * @param m mes da data
     * @param a ano da data
     * @throws Exception para o mês e ano invalidos
     */
	public Sorteio(int m, int a) throws Exception {
		this.setData(1,m,a);
	}

	/**
	 * pega o valor do dia
	 * 
	 * @return valor do dia
	 */
	public int getDia() {
		return this.dia;
	}
	
	/**
	 * pega o valor do mês
	 * 
	 * @return valor do mês
	 */
	public int getMes() {
		return this.mes;
	}
	/**
	 * pega o valor do ano
	 * 
	 * @return valor do ano
	 */
	public int getAno() {
		return this.ano;
	}
	
	/**
	 * modifica os numeros sorteados recebendo nenhum parametro
	 */
	public void setNumeroSorteado() {
		this.sorteioVal = new NumeroSorteados();
	}
	
	/**
	 * modifica os numeros sorteados com o Objeto Numero Sorteados
	 *
	 * @param sorteioV objeto de valores sorteados
	 */
	public void setNumeroSorteado(NumeroSorteados sorteioV) {
		this.sorteioVal = sorteioV;
	}
	
	/**
	 * modifica os numeros sorteados com um parametro integer
	 * 
	 * @param quant quantidade de numeros a serem utilizados
	 */
	public void setNumeroSorteado(int quant) {
		this.sorteioVal = new NumeroSorteados(quant);
	}
	
	/**
	 * modifica os numeros sorteados com um parametros de quantidade de numeros e uma faixa final
	 * 
	 * @param quant quantidade de numeros a serem utilizados
	 * @param faixaF numero que limita o final dos aleatorios
	 */
	public void setNumeroSorteado(int quant, int faixaF) {
		this.sorteioVal = new NumeroSorteados(quant, faixaF);
	}
	
	/**
	 * modifica os numeros sorteados com um parametro de quantidade de numeros, uma faixa inicial e uma final
	 * @param quant quantidade de numeros a serem utilizados
	 * @param faixaI numero que limita o inicio dos aleatorios
	 * @param faixaF numero que limita o final dos aleatorios
	 */
	public void setNumeroSorteado(int quant, int faixaI, int faixaF) {
		this.sorteioVal = new NumeroSorteados(quant, faixaI, faixaF);
	}
	
	/**
	 * modifica a data onde é passado um mês em forma de String e utilizando o equals
	 * a String eé modificada para os valores dos meses
	 * 
	 * @param d numero que representa o dia
	 * @param m numero que representa o mês
	 * @param a numero que representa o ano
	 * @throws Exception para dia, mês em String e ano invalidos
	 */
	public void setData(int d, String m, int a) throws Exception {
		int month = 0;
		if (m.equals("janeiro")) month = 1;
		if (m.equals("fevereiro")) month = 2;
		if (m.equals("marco")) month = 3;
		if (m.equals("abril")) month = 4;
		if (m.equals("maio")) month = 5;
		if (m.equals("junho")) month = 6;
		if (m.equals("julho")) month = 7;
		if (m.equals("agosto")) month = 8;
		if (m.equals("setembro")) month = 9;
		if (m.equals("outubro")) month = 10;
		if (m.equals("novembro")) month = 11;
		if (m.equals("dezembro")) month = 12;
		this.setData(d, month, a);
	}
	
	/**
	 * modifica a data recebendo o Objeto do tipo data
	 * 
	 * @param data data em formato String
	 * @throws Exception para o objeto data invalido
	 */
	public void setData(String data) throws Exception {
		int d = data.indexOf("/");
		String day = data.substring(0, d);
		int m = data.indexOf("/", d+1);
		String month = data.substring(d+1, m);
		String year = data.substring(m+1);
		d = Integer.parseInt(day);
		m = Integer.parseInt(month);
		int a = Integer.parseInt(year);
		this.setData(d, m, a);
	}
	
	/**
	 * modifica a data recebendo o valor do mês e do ano
	 * 
	 * @param m valor do mês
	 * @param a valor que representa o ano
	 * @throws Exception para o mês e o ano invalidos
	 */
	public void setData(int m, int a) throws Exception {
		int d = 01;
		this.setData(d, m, a);
	}
	
	/**
	 * modifica a data utilizando os valores para dia, mês e ano
	 * @param d numero que representa o dia
	 * @param m numero que representa o mês
	 * @param a numero que representa o ano
	 * @throws Exception para o dia, mês ou ano invalidos
	 */
	public void setData(int d, int m, int a) throws Exception{
		if (Sorteio.isDataValida(d, m, a)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		else {
			throw new Exception("Data invalida");
		}
	}
	/**
	 * método que ferifica se a data é valida
	 * 
	 * @param d numero que representa o dia
	 * @param m numero que representa o mês
	 * @param a numero que representa o ano
	 * 
	 * @return retorna verdadeiro para datas validas 
	 * @return retorna falso para datas invalidas
	 */
	public static boolean isDataValida(int d, int m, int a) {
		if (a < 1582 || d > 31 || d < 1 || m < 1 || m > 12) {
			return false;
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 30) {
				return false;
			}
		}
		if (m == 2) {
			if (Sorteio.isBissexto(a) == false && d == 29 ) {
				return false;
			}
			if (d > 29) {
				return false;
			}
		}
		return true;
	}

	/**
	 * método que verifica se o ano é ou nao bissexto
	 * 
	 * @param a numero que representa o ano
	 * 
	 * @return retorna verdadeiro para anos que são bissextos
	 * @return retorna verdadeiro para anos que não são bissextos
	 */
	public static boolean isBissexto(int a) {
		if ( (a % 4 == 0) && (a % 100 != 0)) {
			return true;
		}
		return false;
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo dos 
	 * numeros sorteados 
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();

		if (this.dia > 9 && this.mes > 9) {
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			dados.append(" " + this.sorteioVal);
			return dados.toString();
		}
		if (this.dia > 9) {
			dados.append(this.getDia());
			dados.append("/0");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			dados.append(" " + this.sorteioVal);
			return dados.toString();
		}
		if (this.mes > 9) {
			dados.append("0");
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			dados.append(" " + this.sorteioVal);
			return dados.toString();
		}
		dados.append("0");
		dados.append(this.getDia());
		dados.append("/0");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		dados.append(" " + this.sorteioVal);
		return dados.toString();
	}

}
