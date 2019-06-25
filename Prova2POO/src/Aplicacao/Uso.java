package Aplicacao;
import codigos.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * Uso com intuito de ter uma agenda onde pode haver um Evento, uma Meta e um Lembrete
 * todas sendo armazenadas em uma linkedList para melhor agrupamento.
 * <p>
 * 
 * @author Ayrton S. C
 * @version 1.0 (junho - 2019)
 *
 */
public class Uso {

	public static void main(String[] args) {
		Agenda itensDaAgenda = new Agenda();
		int op = 1, diaIn, mesIn, anoIn, diaFim, mesFim, anoFim, horaIn, minuIn, seguIn, horaFim, minuFim, seguFim;
		int prioridade, minAntecedencia, ver = 0;
		String registro, descricao, local;
		Data dataInicio, dataFim;
		Horario horarioInicio, horarioFim;
		Periodo periodo = null;
		Evento evento = null;
		Meta meta = null;
		Lembrete lembrete = null;
		
		
		System.out.println("-------------AGENDA-------------");
		while (op != 0) {
			System.out.println("1 - Adicionar um evento\n2 - Adicionar uma meta\n3 - Adicionar um lembrete\n"
					+ "4 - Exibir todos os itens da agenda\n5 - Exibir todos os itens em um intervalo de data\n"
					+ "6 - Exibir as metas em ordem de prioridade\n7 - Exibir lembretes por minutos de antecedencia\n"
					+ "8 - Exibir eventos por ordem de local\n9 - Salvar agenda em disco\n10 - Recuperar agenda do disco\n"
					+ "0 - Sair: ");
			op = new Scanner(System.in).nextInt();
			if (op == 1) {
				System.out.println("Entre com o nome do registro do evento: ");
				registro = new Scanner(System.in).nextLine();
				System.out.println("Entre com a descricao do evento: ");
				descricao = new Scanner(System.in).nextLine();
				System.out.println("Entre com o local do evento: ");
				local = new Scanner(System.in).nextLine();
				while (true) {
					ver = 0;
					while (true) {
						System.out.println("Entre com a data de inicio do evento");
						System.out.println("Dia: ");
						diaIn = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesIn = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataInicio = new Data(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino do evento");
						System.out.println("Dia: ");
						diaFim = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesFim = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new Data(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					if (Data.compareTo(dataInicio, dataFim) == 1) {
						System.out.println("A data inicial deve vim antes da final!!");
					}
					else if (Data.compareTo(dataInicio, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio do evento");
						System.out.println("Horas: ");
						horaIn = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuIn = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguIn = new Scanner(System.in).nextInt();
						try {
							horarioInicio = new Horario(horaIn,minuIn,seguIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino do evento");
						System.out.println("Horas: ");
						horaFim = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuFim = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minuFim,seguFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					if (ver == 1 && Horario.compareTo(horarioInicio, horarioFim) == 1) {
						System.out.println("O horario inicial deve vim antes do final!!");
					}
					else {
						break;
					}
				}
				
				periodo = new Periodo(dataInicio,dataFim,horarioInicio,horarioFim);
				evento = new Evento(registro, descricao, periodo, local);
				itensDaAgenda.insereItem(evento);
				System.out.println("Evento adicionado com sucesso!!\n");
			}
			else if (op == 2) {
				System.out.println("Entre com o nome do registro da meta: ");
				registro = new Scanner(System.in).nextLine();
				System.out.println("Entre com a descricao da meta: ");
				descricao = new Scanner(System.in).nextLine();
				while (true) {
					ver = 0;
					while (true) {
						System.out.println("Entre com a data de inicio da meta:");
						System.out.println("Dia: ");
						diaIn = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesIn = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataInicio = new Data(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino da meta:");
						System.out.println("Dia: ");
						diaFim = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesFim = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new Data(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					if (Data.compareTo(dataInicio, dataFim) == 1) {
						System.out.println("A data inicial deve vim antes da final!!");
					}
					else if (Data.compareTo(dataInicio, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio da meta:");
						System.out.println("Horas: ");
						horaIn = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuIn = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguIn = new Scanner(System.in).nextInt();
						try {
							horarioInicio = new Horario(horaIn,minuIn,seguIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino da meta:");
						System.out.println("Horas: ");
						horaFim = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuFim = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minuFim,seguFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					if (ver == 1 && Horario.compareTo(horarioInicio, horarioFim) == 1) {
						System.out.println("O horario inicial deve vim antes do final!!");
					}
					else {
						break;
					}
				}
				
				periodo = new Periodo(dataInicio,dataFim,horarioInicio,horarioFim);
				while (true) {
					System.out.println("Entre com a prioridade da meta: ");
					prioridade = new Scanner(System.in).nextInt();
					try {
						meta = new Meta(registro, descricao, periodo, prioridade);
						break;
					} catch (Exception e) {
						System.out.println("Valor invalido!!");
					}
				}
				itensDaAgenda.insereItem(meta);
				System.out.println("Meta adicionada com sucesso!!\n");
			}
			else if (op == 3) {
				ver = 0;
				System.out.println("Entre com o nome do registro do lembrete: ");
				registro = new Scanner(System.in).nextLine();
				System.out.println("Entre com a descricao do lembrete: ");
				descricao = new Scanner(System.in).nextLine();
				
				while (true) {
					while (true) {
						System.out.println("Entre com a data de inicio do lembrete:");
						System.out.println("Dia: ");
						diaIn = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesIn = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataInicio = new Data(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					while (true) {
						System.out.println("Entre com a data de termino do lembrete:");
						System.out.println("Dia: ");
						diaFim = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesFim = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new Data(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					if (Data.compareTo(dataInicio, dataFim) == 1) {
						System.out.println("A data inicial deve vim antes da final!!");
					}
					else if (Data.compareTo(dataInicio, dataFim) == 0) {
						ver++;
						break;
					}
					else {
						break;
					}
				}
				
				while (true) {
					while (true) {
						System.out.println("Entre com o horario de inicio do lembrete:");
						System.out.println("Horas: ");
						horaIn = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuIn = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguIn = new Scanner(System.in).nextInt();
						try {
							horarioInicio = new Horario(horaIn,minuIn,seguIn);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					while (true) {
						System.out.println("Entre com o horario de termino do lembrete:");
						System.out.println("Horas: ");
						horaFim = new Scanner(System.in).nextInt();
						System.out.println("Minutos: ");
						minuFim = new Scanner(System.in).nextInt();
						System.out.println("Segundos: ");
						seguFim = new Scanner(System.in).nextInt();
						try {
							horarioFim = new Horario(horaFim,minuFim,seguFim);
							break;
						} catch (Exception e) {
							System.out.println("Horario invalido!!");
						}
					}
					if (Data.compareTo(dataInicio, dataFim) == 1) {
						System.out.println("A data inicial deve vim antes da final!!");
					}
					if (ver == 1 && Horario.compareTo(horarioInicio, horarioFim) == 1) {
						System.out.println("O horario inicial deve vim antes do final!!");
					}
					else {
						break;
					}
				}
				periodo = new Periodo(dataInicio,dataFim,horarioInicio,horarioFim);
				while (true) {
					System.out.println("Entre com a quantidade de minutos de antecedencia para o alerta: ");
					minAntecedencia = new Scanner(System.in).nextInt();
					try {
						lembrete = new Lembrete(registro, descricao, periodo, minAntecedencia);
						break;
					} catch (Exception e) {
						System.out.println("Valor invalido!!");
					}
				}
				itensDaAgenda.insereItem(lembrete);
				System.out.println("Lembrete adicionado com sucesso!!\n");
			}
			else if (op == 4) {
				System.out.println(itensDaAgenda.getItensDaAgenda());
			}
			else if (op == 5) {
				while (true) {
					while (true) {
						System.out.println("Entre com a data inicial do intervalo: ");
						System.out.println("Dia: ");
						diaIn = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesIn = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoIn = new Scanner(System.in).nextInt();
						try {
							dataInicio = new Data(diaIn,mesIn,anoIn);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					while (true) {
						System.out.println("Entre com a data final do intervalo: ");
						System.out.println("Dia: ");
						diaFim = new Scanner(System.in).nextInt();
						System.out.println("Mes: ");
						mesFim = new Scanner(System.in).nextInt();
						System.out.println("Ano: ");
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new Data(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida!!");
						}
					}
					if (Data.compareTo(dataInicio, dataFim) == 1) {
						System.out.println("A data inicial deve vim antes da final!!");
					}
					else {
						break;
					}
				}
				System.out.println(itensDaAgenda.infItensIntervaloData(dataInicio, dataFim));
			}
			else if (op == 6) {
				System.out.println(itensDaAgenda.infMetasPrioridade().toString());
			}
			else if (op == 7) {
				System.out.println(itensDaAgenda.infLembretesMinAntecedencia().toString());
			}
			else if (op == 8) {
				List<Evento> teste = new LinkedList<Evento>();
				teste = itensDaAgenda.infEventosLocal();
				System.out.println(teste);
			}
			else if (op == 9) {
				try {
					BufferedWriter arqSaida;
					arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));  
					arqSaida.write(itensDaAgenda.toString()+"\r\n");
					arqSaida.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			else if (op == 10) {
				try {
					BufferedReader arqEnt;
					arqEnt = new BufferedReader(new FileReader("C:\\Users\\Ayrton\\workspace\\Prova2POO\\arquivo_de_saida.txt"));
					int i;    
			          while((i=arqEnt.read())!=-1)    
			          System.out.print((char)i);    
			          arqEnt.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			else if (op == 0) {
				break;
			}
			else {
				System.out.println("Opcao invalida!!\n");
			}
		}
	}
}
