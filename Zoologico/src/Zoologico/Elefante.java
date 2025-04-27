package Zoologico;

public non-sealed class Elefante extends Animal {

	public Elefante(String nome, int idade) {
		super(nome, idade);
	}
	
	public String gerarSom() {
		return "*BARULHO DA TROMBA DO ELEFANTE*";
	}
	
	public String mensagemAlimento() {
		return "Alimentando o elefante com amendoim";
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
