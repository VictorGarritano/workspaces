package animals;

public abstract class Canine implements Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("I'm a canine making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm a canine eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("I'm a canine sleeping");
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("I'm a canine roaming");
	}
	
	public void barks() {
		System.out.println("I'm a canine barking");
	}
	
}
