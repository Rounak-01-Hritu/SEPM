// PriorityQueueStackQueue.java
// Implement Queue and Stack using PriorityQueue and custom comparator

import java.util.*;

public class PriorityQueueStackQueue {

    public static void main(String[] args) {

        // Implementing QUEUE (FIFO) using priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("QUEUE using PriorityQueue (min-heap):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // FIFO
        }

        // Implementing STACK (LIFO) using max-heap
        PriorityQueue<Integer> stack = new PriorityQueue<>(Collections.reverseOrder());
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("\nSTACK using PriorityQueue (max-heap):");
        while (!stack.isEmpty()) {
            System.out.println(stack.poll()); // LIFO
        }
    }
}
