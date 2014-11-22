
public class TestMiniMusicCmdLine {
	public static void main(String[] args) {
		MiniMusicCmdLine mini = new MiniMusicCmdLine();
		if (args.length < 2) {
			System.out.println("Use: MiniMusicCmdLine intrument note");
		} else {
			int instrument = Integer.parseInt(args[0]);
			int note = Integer.parseInt(args[1]);
			mini.play(instrument, note);
		}

	}
	
}
