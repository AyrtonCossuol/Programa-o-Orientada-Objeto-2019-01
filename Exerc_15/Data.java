import java.util.Date;

@SuppressWarnings("serial")
public class Data extends Date {	
	
	public static int stringMonth(String m) {
		if (m.equals("janeiro"))return 1;
		if (m.equals("fevereiro")) return 2;
		if (m.equals("marco")) return 3;
		if (m.equals("abril")) return 4;
		if (m.equals("maio")) return 5;
		if (m.equals("junho")) return 6;
		if (m.equals("julho")) return 7;
		if (m.equals("agosto")) return 8;
		if (m.equals("setembro")) return 9;
		if (m.equals("outubro")) return 10;
		if (m.equals("novembro")) return 11;
		if (m.equals("dezembro")) return 12;
		return 0;
	}
	
	@SuppressWarnings("deprecation")
	public void setMonth(String m){                       //asadas
		super.setMonth(Data.stringMonth(m) - 1);
	}
	
	@SuppressWarnings("deprecation")
	public int getMonth(){
		return super.getMonth() + 1;
	}
	
	public int quantidadeDias(Data data1) {
		long quantidade = 0;
		quantidade = (long)((this.getTime() - data1.getTime()) / (1000 * 60 * 24));
		if (quantidade < 0)
			quantidade = -quantidade;
		return (int)quantidade;

	}

	public void incrementa(long millisegundos) {
		long quantidade;
		quantidade = this.getTime() + millisegundos;
		this.setTime(quantidade);
	}
	
}
