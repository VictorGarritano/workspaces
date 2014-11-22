public class Shape {
	private int positionX;
	private int positionY;

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public int getPositionX() {
		return positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public double distanceToShape(Shape s) {
		double deltaX = this.getPositionX() - s.getPositionX();
		double deltaY = this.getPositionY() - s.getPositionY();

		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

}

