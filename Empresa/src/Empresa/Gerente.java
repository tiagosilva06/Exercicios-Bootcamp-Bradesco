package Empresa;

public class Gerente extends Funcionario {

	public Gerente(String login, int codigo, String nome, double salario) {
		super(login, codigo, nome, salario);
	}
	
	public Gerente () {

	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.3;
	}

}
