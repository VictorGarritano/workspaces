public class TocaMusica {
	public static void main(String[] args) {
		int[] notas = { 55, 55, 57, 55, 60, 59, 55, 55, 57, 55, 62, 60, 60, 64,
				64, 67, 64, 60, 59, 57, 65, 65, 64, 60, 62, 60, 60 };

		Musica musica = new Musica();
		musica.setNotas(notas);
		musica.setInstrument(30);
		musica.play();

	}
}
