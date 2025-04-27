package CadastroVeiculos;

public sealed abstract class Veiculo permits Carro, Moto, Caminhao {
	protected String modelo;
	protected String marca;
	protected int ano;
	
	public Veiculo(String modelo, String marca, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public abstract String exibirDados();
	
}
