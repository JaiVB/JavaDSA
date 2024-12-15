package DataStructuresAndAlgorithmYT.DataStuctures;

import java.util.LinkedList;

public class DSA_LinkedLists {
    /* LinkedList
     * - Stores Nodes in 2 parts (data + address)
     * - Nodes are in non-consecutive memory locations
     * - Elements are linked using pointers
     * 
     *                      Singly Linked List
     *      Node                Node                Node
     *  [data | address] ->  [data | address] -> [data | address]
     * 
     *                      Doubly Linked List
     *             Node                           Node                          Node
     *  [address | data | address] <->  [address | data | address] <-> [address | data | address]
     * 
     *           Advantages
     *          - Dynamic Data Structure (allocates needed memory while running)
     *          - Insertion and Deletion of Nodes is easy. O(1)
     *          - No/Low Memory Waste
     * 
     *           Disadvantages
     *          - Greater memory Usage (additional pointer) 
     *          - No random access of elements (no index [i])
     *          - Accessing/searching elements is more time consuming. O(n)
     *
     *          Uses
     *          - Implement Stacks/Queues
     *          - GPS navigation
     *          - Music Playlist
     *  Contain Nodes
     * - Which Contains
     *      - Data
     *      - Address to the Next Node in Line (Also Called a Pointer)
     * 
     * Run Time Complexity
     *  - Inserting = O(1)
     *  - Deleting  = O(1)
     *  - Locating  = O(n) 
     * 
     * 
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.push("A");
        linkedList.push("B");
        linkedList.offer("C");
        
        linkedList.pop();
        linkedList.poll();
        
        // peekFirst();
        // peekLast();
        // addFirst();
        // addLast();
        // removeFirst();
        // removeLast();
    }
}
