package pacote.doctor;

public class TestDoctors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon cirurgiao = new Surgeon();
		FamilyDoctor pediatra = new FamilyDoctor();
		
		cirurgiao.treatPacient();
		cirurgiao.makeIncision();
		System.out.println("Do you work at hospital? " + cirurgiao.worksAtHospital);
		
		pediatra.giveAdvice();
		pediatra.treatPacient();
		System.out.println("Do you make house calls? " + pediatra.makeHouseCalls);
		pediatra.worksAtHospital = true;
		System.out.println("Do you work at hospital? " + pediatra.worksAtHospital);
	}

}
