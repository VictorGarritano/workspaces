package pacote;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnimals ta = new TestAnimals();
		Animal a = ta.new Animal();
		Animal b = ta.new Horse();
		a.eat();
		b.eat();
	}

	class Animal {
		public void eat() {
			System.out.println("Generic Animal eating generically.");
		}
	}

	class Horse extends Animal {

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("Horse eating hay, oats and horse treats.");
		}

	}
}
