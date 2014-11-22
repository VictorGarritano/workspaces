package t1;

public class Shape {
	private int positionX;
	private int positionY;

	
	public int getPositionX() {
		return positionX;
	}


	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}


	public int getPositionY() {
		return positionY;
	}


	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}


	public double distanceToShape(Shape s) {
		double deltaX = this.getPositionX() - s.getPositionX();
		double deltaY = this.getPositionY() - s.getPositionY();

		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

}

