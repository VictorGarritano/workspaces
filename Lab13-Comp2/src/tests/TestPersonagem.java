package tests;

import java.util.Collections;

import comparators.DateCompare;
import comparators.LevelCompare;
import comparators.NameCompare;
import comparators.PowerCompare;
import classes.Cast;

public class TestPersonagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cast cast = new Cast();
		cast.setArqName("Personagem.txt");
		cast.readPersonagens();

		System.out.println("\nLEVEL COMPARE\n ");
		LevelCompare lc = new LevelCompare();
		Collections.sort(cast.getCastList(), lc);
		System.out.println(cast.toString());

		System.out.println("\nNAME COMPARE\n ");
		NameCompare nc = new NameCompare();
		Collections.sort(cast.getCastList(), nc);
		System.out.println(cast.toString());

		System.out.println("\nPOWER COMPARE\n ");
		PowerCompare pc = new PowerCompare();
		Collections.sort(cast.getCastList(), pc);
		System.out.println(cast.toString());

		System.out.println("\nDATE COMPARE\n ");
		DateCompare dc = new DateCompare();
		Collections.sort(cast.getCastList(), dc);
		System.out.println(cast.toString());
	}

}
