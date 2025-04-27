package CadastroVeiculos;

public non-sealed class Carro extends Veiculo {
	protected int cavalos;
	protected String cor;
	protected int nRodas;

	public Carro(String modelo, String marca, int ano, int cavalos, String cor, int nRodas) {
		super(modelo, marca,ano);
		this.cavalos = cavalos;
		this.cor = cor;
		this.nRodas = nRodas;
	}

	@Override
	public String exibirDados() {
		return "========== Carro ========== " + "\nMarca: " +  marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nForça do Motor: " + cavalos + " cavalos " + "\nNumero de Rodas: " +  nRodas + " rodas";
		
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getnRodas() {
		return nRodas;
	}

	public void setnRodas(int nRodas) {
		this.nRodas = nRodas;
	}

}
