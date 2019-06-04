import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exemplo de:
 * 1. Uso da calsse ConjuntoSorteio. Que vai gerar, a partir de um sorteio, uma certa quantidade de valores (definido pelo usuario)
 * e vai gerar tambem uma certa quantidade de sorteios (tambem definido pelo usuario), com uma respectiva data para cada sorteio.
 * 2. Serialização de objetos
 *
 *<p>
 *Vale ressaltar que foram utilizados as colecoes:
 *        LinkedList para agrupar todo o conjunto de sorteio
 *        e uma TreeSet para organizar os numeros sorteados.
 *<p>
 *As classes foram encapsuladas afim de melhorar a legilibidade e manutencao do codigo
 *<p>
 *O resultado eh depois gravado em um arquivo de texto no disco atraves da serializacao
 *
 * @author Ayrton S. C.
 */
public class Uso {

	public static void main(String[] args) {

		try {
			ConjuntoSorteio teste = new ConjuntoSorteio();
			teste.insere(30,12,1998,10,10,50,5);
			System.out.println(teste);

			Arquivo.grava("arquivo.my", teste);
			ConjuntoSorteio teste_2;
			teste_2 = (ConjuntoSorteio) Arquivo.le("arquivo.my");
			System.out.println("Dados lidos do arquivo:\n"+ teste_2.toString());


			BufferedWriter arqSaida;
			arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));
			// O método write grava a string no arquivo texto.
			// Deve ser chamado para cada objeto, com o seu respectivo toString().
			// Normalmente aparece dentro de um laço que percorre toda coleção
			// que contém os objetos que serão gravados.
			// O "\r\n" é necessário para colocar os objetos um em cada linha
			// (o WordPad, Word, InternetExplorer também aceitam "\n" ou "\r", mas
			// O Bloco de Notas, por exemplo, só aceita "\r\n")
			arqSaida.write(teste.toString()+"\r\n\n");
			arqSaida.close();

		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		catch(IOException e) {
			System.out.println("Problemas na leitura ou gravação do arquivo");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Classe inexistente usada na conversão");
		}
		catch (Exception e) {
			System.out.println("Data invalida!");
		}
	}
}
