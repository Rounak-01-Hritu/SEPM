// RegistrarParking.java
public class RegistrarParking {

    private static int nextId = 1;   // to give each car a unique id
    private final int carId;

    public RegistrarParking() {
        synchronized (RegistrarParking.class) {
            this.carId = nextId++;
        }
    }

    public int getCarId() {
        return carId;
    }

    @Override
    public String toString() {
        return "Car-" + carId;
    }
}
