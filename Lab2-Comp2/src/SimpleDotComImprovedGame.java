import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDotComImprovedGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		Scanner scan = new Scanner(System.in);
		SimpleDotComImproved theDotCom = new SimpleDotComImproved();
		
		int randomNum = (int) (Math.random() * 5);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(Integer.toString(randomNum));
		locations.add(Integer.toString(randomNum + 1));
		locations.add(Integer.toString(randomNum + 2));
		theDotCom.setLocationCells(locations);
		

		
		boolean isAlive = true;
		
		while(isAlive) {
			System.out.println("Enter a number: ");
			String guess = scan.nextLine();
			String result = theDotCom.CheckYourSelf(guess);
			numOfGuesses++;
			
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses. ");
			}
		}
		
		
	}
}
