import java.util.Scanner;

public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		System.out.println("Enter a number between 0 and 7 under Enter a number.");
		Scanner scan = new Scanner(System.in);
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);

		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive) {
			System.out.println("Enter a number. ");
			String guess = scan.nextLine();
			String result = theDotCom.checkYourSelf(guess);
			System.out.println(result);
			numOfGuesses++;
			if(result.equals("kill")) {
				
				isAlive = false;
			}
		}
		System.out.println("Took " + numOfGuesses + " guesses.");
	}
}
