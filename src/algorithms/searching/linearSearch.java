package algorithms.searching;

public class linearSearch {
    public static void main(String[] args) {

//      Searching Algorithm - A searching algorithm is a step-by-step procedure used to locate specific data
//          (a target key) within a collection of items, such as an array, linked list, tree, or graph.
//          It determines whether the element exists and returns its location (index or pointer) or signals that the item is missing.

//      Linear Search - Linear Search (also known as sequential search) is the simplest searching algorithm in Data Structures and Algorithms (DSA)
//          used to find the position of a target value within a collection.
//          It works by iterating through the collection from the very first element and comparing each value sequentially to the target
//          until a match is found or the end of the collection is reached.

//
//        How It Works (Step-by-Step):-
//            Imagine you are looking for a specific card in an unsorted deck of cards.
//            You look at the first card, then the second, then the third, until you find it.

//        1. Start from the first element (index 0) of the array.
//        2. Compare the current element with your target value.
//        3. If a match is found, return the current index.
//        4. If it doesn't match, move to the next index and repeat step 2.
//        5. If the end of the array is reached without finding a match, return -1.

//      Example:-
            int[] arr = {1, 2, 3, 67, 69};
            int target = 69;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println(i);
                    break;
                }
            }


//        Questions:-

//      question 1 - search in string
            String name = "faizan";
            char word = 'i';

            if (name.length() == 0) {
                System.out.println("false");
            } else {
                for (int i = 0; i < name.length(); i++) {
                    if (word == name.charAt(i)) {
                        System.out.println("true");
                        break;
                    }
                }
            }

//      question 2 - search in range
            int[] arr2 = {1, 2, 3, 67, 69};
            int target2 = 67;
            int startingRange = 2;
            int endingRange = 4;

            for (int i = startingRange; i <= endingRange; i++) {
                if (arr2[i] == target2) {
                    System.out.println(i);
                    break;
                }
            }

//      question 3 - minimum number
            int[] arr3 = {18, 12, -7, 14, 28};
            int min = arr3[0];

            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < min) {
                    min = arr3[i];
                }
            }
            System.out.println(min);

//      question 4 - search in 2D array
            int[][] arr4 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {67, 69}
            };
            int target3 = 69;

            for (int row = 0; row < arr4.length; row++) {
                for (int col = 0; col < arr4[row].length; col++) {
                    if (arr4[row][col] == target3) {
                        System.out.println(row + " , " + col);
                        break;
                    }
                }
            }

//      question 5 - find the no that has even no of digits
            int[] nums = {18, 124, 92, 176, 98, 11, 1};
            int countOfEven = 0;

            for (int i = 0; i < nums.length; i++) {
                int digit = 0;
                while(nums[i] > 0) {
                    nums[i] = nums[i] / 10;
                    digit++;
                }

                if (digit % 2 == 0) {
                    countOfEven++;
                }
            }

            System.out.println(countOfEven);

//      question 6 - max wealth
            int[][] accounts =  {{2,8,7},{7,1,3},{1,9,5}};
            int ans = Integer.MIN_VALUE;

            for (int i = 0; i < accounts.length; i++) {
                int currentWealth = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    currentWealth += accounts[i][j];
                }
                if (currentWealth > ans) {
                    ans = currentWealth;
                }
            }
        System.out.println(ans);
    }
}
