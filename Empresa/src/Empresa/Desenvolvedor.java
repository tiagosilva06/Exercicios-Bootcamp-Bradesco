package Empresa;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor (String login, int codigo, String nome, double salario) {
		super(login, codigo, nome, salario);
	}
	
	public Desenvolvedor () {

	}

	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return getSalario() * 0.1;
	}
	
	
}


