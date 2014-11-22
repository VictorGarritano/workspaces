package animals;

public class RobotDog implements Robot, Pet {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Robot Dog playing");
	}

	@Override
	public void beFriendly() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Robot Dog being friendly");
	}

	@Override
	public void chargeBattery() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Robot Dog charging my battery");
	}
	
	public void walk() {
		System.out.println("I'm a Robot Dog walking");
	}
}
