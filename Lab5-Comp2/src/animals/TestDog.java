package animals;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog doge = new Dog();
		doge.setWeight(55);
		doge.print();
		
		System.out.println("\n");
		
		Dog dogee = new Dog(80);
		dogee.print();
	}

}
