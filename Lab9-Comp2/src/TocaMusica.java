public class TocaMusica {

	public static void main(String[] args) {
		short notas[] = { 52, 0, 40, 55, 58, 57, 40, 0, 52, 0, 40, 55, 58, 57,
				40, 0, 52, 0, 40, 55, 58, 57, 40, 0, 45, 40, 40, 40, 40, 40,
				40, 40, 0, 52, 0, 40, 55, 58, 57, 40, 0, 52, 0, 40, 55, 58, 57,
				40, 0, 52, 0, 40, 55, 58, 57, 40, 0, 45, 40, 40, 40, 40, 40,
				40, 40 };

		Musica musica = new Musica();
		musica.setNotas(notas);

		musica.play();
	}

}
