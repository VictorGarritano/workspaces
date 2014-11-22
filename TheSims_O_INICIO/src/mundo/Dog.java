package mundo;

public class Dog implements Animal {

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		position.setPosX(position.getPosX() + this.getPassoX());
		position.setPosY(position.getPosY() + this.getPassoY());
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		System.out.println("Posicao: " + this.getPosition());
	}

	private int PassoX;
	private int PassoY;
	private Position position;

	public int getPassoX() {
		return PassoX;
	}

	public void setPassoX(int passoX) {
		PassoX = passoX;
	}

	public int getPassoY() {
		return PassoY;
	}

	public void setPassoY(int passoY) {
		PassoY = passoY;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Dog(Position position, int passoX, int passoY) {
		
		this.position = position;
		this.PassoX = passoX;
		this.PassoY = passoY;
	}
}
