// Class definition
class Car {
    // Fields (data)
    String brand;
    String color;
    int year;

    // Constructor to initialize the object
    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method (behavior)
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    // Another method
    void startEngine() {
        System.out.println(brand + " engine is starting...");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances of Car class)
        Car car1 = new Car("Toyota", "Red", 2022);
        Car car2 = new Car("Honda", "Blue", 2023);

        // Using the methods of the class
        car1.displayDetails();
        car1.startEngine();

        System.out.println();

        car2.displayDetails();
        car2.startEngine();
    }
}
