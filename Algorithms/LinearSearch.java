/*This is the simplest search algorithm, which involves searching for an element in a list by 
checking each element in the list until the desired element is found. 
It is not very efficient for large lists, but it is simple to implement.
 */

 public class LinearSearch{
    public static void main(String[] args) {
        
        // how to use the method
        int[] list = {1, 2, 3, 4, 5};
        int key = 5;
        int index = linearSearch(list, key);

        if (index == -1) {
            System.out.println("Key not found in the list");
        } else {
            System.out.println("Key found at index: " + index);
        }
        
    }

    // linear search method
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

 }