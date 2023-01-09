/*a simple sorting algorithm that repeatedly steps through the list to be sorted, 
compares adjacent elements and swaps them if they are in the wrong order. 
*/

public class BubbleSort {
 
    public static void sort(int[] array) {
        // Get the length of the array
        int n = array.length;
 
        // Perform the bubble sort
        for (int i = 0; i < n - 1; i++) {
            // Loop through the array, comparing adjacent elements and swapping them if they are in the wrong order
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// copy this code in your main method to be able to use this class

/*
int[] array = { 3, 2, 1, 4, 5, 8, 6, 9, 7, 10};
BubbleSort.sort(array);
 */

 // this will sort the array in ascending order

