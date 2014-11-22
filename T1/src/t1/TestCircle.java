package t1;

public class TestCircle {
	public static void main(String [] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setRadius(0.5);
		c2.setRadius(1.0);
		
		System.out.println("The c1's radius is: " + c1.getRadius());
		System.out.println("The c2's radius is: " + c2.getRadius());
		
		c1.setPositionX(1);
		c1.setPositionY(1);
		c2.setPositionX(3);
		c2.setPositionY(2);
	
		System.out.println("The coordinates of c1 are: " + "(" + c1.getPositionX() + "," + c1.getPositionY() + ")");
		System.out.println("The coordinates of c2 are: " + "(" + c2.getPositionX() + "," + c2.getPositionY() + ")");
		
		System.out.println("The distance between c1 and c2 is: " + c1.distanceToShape(c2));
		
	}
	
	
}
