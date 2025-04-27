package Empresa;

public abstract class Funcionario {
	protected String login;
	protected int codigo;
	protected String nome;
	protected double salario;
	
	public Funcionario(String login, int codigo, String nome, double salario) {
		this.login = login;
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario () {

	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public abstract double calcularBonus();
	
}

