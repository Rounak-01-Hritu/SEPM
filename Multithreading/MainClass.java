// MainClass.java
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        ParkingPool pool = new ParkingPool();

        // create some parking agents (workers)
        new ParkingAgent("Agent-1", pool).start();
        new ParkingAgent("Agent-2", pool).start();
        new ParkingAgent("Agent-3", pool).start();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Parking Simulation ===");
        System.out.println("Press ENTER to register a new car for parking.");
        System.out.println("Type 'exit' and press ENTER to stop.\n");

        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Stopping parking registration...");
                break;
            }

            // create a new parking request
            RegistrarParking parking = new RegistrarParking();
            pool.addParking(parking);
        }

        scanner.close();
        System.out.println("Main thread finished. (Agents will keep running until interrupted)");
        // In a more advanced version you could keep references to agents and interrupt them here.
    }
}
