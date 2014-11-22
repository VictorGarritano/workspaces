package mundo;

public class Dog implements Animal {

	private int passoX;
	private int passoY;
	private Position position;

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		position.setPosX(position.getPosX() + passoX);
		position.setPosY(position.getPosY() + passoY);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		System.out.println("Posicao: " + "("
				+ Integer.toString(position.getPosX()) + ","
				+ Integer.toString(position.getPosY()) + ")");

	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public void setPosition(Position position) {
		// TODO Auto-generated method stub
		this.position = position;
	}

	@Override
	public void setPassoX(int passoX) {
		// TODO Auto-generated method stub
		this.passoX = passoX;
	}

	@Override
	public void setPassoY(int passoY) {
		// TODO Auto-generated method stub
		this.passoY = passoY;
	}

	@Override
	public int getPassoX() {
		// TODO Auto-generated method stub
		return passoX;
	}

	@Override
	public int getPassoY() {
		// TODO Auto-generated method stub
		return passoY;
	}

	public Dog(Position position, int passoX, int passoY) {

		this.position = position;
		this.passoX = passoX;
		this.passoY = passoY;
	}
}
