package dotCom;

import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	int numOfGuesses;

	public void setUpGame() {
		DotCom dot1 = new DotCom();
		dot1.setName("HelpDotCom");
		dotComList.add(dot1);
		DotCom dot2 = new DotCom();
		dot2.setName("YellowSubmarineDotCom");
		dotComList.add(dot2);
		DotCom dot3 = new DotCom();
		dot3.setName("LucyInTheSkyWithDiamondsDotCom");
		dotComList.add(dot3);
		for (DotCom dot : dotComList) {
			ArrayList<String> result = helper.placeDotCom(3);
			dot.setLocationCells(result);
		}
	}

	public void startPlaying() {
		while (!dotComList.isEmpty()) {
			checkUserGuess(helper.getUserInput("Enter your guess:"));
		}
	}

	public void finishGame() {
		System.out.println("Game Over");
		if (numOfGuesses < 16) {
			System.out.println("Tu é pica cara, desliga o hasck");
		} else if (numOfGuesses < 35) {
			System.out.println("Mandou bem corega");
		} else {
			System.out.println("SEU BOSTA...LIXO");
		}
		System.out.println("You took " + numOfGuesses + " guesses");
		
	}

	public void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for (DotCom dot : dotComList) {
			if (dot.checkYourself(userGuess).equals("kill")) {
				dotComList.remove(dot);
				System.out.println("U had sank " + dot.getName());
				break;
			}
			if (result.equals("hit")) {
				break;
			}
		}
	}

	public static void main(String args[]) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
		game.finishGame();
	}
}