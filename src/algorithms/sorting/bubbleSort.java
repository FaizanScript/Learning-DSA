package algorithms.sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

//    Sorting Algorithm - A sorting algorithm is a step-by-step procedure used to rearrange a given array or list of elements into a specific order
//      (such as ascending, descending, or by a custom key).

//    Bubble sort - Bubble sort is a basic sorting algorithm in Data Structures and Algorithms (DSA)
//      that repeatedly compares adjacent elements and swaps them if they are in the wrong order.
//      It gets its name because larger values gradually "bubble" up to their correct positions at the end of the list with each full pass.


//    How It Works:-
//    The algorithm scans through an array from left to right across multiple passes.

//    1. Compare adjacent pairs. Start at the first element and compare it with the element right next to it.
//    2. Swap if needed. If the left element is larger than the right element, swap their positions to sort in ascending order.
//    3. Repeat to the end. Move one step to the right and repeat the comparison until reaching the end of the unsorted section.
//      After the first pass, the largest item is guaranteed to be at the very end.
//    4. Optimize with a flag. Track whether any swaps happen during a pass. If a complete pass finishes with zero swaps,
//      the list is already sorted and the algorithm stops early.


//    when to use bubble sort:-
//      1. Educational learning. Its straightforward logic makes it ideal for introducing beginners to sorting concepts and nested loops.
//      2. Tiny or nearly sorted datasets. It performs well when checking if a small list is already in order.
//      3. Avoid for large data. Production systems rely on faster algorithms like Merge Sort or Quick Sort because O(n²) becomes too slow on large inputs.


//    Example
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;
        boolean swapped;

//        outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

//            inner loop compares adjacent elements
//            last i elements are already in place (sorted)
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

//            if no swaps happened in this pass, that means the array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
