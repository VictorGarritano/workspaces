package animals;

public abstract class Feline implements Animal {

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("I'm a feline making noise");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm a feline eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("I'm a feline sleeping");
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		System.out.println("I'm a feline roaming");
	}
	
	public void scratch() {
		System.out.println("I'm a feline scratching");
	}

}
