// LinkedListEquality.java
// Checks whether two LinkedLists are equal
// Uses equals(), which compares elements one by one

import java.util.*;

public class LinkedListEquality {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(10); list1.add(20); list1.add(30);
        list2.add(10); list2.add(20); list2.add(30);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        if (list1.equals(list2)) {
            System.out.println("The two LinkedLists are EQUAL.");
        } else {
            System.out.println("The two LinkedLists are NOT equal.");
        }
    }
}
