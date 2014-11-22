package pacote.doctor;

public class FamilyDoctor extends Doctor {

	public boolean makeHouseCalls;
	
	@Override
	public void treatPacient() {
		// TODO Auto-generated method stub
		System.out.println("I'm gonna treat my precious pacient... ");
	}
	
	public void giveAdvice() {
		System.out.println("I'm a SUS' doctor, and it's only a virus... ");
	}
	
	
}
