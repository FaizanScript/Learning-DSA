package algorithms.sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

//        Insertion Sort - Insertion Sort is a simple, in-place comparison sorting algorithm that builds the final sorted array one item at a time.
//          It works much like sorting a hand of playing cards:
//              you take one unsorted card and insert it into its correct position among the already-sorted cards.

//        How It Works:
//          The algorithm divides the array into a sorted part (initially just the first element) and an unsorted part (the rest of the elements).

//        1. Start at the second element: (index 1) and treat it as the key.
//        2. Compare the key with the elements in the sorted portion to its left.
//        3. Shift larger elements one position to the right to make space.
//        4. Insert the key into the open spot
//        5. Repeat until the entire array is sorted.

//        Example:-
        int[] arr = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // element to be inserted in the free space
            int j = i - 1;

//            shift elements greater than key one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

//            insert the key at its correct position
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }
}
