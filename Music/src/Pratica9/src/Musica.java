import javax.sound.midi.*;


public class Musica  {
	int notas[];
	int instrument= 30;
	int i = 1;
	
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public void play () {
    	try {
    		Sequencer player = MidiSystem.getSequencer();
    		player.open();
    		Sequence seq = new Sequence(Sequence.PPQ, 4);
    		Track track = seq.createTrack();
    		
    		//MidiEvent event = null;
    		
    		ShortMessage first = new ShortMessage();
			first.setMessage(192, 1, instrument, 0);
    		MidiEvent changeInstrument = new MidiEvent(first, 1);
    		track.add(changeInstrument);
    		
    		for(int nota: notas){
    			ShortMessage a = new ShortMessage();
    			a.setMessage(144, 1, nota, 100);
    			MidiEvent noteOn = new MidiEvent(a, i);
    			track.add(noteOn);
    			i+=2;
    			ShortMessage b = new ShortMessage();
    			b.setMessage(128, 1, nota, 100);
    			MidiEvent noteOff = new MidiEvent(b, i);
    			track.add(noteOff);
    		
    		
    			player.setSequence(seq);
    			player.start();
    		}
    	} catch (Exception ex){
    		ex.printStackTrace();
    	}
    }
		
		
}
	

