package CadastroVeiculos;

public non-sealed class Moto extends Veiculo{

	protected int cilindradas;
	protected String cor;
	protected int nRodas;

	public Moto(String modelo, String marca, int ano, int cilindradas, String cor, int nRodas) {
		super(modelo, marca,ano);
		this.cilindradas = cilindradas;
		this.cor = cor;
		this.nRodas = nRodas;
	}

	@Override
	public String exibirDados() {
		return "========== Moto ========== " + "\nMarca: " +  marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nForça do Motor: " + cilindradas + " cilindradas " + "\nNumero de Rodas: " +  nRodas + " rodas";
		
	}

	
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
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
