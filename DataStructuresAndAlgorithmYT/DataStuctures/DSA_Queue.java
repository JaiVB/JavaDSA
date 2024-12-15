package DataStructuresAndAlgorithmYT.DataStuctures;

import java.util.LinkedList;
import java.util.Queue;

public class DSA_Queue { // FIFO (First-In First-Out)
    /*
     * Its like a queue
     * - If there is one object in the "Queue" then it is the "Head" and the "Tail"
     * - It is a Interface in Java
     * - Interface is like a template
     * - To utilize queue you have instantiate something that uses queue
     */


     public static void main(String[] args) {
        // add    = enqueue, offer() // adds to the "Tail"
        // remove = dequeue, poll() // removes the current "Head"
            //will not cause an exeption 
        // peek() examines the "Head" and return value
        Queue<String> queue = new LinkedList<String>();
        // Queue Class Extends Collections Class
        queue.isEmpty();
        queue.size();
        queue.contains("Harold");

        queue.poll();
     }
/*
 * Where are queues useful?
	- Keyboard buffer (letters should appear on the screen in the order they're pressed)
	- Printer Queue (Print jobs should be completed in order)
	- Used in LinkedLists, PriorityQueues, Breadth-First search 
 */

}
