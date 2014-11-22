package comparators;

import java.util.Comparator;

import classes.Personagem;

public class PowerCompare implements Comparator<Personagem>{
	protected int flag;
	@Override
	public int compare(Personagem one, Personagem two) {
		// TODO Auto-generated method stub
		if(one.getPower() < two.getPower()) {
			flag = -1;
		}
		if(one.getPower() == two.getPower()) {
			flag = 0;
		}
		if(one.getPower() > two.getPower()) {
			flag = 1;
		}
		return flag;
	}

}
