package animals;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class PetShop {
	public static void main(String[] args) {
		List<Animal> Petis = new ArrayList<>();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Cat c1 = new Cat();
		Cat c2 = new Cat();

		d1.setWeight(8.0);
		d2.setWeight(5.0);
		c1.setWeight(1.12);
		c2.setWeight(3.5);
		
		Petis.add(d1);
		Petis.add(d2);
		Petis.add(c1);
		Petis.add(c2);

		Iterator<Animal>it = Petis.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (Animal animal : Petis) {
			System.out.println("\n");
			if (animal instanceof Dog) {
				((Dog) animal).print();
			}
			if (animal instanceof Cat) {
				((Cat) animal).print();
			}
		}
	}
}