package pacote;

public class TestOverriding {
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int i = 0; i < a.length; i++) {
			Animal.doStuff(); // invoke the static method
		}
	}
}