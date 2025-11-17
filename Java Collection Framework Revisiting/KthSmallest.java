// KthSmallest.java
// Program to find the kth smallest element in an ArrayList
// Uses Collections.sort() or PriorityQueue

import java.util.*;

public class KthSmallest {

    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list); // Sort the list
        return list.get(k - 1); // Return kth smallest (1-based index)
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);

        int k = 3;
        System.out.println("ArrayList: " + list);
        System.out.println(k + "rd smallest element: " + findKthSmallest(list, k));
    }
}
