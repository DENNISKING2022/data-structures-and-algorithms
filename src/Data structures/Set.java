/*A set is a collection of unique elements. 
Sets are used to store a group of elements, with no duplicates allowed. 
Sets are often used to test membership, to find intersections and unions of sets, and to remove duplicates from a list. 
*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Add elements to the set
        set.add(1);
        set.add(2);
        set.add(3);

        // Test membership in the set
        boolean isMember = set.contains(2);
        System.out.println(isMember);  // Output: true

        // Remove an element from the set
        set.remove(3);

        // Print the set
        System.out.println(set);  // Output: [1, 2]
    }
}
