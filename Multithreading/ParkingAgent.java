// ParkingAgent.java
public class ParkingAgent extends Thread {

    private final ParkingPool parkingPool;
    private final String agentName;

    public ParkingAgent(String name, ParkingPool parkingPool) {
        this.agentName = name;
        this.parkingPool = parkingPool;
    }

    @Override
    public void run() {
        while (true) {
            try {
                RegistrarParking parking = parkingPool.getParking();
                System.out.println(agentName + " is parking " + parking);

                // simulate time taken to park the car
                Thread.sleep(1000);

                System.out.println(agentName + " finished parking " + parking);
            } catch (InterruptedException e) {
                System.out.println(agentName + " interrupted. Stopping.");
                break;
            }
        }
    }
}
