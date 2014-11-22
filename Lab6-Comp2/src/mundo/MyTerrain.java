package mundo;

public class MyTerrain implements Terrain {

	private int height;
	private int width;


	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public void setHeight(int heigth) {
		// TODO Auto-generated method stub
		this.height = heigth;
	}

	@Override
	public boolean isWithinLimits(Position position) {
		if (position.getPosX() < width && position.getPosX() > 0
				&& position.getPosY() < height && position.getPosY() > 0) {
			return true;
		}

		return false;
	}
	
	public MyTerrain(int width, int height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
	}

}
