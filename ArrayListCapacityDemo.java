import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListCapacityDemo {
    public static void main(String[] args) throws Exception {

        // Create ArrayList with initial capacity 10
        ArrayList<String> list = new ArrayList<>(10);

        // Add 10 elements → capacity still 10
        for (int i = 1; i <= 10; i++) {
            list.add("IT2300" + i);
        }

        System.out.println("Initial Size: " + list.size());
        System.out.println("Initial Capacity: " + getCapacity(list));

        // Adding 11th element → triggers expansion
        list.add("IT23011");

        System.out.println("\nAfter Adding One More Element:");
        System.out.println("New Size: " + list.size());
        System.out.println("New Capacity: " + getCapacity(list));
    }

    // Function to get ArrayList internal capacity using reflection
    private static int getCapacity(ArrayList<?> arrayList) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        Object[] internalArray = (Object[]) dataField.get(arrayList);
        return internalArray.length;
    }
}
