package Zoologico;

public non-sealed class Macaco extends Animal {

	public Macaco(String nome, int idade) {
		super(nome, idade);
	}

	
	public String gerarSom() {
		return "*GRITO DE MACACO*";
	}
	
	public String mensagemAlimento() {
		return "Alimentando o macaco com banana";
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
