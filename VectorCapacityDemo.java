import java.util.Vector;

public class VectorCapacityDemo {
    public static void main(String[] args) {

        // Vector with default capacity 10
        Vector<String> vector = new Vector<>();

        // Add 10 items → capacity still 10
        for (int i = 1; i <= 10; i++) {
            vector.add("IT2300" + i);
        }

        System.out.println("Initial Size: " + vector.size());
        System.out.println("Initial Capacity: " + vector.capacity());

        // Adding 11th element → triggers doubling
        vector.add("IT23011");

        System.out.println("\nAfter Adding One More Element:");
        System.out.println("New Size: " + vector.size());
        System.out.println("New Capacity: " + vector.capacity());
    }
}

//Output:
// Initial Size: 10
// Initial Capacity: 10

// After Adding One More Element:
// New Size: 11
// New Capacity: 20
