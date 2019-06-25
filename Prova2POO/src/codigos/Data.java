package codigos;
/**
 * Classe Data e definida com um dia, mês e ano para auxiliar as
 * demais classes quando for utiliza-la
 * <p>
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 */
public class Data {
	/** Dia informado pelo Usuario. */
	private int dia;
	/** Mês informado pelo Usuario.*/
	private int mes; 
	/** Ano informado pelo Usuario. */
	private int ano;
	/**
	 * Contrutor para iniciar a Data com uma variavel do tipo
	 * String.
	 * 
	 * @param data Data em formato String passado pelo Usuario
	 * @throws Exception Tratamento para a Data passada
	 */
	public Data(String data) throws Exception {
		this.setData(data);
	}
	/**
	 * Contrutor para iniciar a Data com as variaveis Dia, Mês e Ano.
	 * 
	 * @param d Dia passado pelo Usuario
	 * @param m Mês passado pelo Usuario
	 * @param a Ano passado pelo Usuario
	 * @throws Exception Tratamento para valores não adequados
	 */
	public Data(int d, int m, int a) throws Exception {
		this.setData(d, m, a);
	}
	/**
	 * Captura o Dia passado pelo Usuario
	 * 
	 * @return o dia do Usuario
	 */
	public int getDia() {
		return this.dia;
	}
	/**
	 * Captura o Mês passado pelo Usuario
	 * 
	 * @return o mes do Usuario
	 */
	public int getMes() {
		return this.mes;
	}
	/**
	 * Captura o Ano passado pelo Usuario
	 * 
	 * @return o ano do Usuario
	 */
	public int getAno() {
		return this.ano;
	}
	/**
	 * Modifica a String data separando todas as partes(dia, mês, ano), 
	 * em Strings proprias e logo apos, atribuido cada String
	 * em um Integer
	 * 
	 * @param data Data em String passada pelo Usuario
	 * @throws Exception Tratamento para a data descrita errada
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
		this.setData(d,m,a);
	}
	/**
	 * Modifica a Data recebendo o Dia, Mês e Ano 
	 * 
	 * @param d Dia passado pelo Usuario
	 * @param m Mês passado pelo Usuario
	 * @param a Ano passado pelo Usuario
	 * @throws Exception Tratamento dos valores atribuidos a Data
	 */
	public void setData(int d, int m, int a) throws Exception{
		if (Data.isDataValida(d,m,a)) {
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		else {
			throw new Exception("\nData invalida\n");
		}
	}
	/**
	 * Método boleano em que retorna se a data é ou não valida
	 * para ser utilizada 
	 * 
	 * @param d Dia passado pelo Usuario
	 * @param m Mês passado pelo Usuario
	 * @param a Ano passado pelo Usuario
	 * @return false Para quando a Data não for valida
	 * @return true Para quando a data for valida
	 */
	public static boolean isDataValida(int d, int m, int a) {
		if (d > 31 || d < 1 || m < 1 || m > 12) {
			return false;
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 30) {
				return false;
			}
		}
		if (m == 2) {
			if (Data.isBissexto(a) == false && d == 29 ) {
				return false;
			}
			if (d > 29) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Método boleano em que retorna verdadeiro para quando o ano for 
	 * bissexto e falso para quando não for 
	 * 
	 * @param a Valor do ano passado pelo Usuario
	 * @return Retorna verdadeiro quando for bissexto
	 * @return Retorna falso quando não for bissexto
	 */
	public static boolean isBissexto(int a) {
		if ((a % 4 == 0) && (a % 100 != 0)) {
			return true;
		}
		return false;
	}
	/**
	 * Método compareTo em que irá receber duas datas e retorna quando uma 
	 * é maior que a outra vice versa para o usuario.
	 * 
	 * @param data1 Primeira data passada pelo Usuario
	 * @param data2 Segunda data Passada pelo Usuario
	 * @return -1 para quando uma data for menor que a outra
	 * @return 0 para quando as duas datas forem iguais
	 * @return 1 para quando uma data for maior que a outra
	 */
	public static int compareTo(Data data1, Data data2) {
		if (data1.getAno() > data2.getAno()) return 1;
		else { 
			if (data1.getAno() < data2.getAno()) return -1;
			else {
				if (data1.getMes() > data2.getMes()) return 1;
				else {
					if (data1.getMes() < data2.getMes()) return -1;
					else {
						if (data1.getDia() > data2.getDia()) return 1;
						else {
							if (data1.getDia() < data2.getDia()) return -1;
							else {
								return 0;
							}
						}
					}
				}
			}
		}
	}
	/**
	 * Sobreposição do método toString para retornar a Data ao Usuario
	 * tendo uma organização de colocar do seguinte formato: dd/mm/aaaa
	 * 
	 * @return retorna um tipo String com todos os dados 
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();

		if (this.getDia() > 9 && this.getMes() > 9) {
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			return dados.toString();
		}
		if (this.getDia() > 9) {
			dados.append(this.getDia());
			dados.append("/0");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			return dados.toString();
		}
		if (this.getMes() > 9) {
			dados.append("0");
			dados.append(this.getDia());
			dados.append("/");
			dados.append(this.getMes());
			dados.append("/");
			dados.append(this.getAno());
			return dados.toString();
		}
		dados.append("0");
		dados.append(this.getDia());
		dados.append("/0");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
}
