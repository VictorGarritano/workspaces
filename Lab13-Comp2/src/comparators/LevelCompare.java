package comparators;

import java.util.Comparator;

import classes.Personagem;

public class LevelCompare implements Comparator<Personagem> {

	@Override
	public int compare(Personagem one, Personagem two) {
		// TODO Auto-generated method stub
		return one.getLevel() -  two.getLevel();
	}
	
}
