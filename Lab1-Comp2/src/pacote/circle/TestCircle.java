package pacote.circle;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle bolinha = new Circle();
		
		bolinha.setColour("Black");
		bolinha.setRadius(8.65);
		System.out.println("The bolinha's colour is: " + bolinha.getColor());
		System.out.println("The bolinha's radius is: " + bolinha.getRadius());
		System.out.println("The bolinha's area is: " + bolinha.getArea());
		System.out.println(bolinha.toString());
	}

}
