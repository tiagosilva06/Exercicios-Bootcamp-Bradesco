package Empresa;

public class Main {
	
	public static void main(String[] args) {
		//Funcionario dev = new Desenvolvedor("tiago.santos", 123, "Tiago da Silva Santos", 5000);
		//Funcionario gerente = new Gerente("Donna.santos", 321, "Donna Santos Heelan", 10000);
		
		Funcionario dev = new Desenvolvedor();
		dev.setCodigo(123);
		dev.setLogin("tiago.santos");
		dev.setNome("Tiago da Silva Santos");
		dev.setSalario(10000);
		
		Funcionario gerente = new Gerente();
		gerente.setCodigo(321);
		gerente.setLogin("donna.santos");
		gerente.setNome("Donna Santos Heelan");
		gerente.setSalario(10000);
		
		System.out.println("========== ENTERPRISE =============");
		System.out.println(" NOME - " + dev.getNome() + "\n SALÁRIO - " + dev.getSalario() + "\n SALARIO COM BONUS - "
				+ (dev.getSalario() + dev.calcularBonus()));
		
		System.out.println("\n NOME - " + gerente.getNome() + "\n SALÁRIO - " + gerente.getSalario() + "\n SALARIO COM BONUS - "
				+ (gerente.getSalario() + gerente.calcularBonus()));
		
		System.out.println("====================================");
	}
}



