package dataStructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraysBasic {
    public static void main(String[] args) {

        //    Q: why we need arrays?
//    -> We need arrays, primarily to efficiently manage and store multiple values of the same data type under a single variable name,
//    instead of declaring individual variables for every single piece of data.

//    Imagine you need to store the exam scores of 50 students. Without an array, you would have to create 50 separate variables (score1, score2, ... score50).
//    With an array, you can handle all of them with just one line of code:
//      int[] scores = new int[50];


//    Q: what is an Arrays?
//    -> An Array is a linear data structure that stores multiple elements of the same data type in contiguous memory locations.


//    SYNTAX
//      Array declaration and initialisation:
        int[] arr0; // declaration of array: arr0 is getting defined in the stack.
        arr0 = new int[3]; // intialisation of array: actually here the object is being created in the memory(heap).

//          datatype[] variable_name = new datatype[size];
//        here, new is a keyword that is used to create an object.
//    Example:-
        int[] arr = new int[5];
//            OR directly
        int[] arr1 = {1, 10, 23, 45, 67};


//        ARRAY TERMINOLOGY

//        1. Index: An index is the position of an element in an array.

//        Indexing of an array: array indexing always starts at 0. If an array has a length of N, its valid indices range from 0 to N - 1.

//        1. Basic indexing: Accessing and Modifiying elements
//              You use square brackets [] to read or write elements at a specific index position.

//        Example:-
        // Declaration and initialization
            int[] numbers = {10, 20, 30, 40, 50};

//      Accessing elements (Reading)
            int firstElement = numbers[0]; // Returns 10
            int thirdElement = numbers[2]; // Returns 30

//      Modifying elements (Writing)
            numbers[1] = 99; // Changes 20 to 99


//        2. length: Length means the total number of elements in the array.
//        Example:-
            int[] arr2 = {10, 20, 30, 40, 50};
//          length:-
//                arr2.length // output:- 5

//      important formula:- Last Index = Length - 1
//            Example:-
//                Length = 5
//                Last Index = 5 - 1 = 4


//        3. Traversal:- Traversal means visiting every element of an array one by one.
//        Example:-
//
//        1. using for loop (best for index access)
              int[] arr3 = {10, 20, 30, 40, 50};

              for(int i = 0; i < arr3.length; i++) {
                  System.out.println(arr3[i]);
              }

//        2. using for-each loop (best for quick read-only)
              int[] arr4 = {10, 20, 30, 40, 50};

              for (int num : arr4) {
                  System.out.println(num);
              }

//        3. The while loop (best for conditional traversal)
              int[] arr5 = {10, 20, 30, 40, 50};
              int index = 0;

              while (index < arr5.length) {
                  System.out.println(arr5[index]);
                  index++; // Don't forget to increment!
              }

//        4. Insertion:- Insertion means adding a new element into the array.

//        5. Deletion:- Deletion means removing an element.

//        6. Searching:- Searching means finding whether an element exists and where it exists.


//        Arrays.toString()
//              Arrays.toString() is a static utility method from the java.util.Arrays class used to convert an array into a human-readable string format.
//              It is primarily used for debugging, logging, or quickly printing the contents of a 1D (single-dimensional) array.

//      Example:-
              int[] arr6 = {1, 2, 3, 4, 5};
              System.out.println(Arrays.toString(numbers));
//              Output: [1, 2, 3, 4, 5]





//        MULTI-DIMENSIONAL ARRAY (2D-ARRAY)

//        Q. why we need 2D array?
//        -> 2D array (two-dimensional array) because it allows us to naturally represent and organize data that exists in a grid, table, or matrix format.

//        Q. What is 2D array?
//        ->  a multidimensional array is essentially an array of arrays.
//          Instead of a simple linear list of data, it allows you to store information in a structured, tabular format like rows and columns (2D).

//        2D ARRAY Looks like this
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        SYNTAX OF 2D-ARRAY

//        1. Declaration and Memory Allocation
            // Syntax
//              dataType[][] arrayName = new dataType[numberOfRows][numberOfColumns];

//          Example: A grid of integers with 3 rows and 4 columns
              int[][] matrix = new int[3][4];


//        2. Declaration with Immediate Initialization
            // Syntax
//              dataType[][] arrayName = {
//                {val1, val2, val3},
//                {val4, val5, val6}
//              };

//          Example: A 2x3 matrix of numbers
                int[][] myNumbers = {
                    {1, 2, 3},
                    {4, 5, 6}
                };


//        3. Accessing and Modifying Elements
            int[][] grid = new int[3][3];

//          Assign a value to the first row, second column
             grid[0][1] = 5;

//          Retrieve a value from the third row, first column
                int value = grid[2][0];


//        4. Jagged Arrays (Optional Variation)
//              Because a 2D array in Java is an array of arrays, rows do not have to be the same length. These are called jagged arrays.

            // Allocate memory for 3 rows, but leave column sizes undefined
                int[][] jagged = new int[3][];

//             Define a different number of columns for each row
                jagged[0] = new int[2]; // Row 0 has 2 columns
                jagged[1] = new int[4]; // Row 1 has 4 columns
                jagged[2] = new int[3]; // Row 2 has 3 columns


//        TRAVERSAL OF 2D-ARRAY

//        1. Using a Standard Nested for Loop (Row-Major Order)
            // matrix.length gives the total number of rows
            for (int i = 0; i < matrix.length; i++) {
                // matrix[i].length handles the column length for the current row
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

//        2. Using an Enhanced for-each Loop
            // Extract each row as a 1D int array
            for (int[] row : matrix) {
                // Extract each integer from the row
                for (int element : row) {
                    System.out.print(element + " ");
            }
            System.out.println();
        }

//        3. Alternative: Column-Major Order
            // Assumes a uniform grid. Outer loop tracks columns, inner loop tracks rows.
            for (int col = 0; col < matrix[0].length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            }



//            ARRAYLIST
//        Q. Why do we need arraylist?
//        -> An ArrayList is a resizable array provided by Java that can grow and shrink automatically.

//        BAIC USAGE EXAMPLE
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements (.add)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 3. Access an element (.get)
        String firstFruit = fruits.get(0); // Returns "Apple"
        System.out.println("First item: " + firstFruit);

        // 4. Update an element (.set)
        fruits.set(1, "Blueberry"); // Replaces "Banana" with "Blueberry"

        // 5. Remove an element (.remove)
        fruits.remove(2); // Removes "Orange" by index

        // 6. Check size (.size)
        System.out.println("Current list size: " + fruits.size());

        // 7. Sort the list (using Collections utility)
        Collections.sort(fruits);

        // 8. Iterate using a For-Each loop
        System.out.println("Iterating through elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
