package animals;


import java.util.List;
import java.util.ArrayList;

public class PetShop {
	public static void main(String[] args) {
		List<Animal> Petis = new ArrayList<>();
		Dog d1 = new Dog(10.2);
		Dog d2 = new Dog(5.7);
		Cat c1 = new Cat(2.2);
		Cat c2 = new Cat(3.0);

		Petis.add(d1);
		Petis.add(d2);
		Petis.add(c1);
		Petis.add(c2);

		for (Animal a : Petis) {
			if (a instanceof Dog) {
				((Dog) a).print();
			}
			if (a instanceof Cat) {
				((Cat) a).print();
			}
		}
	}
}