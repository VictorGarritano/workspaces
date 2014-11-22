package animals;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.setWeight(4.5);
		cat.print();
		
		System.out.println("\n");
		
		Cat cate = new Cat(5);
		cate.print();
	}

}
