package mundo;

public class MyWorld implements World {

	private Terrain terrain;
	private Animal animal;

	@Override
	public void setTerrain(Terrain terrain) {
		// TODO Auto-generated method stub
		this.terrain = terrain;
	}

	@Override
	public void setAnimal(Animal animal) {
		// TODO Auto-generated method stub
		this.animal = animal;
	}

	@Override
	public void moveAnimal() {
		// TODO Auto-generated method stub
		animal.roam();
	}

	@Override
	public boolean isAnimalWithinTerrain() {
		if (terrain.isWithinLimits(animal.getPosition())) {
			return true;
		}
		return false;
	}

}
