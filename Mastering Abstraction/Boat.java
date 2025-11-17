// File: Boat.java
public class Boat extends VehicleBase implements Sailable {

    public Boat(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void start() {
        System.out.println("Boat engine is starting.");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing on water!");
    }
}
