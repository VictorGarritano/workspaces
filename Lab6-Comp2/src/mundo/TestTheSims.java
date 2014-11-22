package mundo;

public class TestTheSims {
    
    public static void main (String[] args) {
        
        Position position = new Position (10,10);
        Dog doge = new Dog(position, 20, 20);
        int steps = 0;
        
        MyTerrain terrain = new MyTerrain(200,200);
        MyWorld mundo = new MyWorld();
        mundo.setAnimal(doge);
        mundo.setTerrain(terrain);
        
        while(mundo.isAnimalWithinTerrain()) {
            
            mundo.moveAnimal();
            doge.print();
            System.out.println("Steps: " + ++steps);
        }
        
        System.out.println("Dog reached the terrain limits...");
    }
}