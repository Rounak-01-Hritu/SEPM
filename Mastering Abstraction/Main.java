// File: Main.java
public class Main {
    public static void main(String[] args) {

        Airplane plane = new Airplane("AP101", 150);
        Boat boat = new Boat("BT202", 20);

        System.out.println("--- Airplane Details ---");
        plane.showID();
        plane.start();
        plane.fly();

        System.out.println("\n--- Boat Details ---");
        boat.showID();
        boat.start();
        boat.sail();
    }
}
