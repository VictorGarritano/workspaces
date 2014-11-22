package animals;

public class Cat extends Feline implements Pet {

	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Cat() {
		this.weight = 0.0;
	}
	
	public Cat(double weight) {
		this.weight = weight;
	}
	
	public void print() {
		this.beFriendly();
		this.eat();
		System.out.println("The cat's weight is: " + this.getWeight() + " kilos");
		this.makeNoise();
		this.play();
		this.roam();
		this.scratch();
		this.sleep();
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm a cat playing");
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("I'm a cat being friendly");
	}

}
