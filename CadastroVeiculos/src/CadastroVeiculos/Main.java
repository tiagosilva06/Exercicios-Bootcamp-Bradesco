package CadastroVeiculos;

public class Main {
	public static void main(String[] args) {
		Veiculo carro = new Carro("Civic G10", "Honda", 2024, 500, "Preto", 4);
		Veiculo moto = new Moto("Ninja", "Cavazaki", 2025, 300, "Verde", 2);
		Veiculo caminhao = new Caminhao("Optimus Prime", "Mercedes Benz", 2026, 400, "Azul e Vermelho", 8);
		
		System.out.print(carro.exibirDados());
		System.out.println("\n" + moto.exibirDados());
		System.out.println(caminhao.exibirDados());
	}
	
}
