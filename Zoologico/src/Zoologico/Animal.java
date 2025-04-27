package Zoologico;

public sealed abstract class Animal permits Leao, Elefante, Macaco {
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract String emitirSom();
	public abstract String alimentar();
}
