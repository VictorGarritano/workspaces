public class GuessGame {

	public void startGame() {

		boolean flag = false;

		Player[] players = new Player[3];
		for(int i = 0; i < players.length; i++) {
			Player player = new Player();
			player.name ="p" + i;
			players[i] = player;

		}

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9... ");

		while (true) {
			System.out.println("Number to guess is: " + targetNumber);

			for(int i = 0; i < players.length; i++) {
				players[i].setNumber();
			}

			for(int i = 0; i < players.length; i++) {
				System.out.println(players[i].name + " guessed: " + players[i].getNumber());
			}

			for (int i = 0; i < players.length; i++) {
				if(players[i].getNumber() == targetNumber) {
					players[i].playerIsRigth = true;
					break;
				}
			}

			if(players[0].playerIsRigth || players[1].playerIsRigth || players[2].playerIsRigth) {
				
				for (int i = 0; i < players.length; i++) {
					if (players[i].playerIsRigth == true) {
						System.out.println(players[i].name + " " + "wins !!! ");
						System.out.println("Game Over... ");
					}
				}
				break;

			}

			else {
				System.out.println("Players will have to try again ...");
			}

		}
	}
}