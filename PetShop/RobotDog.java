public class RobotDog implements Robot, Pet {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void walk() {
		System.out.println("I'm a Robot Dog walking");
	}

	public void chargeBattery() {
		System.out.println("I'm a Robot Dog charging my battery");
	}

	public void play() {
		System.out.println("I'm a Robot Dog playing");
	}

	public void beFriendly() {
		System.out.println("I'm a Robot Dog being friendly");
	}
}