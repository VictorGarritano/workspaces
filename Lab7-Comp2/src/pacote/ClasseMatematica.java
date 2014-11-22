package pacote;


public class ClasseMatematica {

	public static int fatorial(int n) {
		int fat = 1;
		for (int i = n; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}

	public static int permutacao(int n) {
		return fatorial(n);
	}

	public static int combinacao(int n, int p) {
		return ((fatorial(n)) / (fatorial(p) * (fatorial(n - p))));
	}

	public static int arranjo(int n, int p) {
		return (fatorial(n) / (fatorial(n - p)));
	}
}
