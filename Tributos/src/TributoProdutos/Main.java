package TributoProdutos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Produto macarrao = new Alimentacao("Macarrão", 9.50);
		Produto camiseta = new Vestuario("Camiseta de Linho", 150.00);
		Produto whey = new SaudeBemEstar("Whey de baunilha", 120.00);
		Produto revista = new Cultura("Revista", 11.99);
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println("\n======SUPERMERCADO======");
			System.out.println("1 - Macarrão (R$9,50)");
			System.out.println("2 - Camiseta de linho (R$150,0)");
			System.out.println("3 - Whey de baunilha (R$120,0)");
			System.out.println("4 - Revista (R$11,99)");
			System.out.println("5 - Sair do mercado.");
			System.out.println("========================");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				System.out.println("Comprando macarrão");
				System.out.println("Calculando valor do produto com o imposto..");
				System.out.printf("Valor final - R$%.2f", macarrao.getPreco() + macarrao.calcularImposto());
				System.out.println("");
			} else if (opcao == 2) {
				System.out.println("Comprando camiseta de linho");
				System.out.println("Calculando valor do produto com o imposto..");
				System.out.printf("Valor final - R$%.2f", camiseta.getPreco() + camiseta.calcularImposto());
				System.out.println("");
			} else if (opcao == 3) {
				System.out.println("Comprando whey");
				System.out.println("Calculando valor do produto com o imposto..");
				System.out.printf("Valor final - R$%.2f", whey.getPreco() + whey.calcularImposto());
				System.out.println("");
			} else if (opcao == 4) {
				System.out.println("Comprando revista");
				System.out.println("Calculando valor do produto com o imposto..");
				System.out.printf("Valor final - R$%.2f", revista.getPreco() + revista.calcularImposto());
				System.out.println("");
			} else if (opcao == 5) {
				System.out.println("Saindo do mercado.");
				break;
			} else {
				System.out.println("Invalido. Escolha um produto existente..");
				System.out.println("");
			}
		}
		entrada.close();
	}
}
