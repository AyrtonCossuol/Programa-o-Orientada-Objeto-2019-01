
public interface ObjetoGeometrico {
	Ponto centro() throws Exception;
	ObjetoGeometrico clona() throws Exception;
	double calculaArea();
	double calculaPerimetro();
}
