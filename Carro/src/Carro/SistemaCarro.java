package Carro;

public class SistemaCarro {
	private boolean ligado;
	private int velocidade;
	private int marcha;
	
	public void Carro () {
		ligado = false;
		velocidade = 0;
		marcha = 0;
		
	}
	
	public void ligar () {
		if(!ligado) {
			ligado = true;
			System.out.println("Carro Ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}
	
	public void desligar () {
		if(!ligado) {
			System.out.println("O carro já está desligado");
		} else if (velocidade == 0 && marcha == 0) {
			ligado = false;
			System.out.println("O carro foi desligado.");
		} else {
			System.out.println("O carro não pode ser desligado em movimento");
		}
	}
	
	public void acelerar() {
		if (!ligado) {
			System.out.println("O carro está desligado. Ligue-o para poder acelerar.");
			return;
		}
		
		if(marcha == 0) {
			System.out.println("O carro não pode acelerar em ponto morto.");
			return;
		}
		
		if (velocidade == 120) {
			System.out.println("Velocidade máxima atingida.");
			return;
		}
		
		int novaVelocidade = velocidade + 1;
		if(verificarVelocidadePermitida(novaVelocidade)) {
			velocidade = novaVelocidade;
			System.out.println("Acelerando. Velocidade atual:" + velocidade + " km/h");
		} else {
			System.out.println("Troque de marcha para acelerar mais");
		}
	}
	
	public void frear () {
		if (!ligado) {
			System.out.println("O carro está desligado. Não é possivel frear.");
			return;
		}
		
		if (velocidade > 0) {
			velocidade--;
			System.out.println("Freando. Velocidade atual:" + velocidade + " km/h\"");
		} else {
			System.out.println("O carro já está parado.");
		}
	}
	
	public void virarEsquerda () {
		if (velocidade >= 1 && velocidade <= 40) {
			System.out.println("Virando á esquerda");
		} else {
			System.out.println("Só é possivel virar á esquerda até 40 km/h");
		}
	}
	
	public void virarDireita () {
		if (velocidade >= 1 && velocidade <= 40) {
			System.out.println("Virando á direita");
		} else {
			System.out.println("Só é possivel virar á direita até 40 km/h");
		}
	}
	
	public void verificarVelocidade () {
		System.out.println("Velocidade Atual: " + velocidade + " km/h" );
	}
	
	public void trocarMarcha(int novaMarcha) {
		if(!ligado) {
			System.out.println("O carro está desligado. Ligue o carro antes de trocar de marcha.");
			return;
		}
		
		if(novaMarcha < 0 || novaMarcha > 6) {
			System.out.println("Marcha Invalida. As marchas vão de 0 a 6.");
			return;
		}
		
		if(Math.abs(novaMarcha - marcha) > 1) {
			System.out.println("Não é possivel pular marchas. Troque uma por vez.");
			return;
		}
		
		marcha = novaMarcha;
		System.out.println("Marcha atual: " + marcha);
	}
	
	private boolean verificarVelocidadePermitida(int velocidade) {
		switch (marcha) {
		case 1:
			return velocidade <= 20;
		case 2:
			return velocidade >= 21 && velocidade <= 40;
		case 3:
			return velocidade <= 41 && velocidade <= 60;
		case 4:
			return velocidade <= 61 && velocidade <= 80;
		case 5:
			return velocidade <= 81 && velocidade <= 100;
		case 6:
			return velocidade <= 101 && velocidade <= 120;
		default:
			return false;
		}
	}
	
}
