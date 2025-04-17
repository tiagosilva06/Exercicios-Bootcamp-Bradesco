package Banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor de deposito inicial para criação de sua conta R$");
		double valorInicial = entrada.nextDouble();
		
		ContaBancaria contaBancaria = new ContaBancaria(valorInicial);
		int opcao;
		
		do {
			System.out.println("\n  BANCO DIGITAL  ");
			System.out.println("=================");
			System.out.println("----  MENU  ----");
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Consultar Cheque Especial");
			System.out.println("3 - Depositar Dinheiro");
			System.out.println("4 - Sacar Dinheiro");
			System.out.println("5 - Pagar um Boleto");
			System.out.println("6 - Estou usando Cheque Especial?");
			System.out.println("0 - Sair de sua Conta Bancária");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				contaBancaria.consultarSaldo();
				break;
			case 2:
				contaBancaria.consultarChequeEspecial();
				break;
			case 3:
				System.out.println("Insira o valor que deseja depositar R$");
				double valorDeposito = entrada.nextDouble();
				contaBancaria.depositar(valorDeposito);
				break;
			case 4:
				System.out.println("Insira o valor que deseja sacar R$");
				double valorSaque = entrada.nextDouble();
				contaBancaria.sacar(valorSaque);
				break;
			case 5:
				System.out.println("Insira o valor do boleto R$");
				double valorBoleto = entrada.nextDouble();
				contaBancaria.boleto(valorBoleto);
				break;
			case 6:
				if (contaBancaria.isUsandoChequeEspecial()) {
					System.out.println("Você está utilizando o Cheque Especial");
				} else {
					System.out.println("Você NÃO está utilizando o Cheque Especial");
				}
				break;
			case 0:
				System.out.println("Saindo... Obrigado por usar o sistema.");
				break;
			default:
				System.out.println("Opção Invalida.. Tente Novamente.");
				break;
			}
		} while (opcao != 0);
		
		entrada.close();
	}
}
