
public class Bat extends Mammal{
	
	public void setBatEnergy() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel -= 50; 
		System.out.println("Shoooshww");
		displayEnergy();
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Yum Yum :) cruch");
		displayEnergy();
	}
	 
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("teSH teSH");
		displayEnergy();
		
	}
}
