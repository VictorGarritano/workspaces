public class Peixetes extends Peixes {
	public void voar() {
		System.out.println("Voar modificado");
		super.voar();
	}

	public static void main(String[] args) {
		new Peixetes.voar();
	}
}