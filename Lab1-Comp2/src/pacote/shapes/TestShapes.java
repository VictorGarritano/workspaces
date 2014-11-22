package pacote.shapes;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape forma = new Shape();
		Square quadrado = new Square();
		Amoeba massinha = new Amoeba();

		forma.rotate();
		forma.play();

		quadrado.rotate();
		quadrado.play();

		massinha.rotate();
		massinha.play();
	}

}
