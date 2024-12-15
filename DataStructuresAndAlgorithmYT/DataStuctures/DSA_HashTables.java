package DataStructuresAndAlgorithmYT.DataStuctures;

import java.util.Hashtable;

// import java.util.*;
// COOL THING IMPORTS EVERYTHING


public class DSA_HashTables {
/*
 * Hashtable 
 * - Data Structure that stores unique keys to values 
 * - ex.<Integer, String>
 * - Each key/value pair is known as an Entry
 * - FAST insertion, look up, deletion of key/value pairs
 * - Not Ideal for small data sets, great with large data sets
 *  
 *  Hashing 
 * - takess a key and comutes an integer (formual will vary based on key & data type)
 * - In a Hashtable, we use the hash % capcity to calculate an index number
 * 
 *      key.hashCode() % capcity = index
 * 
 * EACH INDEX IS ALSO KNOWN AS A BUCKET
 * 
 * Bucket
 * - an indexed storage location for one or more Entries
 * - can store multiple Entries in case of a collision (linked similarly a LinkedList)
 * 
 * Collision 
 * - Hash function generates the same index for more than one key
 * - less collision = more efficency
 * 
 * Runtime Complexity: Best Case O(1) NO COLLISIONS
 *                     Worst Case O(n) ONLY COLLISIONS
 * 
 */



    public static void main(String[] args) {
    //        Key      Value
    Hashtable<Integer, String> table = new Hashtable<>();
    /*Intial Capacity of 11 and
     * load factor of 0.75
     * Once 75% of elements are filled
     * This HashTable will dynamically expand
     * 
     * You can Change the
     * (InitialCapcity, Loadfactor)
     */


    table.put(100, "Spongebob");
    table.put(123, "Patrick");
    table.put(321, "Sandy");
    table.put(555, "Squidward");
    table.put(777, "Gary");


    /*  Get Method 
     * table.get(   *Key*   );
     * 
     *  Remove Method
     * table.remove(777);
    */
    //   dataType           //Iterable
    for(Integer key : table.keySet()) {
        System.out.println(key.hashCode() % 11 + "\t" + table.get(key));
    }
    }

}
