// ParkingPool.java
import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {

    private final Queue<RegistrarParking> queue = new LinkedList<>();

    // add new parking request (car coming)
    public synchronized void addParking(RegistrarParking parking) {
        queue.add(parking);
        System.out.println("[POOL] New car arrived: " + parking);
        notifyAll(); // wake up waiting agents
    }

    // get next parking request (for an agent)
    public synchronized RegistrarParking getParking() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();  // wait until some car comes
        }
        return queue.poll();
    }
}
