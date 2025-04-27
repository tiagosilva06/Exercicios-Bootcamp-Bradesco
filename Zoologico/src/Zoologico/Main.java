package Zoologico;

public class Main {
	
	public static void main(String[] args) {
		Animal elefante = new Elefante("Dumbo", 10);
		Animal leao = new Leao("ALex", 5);
		Animal macaco = new Macaco("Cesar", 12);
		
		System.out.println("========== ZOOLOGICO ==========");
		System.out.println("Status Leão - " + leao.getNome() + ", " + leao.getIdade() + " anos");
		System.out.println(leao.emitirSom());
		System.out.println(leao.alimentar());
		
		System.out.println("\nStatus Elefante - " + elefante.getNome() + ", " +  elefante.getIdade() + " anos");
		System.out.println(elefante.emitirSom());
		System.out.println(elefante.alimentar());
		
		System.out.println("\nStatus Macaco - " + macaco.getNome() + ", " + macaco.getIdade() + " anos");
		System.out.println(macaco.emitirSom());
		System.out.println(macaco.alimentar());
		
		System.out.println("===============================");
		
		
	}
}
