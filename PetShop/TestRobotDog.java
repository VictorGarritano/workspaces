public class TestRobotDog {

	public static void main(String[] args) {

		RobotDog bozinho = new RobotDog();

		bozinho.setName("bozinho");
		System.out.println("The robot's name is: " + bozinho.getName());
		bozinho.walk();
		bozinho.chargeBattery();
		bozinho.play();
		bozinho.beFriendly();
	}
}