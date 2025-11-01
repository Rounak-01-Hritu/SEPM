// Defining an interface
interface Animal {
    // Static constant (automatically public, static, and final)
    int EYES = 2;

    // Abstract method (no body)
    void makeSound();

    // Default method (has a body — added since Java 8)
    default void sleep() {
        System.out.println("This animal sleeps peacefully...");
    }
}

// Class implementing the interface
class Dog implements Animal {
    // Must implement the abstract method
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

// Main class
public class Main4 {
    public static void main(String[] args) {
        // Create objects of classes that implement the interface
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling interface methods
        dog.makeSound();
        dog.sleep(); // default method from interface

        cat.makeSound();
        cat.sleep();

        // Accessing interface constant
        System.out.println("All animals have " + Animal.EYES + " eyes (constant from interface).");
    }
}
