/*This search algorithm is more efficient than linear search, especially for large lists. 
It works by dividing the list in half and checking the middle element. 
If the middle element is the desired element, the search is successful. 
If the middle element is less than the desired element, the search continues in the second half of the list. 
If the middle element is greater than the desired element, the search continues in the first half of the list. 
*/


public class BinarySearch{
    public static void main(String[] args) {

        // how to the method
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int key = 8; // target value
        int index = binarySearch(list, key);

        if (index == -1) {
            System.out.println("Key not found in the list");
        } else {
            System.out.println("Key found at index: " + index);
        }
        
    }

    // binary search method
    public static int binarySearch(int[] list, int key) {
        int low = 0; // lowest value
        int high = list.length - 1; // highest value
        while (low <= high) {
            int mid = (low + high) / 2; // middle value
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
}