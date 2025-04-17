package Carro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SistemaCarro carro = new SistemaCarro();
		int opcao;
		
		
		do {
			System.out.println("");
			System.out.println("==== MENU ====");
			System.out.println("1 - Ligar o Carro");
			System.out.println("2 - Desligar o Carro");
			System.out.println("3 - Acelerar");
			System.out.println("4 - Diminuir Velocidade");
			System.out.println("5 - Virar para esquerda");
			System.out.println("6 - Virar para direita");
			System.out.println("7 - Verificar Velocidade");
			System.out.println("8 - Trocar marcha");
			System.out.println("0 - Sair do Carro");
			System.out.println("---------------------------");
			System.out.println("Escolha uma opção:");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				carro.ligar();
				break;
			case 2:
				carro.desligar();
				break;
			case 3:
				carro.acelerar();
				break;
			case 4:
				carro.frear();
				break;
			case 5:
				carro.virarEsquerda();
				break;
			case 6:
				carro.virarDireita();
				break;
			case 7:
				carro.verificarVelocidade();
				break;
			case 8:
				System.out.println("Indique para qual marcha deseja trocar (0 a 6) :");
				int marcha = entrada.nextInt();
				carro.trocarMarcha(marcha);
				break;
			case 0:
				System.out.println("Saindo do carro..");
				break;
			default:
				System.out.println("Opção Invalida. Tente novamente.");
				break;
			}
		} while (opcao != 0);
		
		entrada.close();
		
		
	}
}
