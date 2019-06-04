import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Oferece métodos estáticos de gravação e leitura de objetos no disco
 * através de serialização.
 *
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 */
public abstract class Arquivo {
	/**
	 * Realiza gravação de um objeto no disco
	 * @param nomeArquivo nome do arquivo que será criado na gravação
	 * @param objeto instância que será gravada no arquivo
	 * @exception IOException problemas na criação do arquivo ou gravação
	 */
	static public void grava(String nomeArquivo, Object objeto) throws IOException {
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
		buffer.writeObject(objeto);
		buffer.close();
	}

	/**
	 * Realiza leitura de um objeto no arquivo
	 * @param nomeArquivo nome do arquivo a ser lido
	 * @return retorna uma instância da classe Object lida do arquivo
	 * @exception IOException problemas na leitura do arquivo
	 * @exception ClassNotFoundException problemas na conversão do objeto lido
	 */
	static public Object le(String nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(nomeArquivo));
		Object objeto = buffer.readObject();
		buffer.close();
		return objeto;
	}
}
