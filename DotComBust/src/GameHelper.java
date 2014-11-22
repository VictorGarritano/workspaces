import java.util.*;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;
	Scanner scan = new Scanner(System.in);

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		inputLine = scan.nextLine();
		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		String temp = null;
		int[] coords = new int[comSize];
		int attempts = 0;
		boolean sucess = false;
		int location = 0;
		comCount++;
		int incr = 1;
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}
		while (!sucess & attempts++ < 200) {
			location = (int) (Math.random() * gridSize);
			int x = 0;
			sucess = true;
			while (sucess && x < comSize) {
				if (grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					if (location >= gridSize) {
						sucess = false;
					}
				} else {
					sucess = false;
				}
			}
		}
		int x = 0;
		int row = 0;
		int column = 0;
		while (x < comSize) {
			grid[coords[x]] = 1;
			row = (int) (coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
			alphaCells.add(temp.concat(Integer.toString(row)));
//			System.out.println("coord " + x + " = " + alphaCells.get(x));
			x++;
		}
		return alphaCells;
	}
}