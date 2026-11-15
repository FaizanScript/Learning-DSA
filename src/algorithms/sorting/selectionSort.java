package algorithms.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

//    Selection Sort - Selection sort is a simple, in-place comparison-based sorting algorithm that sorts an array by
//      repeatedly finding the smallest element from the unsorted portion and moving it to the beginning.
//      It divides the list into a sorted left side and an unsorted right side, growing the sorted portion by one item on each pass.

//    How Selection Sort Works:
//      The algorithm scans the unsorted portion of the array in multiple passes.

//      Here is the step-by-step process for sorting in ascending order:
//    Start at the beginning: Treat the first unsorted element as the current minimum.
//    Scan for the smallest value: Compare this minimum with every remaining element in the unsorted section.
//      If you find a smaller value, update your minimum to that element.
//    Swap into place: Once you reach the end of the array, swap the smallest element you found with the first element of the unsorted section.
//    Shift the boundary: Move the boundary between the sorted and unsorted parts one position to the right.
//    Repeat until sorted: Continue this process for each remaining position until only one unsorted element is left.

//    Example:-

        int[] arr = {64, 25, 12, 22, 11};

//        move the boundary of the unsorted subarray one by one
        for (int i = 0; i < arr.length-1; i++) {
//            assume the current index holds the minimum element
            int minIndex = i;

//            find the actual minimum element in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

//            swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

}
