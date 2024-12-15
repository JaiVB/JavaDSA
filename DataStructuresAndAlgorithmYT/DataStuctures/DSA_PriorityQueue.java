package DataStructuresAndAlgorithmYT.DataStuctures;

import java.util.PriorityQueue;
import java.util.Queue;

public class DSA_PriorityQueue { // FIFO (First-In First-Out)
/*
 * (FIFO) Serves elements with the 
 * **highest** priorities first 
 * before elements with **lower** priority
 */

    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
    
        // Puts it in lowest to greatest order numbers
        // Alphabetical Order

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder);
        // Uses a parameter to put them in reverse order

        queue.offer(3.0);
        queue.offer(2.5);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
