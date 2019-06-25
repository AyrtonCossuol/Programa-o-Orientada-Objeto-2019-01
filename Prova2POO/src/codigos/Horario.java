package codigos;
/**
 * Classe Horario é definida por uma hora, minuto e segundos, auxiliando 
 * nas utilizações das Classes
 * <p>
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 *
 */
public class Horario {
	/** Hora informado pelo Usuario*/
	private int hora;
	/** Minuto informado pelo Usuario*/
	private int min;
	/** Segundos informado pelo Usuario*/
	private int seg;
	/**
	 * Construtor Horario em que recebe como paramento as horas, os minutos
	 * e os segundos.
	 * 
	 * @param hora Hora informada pelo Usuario
	 * @param minutos Minutos informados pelo Usuario
	 * @param segundos Segundos informados pelo Usuario
	 * @throws Exception Tratamento para os valores indevidos
	 */
	public Horario(int hora, int minutos, int segundos) throws Exception {
		this.setHorario(hora, minutos, segundos);
	}
	/**
	 * Contrutor sobrecarrecado em que so recebe uma String do horario
	 * 
	 * @param horario Hora em forma de String
	 * @throws Exception Tratamento para algo indevido
	 */
	public Horario(String horario) throws Exception {
		this.setHorario(horario);
	}
	/**
	 * Captura da hora passada pelo Usuario
	 * 
	 * @return hora passada pelo Usuario
	 */
	public int getHora() {
		return this.hora;
	}
	/**
	 * Captura dos minutos pelo Usuario
	 * 
	 * @return minutos passada pelo Usuario
	 */
	public int getMinutos() {
		return this.min;
	}
	/**
	 * Captura dos segundos pelo Usuario
	 * 
	 * @return minutos passado pelo Usuario
	 */
	public int getSegundos() {
		return this.seg;
	}
	/**
	 * Modifica o Horario recebendo uma hora, os minutos e os segundos,
	 * e ainda verificando se esses paramentros são validos utilizando
	 * o isHorarioValida. 
	 * 
	 * @param h Hora passada pelo Usuario
	 * @param m Minutos passada pelo Usuario
	 * @param s Segundos passada pelo Usuario
	 * @throws Exception Tratamento para os valores indevidos
	 */
	public void setHorario(int h, int m, int s) throws Exception {
		if (Horario.isHorarioValida(h, m, s)) {
			this.hora = h;
			this.min = m;
			this.seg = s;
		}
		else {
			throw new Exception("\nHorario invalido!\n");
		}
	}
	/**
	 * Método estatico e boleano em que verifica se o horario esta adequado com
	 * o utilizado convencionalmente 
	 * 
	 * @param h Hora passada pelo Usuario
	 * @param m Minuto passada pelo Usuario
	 * @param s Segundo passada pelo Usuario
	 * @return Retorna verdadeiro se o horario é convencional
	 * @return Retorna falso se o horario não é convencional
	 */
	public static boolean isHorarioValida(int h, int m, int s) {
		if (h >= 0 && m >= 0 && s >= 0 && h < 24 && m < 60 && s < 60) {
			return true;
		}
		return false;
	}
	/**
	 * Modifica o horario passado como String para três interios h, m e s
	 * respeitando a ordem 
	 * 
	 * @param horario Horario passado como String pelo Usuario
	 * @throws Exception Tratamento para valores indevidos
	 */
	public void setHorario(String horario) throws Exception {
		int h = horario.indexOf(":");
		String hora = horario.substring(0, h);
		int m = horario.indexOf(":", h+1);
		String min = horario.substring(h+1, m);
		String seg = horario.substring(m+1);
		h = Integer.parseInt(hora);
		m = Integer.parseInt(min);
		int s = Integer.parseInt(seg);
		this.setHorario(h, m, s);
	}
	/**
	 * Método estatico em que compara dois horarios passados como parametro
	 * 
	 * @param h1 Horario 1 passado pelo Usuario
	 * @param h2 Horario 2 passado pelo Usuario
	 * @return -1 para quando um horario é menos que o outro
	 * @return  0 para quando um horario é igual o outro
	 * @return  1 para quando um horario e maior que o outro
	 */
	public static int compareTo(Horario h1, Horario h2) {
		if (h1.getHora() > h2.getHora()) return 1;
		else {
			if (h1.getHora() < h2.getHora()) return -1;
			else {
				if (h1.getMinutos() > h2.getMinutos()) return 1;
				else {
					if (h1.getMinutos() < h2.getMinutos()) return -1;
					else {
						if (h1.getSegundos() > h2.getSegundos()) return 1;
						else {
							if (h1.getSegundos() < h2.getSegundos()) return -1;
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
	 * Sobreposição do método toString em que retorna a hora, os minutos e os segundos,
	 * nessa ordem:  hh:mm:ss
	 * 
	 * @return uma String com o horario
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		if (this.getHora() > 9 && this.getMinutos() > 9 && this.getSegundos() > 9) {
			info.append(this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getHora() > 9 && this.getMinutos() > 9) {
			info.append(this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getHora() > 9 && this.getSegundos() > 9) {
			info.append(this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getMinutos() > 9 && this.getSegundos() > 9) {
			info.append("0" + this.getHora() + ":" + this.getMinutos() + ":" + this.getSegundos());
		}
		else if (this.getHora() > 9) {
			info.append(this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getMinutos() > 9) {
			info.append("0" + this.getHora() + ":" + this.getMinutos() + ":0" + this.getSegundos());
		}
		else if (this.getSegundos() > 9) {
			info.append("0" + this.getHora() + ":0" + this.getMinutos() + ":" + this.getSegundos());
		}
		else {
			info.append("0" + this.getHora() + ":0" + this.getMinutos() + ":0" + this.getSegundos());
		}
		return info.toString();
	}
	
}
