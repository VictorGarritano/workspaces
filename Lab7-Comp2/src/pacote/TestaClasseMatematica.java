package pacote;

import static pacote.ClasseMatematica.*;
import java.util.Scanner;

class TestaClasseMatematica {
	public static void main(String[] args) {
		
		String n;
		String p;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor de n:");
		n = scan.nextLine();
		System.out.println("Entre com o valor de p:");
		p = scan.nextLine();
		
		int n1 = Integer.parseInt(n);
		int p1 = Integer.parseInt(p);
		
		scan.close();
		
		System.out.println("O fatorial de " + n + " é: " + fatorial(n1));
		System.out.println("A permutacao de " + n + " é: " + permutacao(n1));
		System.out.println("A combinacao de " + n + " tomado de " + p + " a "
				+ p + " é: " + combinacao(n1, p1));
		System.out.println("O arranjo de " + n + " tomado de " + p + " a " + p
				+ " é: " + arranjo(n1, p1));

	}
}
