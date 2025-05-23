package Petshop;
import java.util.Scanner;

public class Main {
	
	private final static Scanner entrada = new Scanner (System.in);
	
	private final static PetMachine petMachine = new PetMachine();
	
	public static void main(String[] args) {		
		
		var option = -1;
		
		do {
			System.out.println("");
			System.out.println("=== Escolha uma das opções ===");
			System.out.println("1 - Dar banho no Pet");
			System.out.println("2 - Abastecer máquina com água");
			System.out.println("3 - Abastecer máquina com shampoo");
			System.out.println("4 - Verificar água da máquina");
			System.out.println("5 - Verificar shampoo da máquina");
			System.out.println("6 - Verificar se tem Pet no banho");
			System.out.println("7 - Colocar o Pet na máquina");
			System.out.println("8 - Retirar Pet da máquina");
			System.out.println("9 - Limpar a máquina");
			System.out.println("10 - Sair..");
			option = entrada.nextInt();
			
			switch(option) {
			
				case 1 -> petMachine.takeAShower();
				case 2 -> setWater();
				case 3 -> setShampoo();
				case 4 -> verifyWater();
				case 5 -> verifyShampoo();
				case 6 -> checkIfHasPetInMachine();
				case 7 -> setPetInPetMachine();
				case 8 -> petMachine.removePet();
				case 9 -> petMachine.wash();
				case 10 -> System.exit(10);
				default -> System.out.println("Opção Invalida");
				
			}
			
			
		} while (option != 10);
	}

	private static void setWater() {
		System.out.println("Tentando colocar água na maquina");
		petMachine.addWater();
	}
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na maquina");
		petMachine.addShampoo();
	}
	
	private static void verifyWater() {
		var amount = petMachine.getWater();
		System.out.println("A máquina está no momento com " + amount +  " litro(s) de agua");
	}
	private static void verifyShampoo() {
		var amount = petMachine.getShampoo();
		System.out.println("A máquina está no momento com " + amount +  " litro(s) de shampoo");
	}
	
	
	public static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? " Tem Pet na máquina " : " não tem Pet na máquina");
	}
	
	public static void setPetInPetMachine() {
		
		var name = "";
		while(name == null || name.isEmpty()) {
			System.out.println("Informe o nome do Pet");
			name = entrada.next();
		}
		
		var pet = new Pet(name);
		petMachine.setPet(pet);
	}
	
}
