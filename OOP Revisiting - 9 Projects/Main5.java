// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// A class can implement multiple interfaces
class Dog implements Animal, Pet {
    // Implementing methods from both interfaces
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void play() {
        System.out.println("Dog loves to play fetch!");
    }
}

// Main class
public class Main5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
