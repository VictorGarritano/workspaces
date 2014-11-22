package animals;

public class Dog extends Canine implements Pet {

	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Dog() {
		this.weight = 0.0;
	}
	
	public void print() {
		this.barks();
		this.beFriendly();
		this.eat();
		System.out.println("The dog's weight is: " + this.getWeight() + " kilos");
		this.makeNoise();
		this.play();
		this.roam();
		this.sleep();
		System.out.println("\n");
	}
	
	public Dog(double weight) {
		this.weight = weight;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Dog playing");
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Dog being friendly");
	}

}
