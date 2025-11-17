// File: VehicleBase.java
public abstract class VehicleBase {
    protected String id;
    protected int capacity;

    public VehicleBase(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void showID() {
        System.out.println("Vehicle ID: " + id);
    }

    public abstract void start();
}
