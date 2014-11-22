package mundo;

public class MyTerrain implements Terrain {

	private int heigth;
	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return heigth;
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.heigth = heigth;
	}

	@Override
	public boolean isWithinLimits(Position position) {
		// TODO Auto-generated method stub
		if (position.getPosX() < this.getWidth() && position.getPosY() < this.getHeight()) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public MyTerrain(int width, int height) {
		
		this.width = width;
		this.heigth = height;
	}

}
