	package Escola;

public sealed abstract class PessoaEscola permits Professor, Aluno {
	protected String nome;
	protected String email;
	protected String senha;
	
	public PessoaEscola(String nome, String email, String senha) {
		
	}
	
	public abstract String mostrarInformacoes();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
