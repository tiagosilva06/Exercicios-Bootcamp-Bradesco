package TributoProdutos;

public class Vestuario extends Produto {

	public Vestuario(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularImposto() {
		return preco * 0.25;
	}

}
