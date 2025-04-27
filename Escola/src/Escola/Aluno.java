package Escola;

public non-sealed class Aluno extends PessoaEscola {
	protected String turma;
	protected String idade;
	
	public Aluno(String nome, String email, String senha) {
		super(nome, email, senha);
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	
	@Override
	public String mostrarInformacoes() {
		return "========== Aluno ==========" + "\nNome: " + nome + "\nIdade: " + idade + "\nEmail: " + email +  "\nSenha: " + senha + "\nTurma: " + turma; 
	}

}
