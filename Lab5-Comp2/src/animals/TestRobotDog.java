package animals;

public class TestRobotDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotDog robot = new RobotDog();
		robot.setName("bozinho");
		System.out.println("The Robot Dog's name is: " + robot.getName());
		robot.play();
		robot.beFriendly();
		robot.walk();
		robot.chargeBattery();
		
	}

}
