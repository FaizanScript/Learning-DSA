package dataStructure.arrays;
import java.util.Arrays;

public class logicBuildingQuestions {

//    EASY (DAY 1)
    public static void q1() {
//    Q1 - Create array of 5 integers and print all elements.
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
//          OR
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr[i]);
        }
//        System.out.println();

    }

    public static void q2() {
//        q2 - find the sum of all elements
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void q3() {
//        q3 - find the largest element
        int[] arr = {2, 4, 1, 20, 10};
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }

    public static void q4() {
//        q4 - find the smallest elemets
        int[] arr = {1, 2, 1, 10, 0};
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }

    public static void q5() {
//        q5 - count even numbers in array
        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

//    MEDIUM
    public static void q6() {
//        q6 - reverse print array
        int[] arr = {1, 2, 3, 4, 15};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void q7() {
//        q7 - search element in array
        int[] arr = {1, 2, 3, 4, 69, 5};
        int target = 69;
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            System.out.println(i);
        }
        }
    }

    public static void q8() {
//        q8 - find the average of elements
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        int avg;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;
        System.out.println(avg);
    }

    public static void q9() {
//        q9 - count posisitve/negative/zero
        int[] arr = {0, 1, 2, 3, -3, -2, -1, 0};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println(positive + "u");
        System.out.println(negative);
        System.out.println(zero);
    }

    public static void q10() {
//        q10 - copy one array into another
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

//    EASY (DAY 2)
    public static void q11() {
//        q11 - swap first and last element
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void q12() {
//        q12 - reverse an array
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean q13() {
//        q13 - check if a array is sorted or not
        int[] arr = {1, 2, 3, 2, 4, 1};

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void q14() {
//        q14 - cound odd numbers
        int[] arr = {1, 2, 3, 4, 5, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void q15() {
//       q15 - find the second largest
        int[] arr = {1, 0, 3, 4, 5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

//    MEDIUM
    public static void q16() {
//        q16 - find the second smallest element in the array
        int[] arr = {0, 1, 2, 3, 1, -1, -11};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }

    public static void q17() {
//        q17 - count how many times a given value(target) appears in the array
        int[] arr = {1, 2, 3, 67, 4, 67, 5};
        int target = 67;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void q18() {
//        q18 - move all the zeroes to the end of the array
        int[] arr = {0, 1, 0, 2, 12, 0};
        int write = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[write] = arr[i];
                write++;
            }
        }

        for (int i = write; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void q19() {
//        q19 - find duplicate items
        int[] arr = {1, 2, 4, 3, 4, 2, 6};
        int value = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void q20() {
//        q20 - find the missing number
        int[] arr = {1, 2, 3, 5};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                System.out.println((i+1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println((arr.length + 1));
        }
    }


//    2D-ARRAY
//    EASY (DAY-1)
    public static void q21() {
//        q21 - create an 2d array and print all the element
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q22() {
//        q22 - find sum of all the element in 2d array
        int[][] arr = {
                {1, 2, 3},
                {4, 5}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void q23() {
//        q23 - find the largest numbers in an array
        int[][] arr = {
                {1, 2, 3},
                {5, 3, 1},
                {0, 0, 10}
        };

        int largest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println(largest);
    }

    public static void q24() {
//        q24 - count even number in 2d array
        int[][] arr = {
                {1, 2, 3},
                {5, 4, 1},
                {1, 1, 10}
        };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void q25() {
//        q25 - print row-wise sum
        int[][] arr = {
                {1, 2, 3},
                {5, 3, 1},
                {0, 0, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("sum of row " + i + " is " + sum);
        }
    }

//    MEDIUM
    public static void q26() {
//      q26 - print column wise sum
        int[][] arr = {
                {1, 2, 3},
                {5, 3, 1},
                {0, 0,}
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            System.out.println("col " + i + " sum is " + sum);

        }
    }

    public static void q27() {
//        q27 - find diagnal sum of 2d array
        int[][] arr = {
                {1, 2, 3},
                {5, 3, 1},
                {0, 0, 10}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }

    public static void q28() {
//        q28 - count positive,negative and zero
        int[][] arr = {
                {1, 2, 3},
                {5, 3, -1},
                {0, 0, -2}
        };

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                } else if (arr[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }

    public static void q29() {
//        q29 - search target element
        int[][] arr = {
                {1, 2, 3},
                {5, 69, 1},
                {0, 67, 10}
        };

        int target = 69;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    System.out.println("found the target " + target + " at " + i + "th row and " + j + "th col");
                    break;
                }
            }
        }

        System.out.println(found);
    }

    public static void q30() {
//        q30 - find the largest element in each row
        int[][] arr = {
                {1, 2, 3},
                {5, 3, 1},
                {0, 0, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            int largest = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
            System.out.println("largest in row " + i + " is " + largest);
        }
    }

//    MATRIX LOGIC-BUILDING
//    EASY
    public static void q31() {
//        q31 - print main diagonal (the line of entries that runs from
//        the top-left corner to the bottom-right corner)

//        MATRIX LOGIC 1: MAIN DIAGONAL
//          KEY CONDITION:- I == J

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void q32() {
//        q32 - print secondary diagonal (the line of entries that runs from
//        the top-left corner to the bottom-right corner)

//        MATRIX LOGIC 2: SECONDARY DIAGONAL
//          KEY CONDITION:- I + J == ARR.LENGTH - 1

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void q33() {
//        q33 - sum of the main diagonal
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void q34() {
//        q34 - sum of the secondary diagonal
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void q35() {
//        count even numbers in boundary (The boundary elements of a matrix are the numbers located on its outer edges,
//        which include the entire first row, last row, first column, and last column.)

//        MATRIX LOGIC 3: BOUNDARY
//            KEY CONDITION:- I == 0 OR I == ROWS-1 OR J == 0 OR J == COLS-1

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( i == 0 || i == arr.length - 1 ||j == 0 || j == arr[i].length - 1) {
                    if (arr[i][j] % 2 == 0) {
                     evenCount++;
                    }
                }
            }
        }

        System.out.println(evenCount);

    }

//    MEDIUM
    public static void q36() {
//        q36 - print only upper triangle elements

//      MATRIX LOGIC 4: UPPER TRIANGLE
//        KEY CONDITION:- I < J

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void q37() {
//        q37 - print only lower triangle elements

//      MATRIX LOGIC 5: LOWER TRIANGLE
//        KEY CONDITION:- I > J

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i > j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void q38() {
//        q38 - sum of the upper tirangle

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }

    public static void q39() {
//        q39 - sum of lower triangle
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i > j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void q40() {
//        q40 - print the sun of only boundary elements
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length-1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
        q12();
        boolean check = q13();
        System.out.println(check);
        q14();
        q15();
        q16();
        q17();
        q18();
        q19();
        q20();
        q21();
        q22();
        q23();
        q24();
        q25();
        q26();
        q27();
        q28();
        q29();
        q30();
        q31();
        q32();
        q33();
        q34();
        q35();
        q36();
        q37();
        q38();
        q39();
        q40();
    }
}