package Escola;

public non-sealed class Professor extends PessoaEscola{
	protected String materia;
	protected String horarioAula;
	
	public Professor(String nome, String email, String senha) {
		super(nome, email, senha);
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		
	}
	
	public String getMatéria() {
		return materia;
	}

	public void setMatéria(String matéria) {
		this.materia = matéria;
	}

	public String getHorarioAula() {
		return horarioAula;
	}

	public void setHorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
	}

	@Override
	public String mostrarInformacoes() {
		
		return "========== Professor ==========" + "\nNome: " + nome + "\nEmail: " + email +  "\nSenha: " + senha + "\nMatéria: " + materia + "\nHorario de Aula: " + horarioAula;
	}

}
