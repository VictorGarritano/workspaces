import java.util.*;

public class DotCom {
	private ArrayList<String> locationCells = new ArrayList<String>();
	private String name;

	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}

	String checkYourself(String userGuess) {
		String result = "miss";
		boolean flag = false;
		int index = locationCells.indexOf(userGuess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				flag = true;
				System.out.println(result);
			} else {
				result = "hit";
				flag = true;
				System.out.println(result);
			}
		}
		if(!flag){
			System.out.println(result);
		}		
		return result;
	}
}