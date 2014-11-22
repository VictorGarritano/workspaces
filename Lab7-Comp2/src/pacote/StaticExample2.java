package pacote;

public class StaticExample2 {
	static double x;
	static void printx() {
		System.out.println("x = " + x);
		
	}
	
//	double y;
//	void printy() {
//		System.out.println("y = " + y);
//		
//	}
	
	static double y;
	static void printy() {
		System.out.println("y = " + y);
		
	}
	
	public static void main (String[] argv) {
		x = 5.34;
		printx();
//		StaticExample2 ex2 = new StaticExample2();
//		ex2.y = 9.67;
//		ex2.printy();
//		
		y = 9.67;
		printy();
	}
}
