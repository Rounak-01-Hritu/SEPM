package mainpack;

import com.Car;
import com.Car1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Car object ...set with setter\n");

        // Object created using default constructor and setters
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Red");
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
        car.CarStatus();

        System.out.println("\nCar1 object ...set with constructor\n");

        // Object created using parameterized constructor (no setters)
        Car1 car1 = new Car1("Blue", 2018);
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());
        car1.CarStatus();
    }
}
