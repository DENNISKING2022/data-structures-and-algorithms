/*a divide and conquer sorting algorithm.
 * It works by dividing an array in half, sorting each half, and then merging the sorted halves back together.
 */

public class MergeSort {
 
    private int[] numbers;
    private int[] helper;
 
    private int number;
 
    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }
 
    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }
 
    private void merge(int low, int middle, int high) {
 
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }
 
        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
 
    }
}

// copy this code in your main method to be able to use this class

/*int[] array = { 3, 2, 1, 4, 5, 8, 6, 9, 7, 10};
MergeSort sorter = new MergeSort();
sorter.sort(array);
*/

// this will sort the array in ascending order


