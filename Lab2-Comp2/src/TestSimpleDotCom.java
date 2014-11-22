
public class TestSimpleDotCom {
	public static void main(String[] args) {
		
		SimpleDotCom object = new SimpleDotCom();
		int[] locations = {2,3,4};
		object.setLocationCells(locations);
		String chute1 = "2";
		String chute2 = "7";
		
		System.out.println("O resultado foi: " + object.checkYourSelf(chute1));
		System.out.println("O resultado foi: " + object.checkYourSelf(chute2));
		
		
	}
}
