
public class SimpleDotCom {
	
	private int[] locationCells;
	private int numOfHits = 0;

	public String checkYourSelf(String userGuess) {
		
		String result = null;
		int guess = Integer.parseInt(userGuess);
		for(int cell : locationCells) {
			if(guess == cell) {
				numOfHits ++;
				if(numOfHits == locationCells.length) {
					result = "kill";
					break;
				}
				else {
					result = "hit";
					break;
				}
			}
			
			else {
				result = "miss";
			}
		}
		
		return result;
	}
			
	
	public void setLocationCells(int[] loc) {
		this.locationCells = loc;
	}
	
	
}
