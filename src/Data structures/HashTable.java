/*A hash table is a data structure that stores key-value pairs and uses a hash function to map keys to indices in an array.
 The main advantage of a hash table is that it provides fast insert, search, and delete operations 
 */

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs to the hashtable
        hashtable.put("isinkwa", 1);
        hashtable.put("amaqanda", 2);
        hashtable.put("mogodu", 3);

        // Get the value for a given key
        int value = hashtable.get("isinkwa");
        System.out.println(value);  // Output: 2

        // Remove a key-value pair from the hashtable
        hashtable.remove("mogodu");
    }
}
