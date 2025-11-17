// File: Airplane.java
public class Airplane extends VehicleBase implements Flyable {

    public Airplane(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void start() {
        System.out.println("Airplane is starting on runway.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying in the sky!");
    }
}
