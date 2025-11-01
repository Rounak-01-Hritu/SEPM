// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Normal (concrete) method
    void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Subclass that extends the abstract class
class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Another subclass
class Cat extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

// Main class to run the program
public class Main3 {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Not allowed (cannot instantiate abstract class)

        // ✅ Create objects of subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); // Calls Dog's version
        dog.sleep();     // Inherited from Animal

        cat.makeSound(); // Calls Cat's version
        cat.sleep();     // Inherited from Animal
    }
}
