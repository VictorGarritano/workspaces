package pacote.doctor;

public class Surgeon extends Doctor {

	@Override
	public void treatPacient() {
		// TODO Auto-generated method stub
		System.out.println("I'm gonna kill this stupid guy...");
	}
	
	public void makeIncision() {
		System.out.println("Im gonna make an incision... ");
	}
}
