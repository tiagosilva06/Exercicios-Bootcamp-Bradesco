package Banco;

public class ContaBancaria {
	private double saldo;
	private double limiteChequeEspecial;
	private double valorUSadoChequeEspecial;
	
	public ContaBancaria (double valorInicial) {
		saldo = valorInicial;
		
		if(valorInicial <= 500) {
			limiteChequeEspecial = 50.0;
		} else {
			limiteChequeEspecial = valorInicial * 0.5;
		}
		valorUSadoChequeEspecial = 0;
	}
	
	public void consultarSaldo() {
		System.out.printf("Saldo Atual: R$ %.2f", saldo);
	}
	
	public void consultarChequeEspecial () {
		System.out.printf("Limite do Cheque Especial: R$ %.2f%n", limiteChequeEspecial);
		System.out.printf("Valor usado do Cheque Especial: R$ %.2f%n", valorUSadoChequeEspecial);
		System.out.printf("Total Disponivel: R$ %.2f%n", limiteChequeEspecial - valorUSadoChequeEspecial);
	}
	 public void depositar(double valor) {
		 if(valorUSadoChequeEspecial > 0) {
			 double totalDivida = valorUSadoChequeEspecial * 1.2;
			 
			 if(valor >= totalDivida) {
				 valor -= totalDivida;
				 valorUSadoChequeEspecial = 0;
				 saldo += valor;
				 System.out.println("Cheque especial quitado com juros e saldo atualizado.");
			 } else {
				 valorUSadoChequeEspecial -= (valor / 1.2);
				 System.out.println("Parte do cheque especial foi pago com o deposito.");
				 return;
			 }
		 } else {
			 saldo += valor;
			 System.out.println("Deposito realizado com sucesso.");
		 }
	 }
	 
	 public void sacar(double valor) {
		 if(valor <= saldo) {
			 saldo -= valor;
			 System.out.println("Saque efetuado com sucesso!");
		 } else {
			 double totalDisponivel = saldo + (limiteChequeEspecial - valorUSadoChequeEspecial);
			 
			 if(valor <= totalDisponivel) {
				 double restante = valor - saldo;
				 saldo = 0;
				 valorUSadoChequeEspecial += restante;
				 System.out.println("Saque efetuado utilizando o cheque especial");
			 } else {
				 System.out.println("Saldo insuficiente, mesmo utilizando cheque especial.");
			 }
		 }
		 
	 }
	 
	 public void boleto(double valor) {
		 sacar(valor);
	 }
	 
	 public boolean isUsandoChequeEspecial() {
		 return valorUSadoChequeEspecial > 0;
	 }
}
