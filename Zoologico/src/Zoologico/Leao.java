package Zoologico;

public non-sealed class Leao extends Animal {
	String alimento;
	String som;
	
	public Leao(String nome, int idade) {
		super(nome, idade);
	}
	
	public String gerarSom() {
		return "*RUGIDO DE LEÃO*";
	}

	public String mensagemAlimento() {
		return "Alimentando o Leão com 1kg de Carne";
	}

	@Override
	public String emitirSom() {
		return gerarSom();
	}

	@Override
	public String alimentar() {
		return mensagemAlimento();
	}

}
