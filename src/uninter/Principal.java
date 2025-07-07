package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		int opcaoEscolhida = 0;
		
		while(true) { // Menu principal
				System.out.println("-----------------------------------------"); 
				System.out.println("COFRINHO DA PRICILA - 1254995");
				System.out.println("-----------------------------------------");
				System.out.println("MENU");
				System.out.println("1. ADICIONAR MOEDA");
				System.out.println("2. REMOVER MOEDA");
				System.out.println("3. LISTAR MOEDAS");
				System.out.println("4. CALCULAR TOTAL CONVERTIDO PARA REAL");
				System.out.println("0. ENCERRAR");
				opcaoEscolhida = teclado.nextInt();	

				switch (opcaoEscolhida) {
					case 1: //Menu para escolher o tipo de moeda a ser adicionada
							System.out.println("ESCOLHA A MOEDA:");
							System.out.println("1. REAL:");
							System.out.println("2. EURO:");
							System.out.println("3. DOLAR:");
						
							int tipoMoeda = teclado.nextInt();
							System.out.println("DIGITE O VALOR:");
							double valor = teclado.nextDouble();
								
							if(tipoMoeda == 1) {
								cofrinho.adicionar(new Real(valor));
							}
							else if(tipoMoeda == 2) {
								cofrinho.adicionar(new Euro(valor));
							}
							else if(tipoMoeda == 3) {
								cofrinho.adicionar(new Dolar(valor));
							}
							else {
							System.out.println("OPÇAO INVALIDA");
							}
							break;
				
				case 2: // Remover moeda
					cofrinho.listarMoedas();
					System.out.println("ESCOLHA A MOEDA A SER REMOVIDA: ");
					int indice = teclado.nextInt();
					cofrinho.remover(indice);
					break;
					
				case 3: // Listar moedas adicionadas
					cofrinho.listarMoedas();
					break;
						
				case 4: //Mostrar o total convertido em reais
					System.out.println("TOTAL CONVERTIDO: R$ " + cofrinho.totalConvertido());
					break;

				default: //Encerrar a aplicaçao
					System.out.println("ENCERRANDO O COFRINHO...");
			}
		}
	}
}
