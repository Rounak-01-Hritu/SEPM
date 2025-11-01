// Base class (Parent)
class Animal {
    protected String name;  // protected field

    // protected method
    protected void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class (Child) inherits from Animal
class Dog extends Animal {
    public void display() {
        // Accessing protected member from parent class
        name = "Buddy";
        eat();
        System.out.println(name + " is a happy dog!");
    }
}

// Main class to run the program
public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
