package pacote;

public class Animal {
	static void doStuff() {
		System.out.println("animal ");
	}
}

class Dog extends Animal {
	static void doStuff() { // Redefining;
		System.out.println("dog "); // Not Overriding
	}
}

