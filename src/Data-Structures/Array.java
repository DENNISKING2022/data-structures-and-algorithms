/*An array is a collection of elements of the same data type that are stored in contiguous memory locations.
 */

public class Array {
    public static void main(String[] args) {
        
        // Declare an array of integers with a size of 5
        int[] arr = new int[5];

        // Initialize the elements of the array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Access the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Output: 1 2 3 4 5

        // a 2D array is an array of arrays of the same data type.

        // Declare a 2D array of integers with 3 rows and 3 columns
        int[][] arr2d = new int[3][3];

        // Initialize the elements of the array
        arr2d[0][0] = 1;
        arr2d[0][1] = 2;
        arr2d[0][2] = 3;
        arr2d[1][0] = 4;
        arr2d[1][1] = 5;
        arr2d[1][2] = 6;
        arr2d[2][0] = 7;
        arr2d[2][1] = 8;
        arr2d[2][2] = 9;

        // Access the elements of the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        // Output:
        // 1 2 3
        // 4 5 6
        // 7 8 9

    }
}
