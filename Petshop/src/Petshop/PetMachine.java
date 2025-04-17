package Petshop;

public class PetMachine {
	
	private boolean clean = true;
	private int water = 30;
	private int shampoo = 10;
	
	private Pet pet;
	
	public void takeAShower() {
		if (this.pet == null) {
			System.out.println("Coloque o Pet na máquina de banho para iniciar");
			return;
		}
		
		this.water -= 10;
		this.shampoo -= 2;
		pet.setClean(true);
		System.out.println("O Pet " + pet.getName() + " esta limpo");
	}
	
	public void addWater () {
		if (water == 30) {
			System.out.println("A capácidade de água da maquina de banho está no limite permitido");
			return;
		}
		
		water += 2;
	}
	
	public void addShampoo () {
		if (shampoo == 10) {
			System.out.println("A capácidade de shampoo da maquina de banho está no limite permitido");
			return;
		}
		
		shampoo += 2;
	}
	

	public int getWater() {
		return water;
	}
	public int getShampoo() {
		return shampoo;
	}

	
	
	public boolean hasPet() {
		return pet != null;
	}
	public void setPet(Pet pet) {
		
		if (!this.clean) {
			System.out.println("A maquina está suja. Para colocar o Pet é preciso limpa-la.");
			return;
		}
		
		if(hasPet()) {
			System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
			return;
		}
		
		this.pet = pet;
		System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

	}
	
	public void removePet () {
		this.clean = this.pet.isClean();
		
		System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina ");
		this.pet = null;
	}
	
	public void wash() {
		this.water -= 10;
		this.shampoo -= 2;
		this.clean = true;
		System.out.println("A máquina foi limpa");
	}
	
	
	
	
}
