import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import algorithms.search.BFS;
import algorithms.sort.BubbleSort;
import algorithms.sort.QuickSort;
import problems.ParenthesisMatcher;
import problems.RemoveRecurringChars;

public class Main {
    public static void main(String[] arg) throws InterruptedException {
        // Binary Search
//        int [] array = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
//                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
//        System.out.println("Binary Search: " + BinarySearch.binarySearch(array, 97));
//        System.out.println("Binary Search: " + BinarySearch.binarySearch(array, 0, 24, 52));

        // Selection sort
//        int [] array2 = { 4, 2, 8, 2, 1, 3, 6, 5};
//        System.out.println("Selection Sort: " + Arrays.toString(SelectionSort.sort(array2)));

        //Insertion sort
        int [] array3 = { 2, 3, 1, 4, 9, 5, 7, 8, 6};
//        System.out.println("Selection Sort: " + Arrays.toString(InsertionSort.sort(array3)));

        //Factorial
//        System.out.println("Factorial : " + Factorial.factorial(4));

        //Palindrome
//        System.out.println("Factorial : " + Palindrome.isPalindrome("gadag"));

        //Power
//        System.out.println("Factorial : " + Power.power(2, 16));


        // Tower of hanoi
//        TowerOfHanoi.towerOfHanoi(3, 'A', 'B', 'C');

        //Merge sort
//        System.out.println("Merge sort : " + Arrays.toString(MergeSort.sort(array3, 0, array3.length - 1)));

//        System.out.println("Merge sort : " + Arrays.toString(QuickSort.sort(array3, 0, array3.length - 1)));

//        System.out.println("Merge sort : " + Arrays.toString(BubbleSort.sort(array3)));

//        int[][]graph = {
//                {1},
//                {0, 4, 5},
//                {3, 4, 5},
//                {2, 6},
//                {1, 2},
//                {1, 2, 6},
//                {3, 5},
//                {}
//        };
//
//        BFS.search(graph, 3);

        // Parenthesis match
//        HashMap<Character, Character> parenthesisMap = new HashMap<Character, Character>() {{
//            put('{','}');
//            put('[',']');
//            put('(',')');
//        }};
//        System.out.println("Parenthesis matched: " + ParenthesisMatcher.matched("(abc[{0 * 12]lxm)", parenthesisMap));
//        String str = "aaabbbdd";
//        char[] chars = str.toCharArray();
//        int len = RemoveRecurringChars.removeRepeatingCharsRecursively(str.toCharArray(), chars.length, 3);
//        ArrayList<Character> list = new ArrayList<Character>() {{
//            add('a');
//            add('a');
//            add('a');
//            add('c');
//            add('b');
//            add('b');
//            add('b');
//            add('c');
//            add('c');
//            add('e');
//        }};
//
//        RemoveRecurringChars.removeRepeatingCharacterRecursively(list, 3);
//        System.out.print(Arrays.toString(list.toArray()));

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (!running){}
//                System.out.println("Started");
//                while (running){}
//                System.out.println("Stopped");
//            }
//        }).start();
//        Thread.sleep(1000);
//        System.out.println("starting");
//        running =true;
//        Thread.sleep(1000);
//        System.out.println("stopping");
//        running =false;
//
        int result = 0;
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

// Test string, the number 895
//        String test = "MCCCC";
//
//        for (int i = 0; i < decimal.length; i++ ) {
//            while (test.indexOf(roman[i]) == 0) {
//                result += decimal[i];
//                test = test.substring(roman[i].length());
//            }
//        }

        String test = "MCCCC";
        for (int i = 0; i < decimal.length; i++ ) {
            int counter = 0;
            String lastStr = "";
            while (test.indexOf(roman[i]) == 0) {
                result += decimal[i];
                if(lastStr.isEmpty()){
                    lastStr.
                }


                test = test.substring(roman[i].length());
            }
        }

        System.out.println(test);

    }
//    static volatile boolean running = false;

    public static final int[] NUMBER_VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // array containing all of the values
    public static final String[] NUMBER_LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // array containing all of the numerals

    /**
     * Method used to convert a string to a integer
     * @param roman roman numeral to be converted
     * @return integer
     */
    public static int toNumerical(String roman) {
        for (int i = 0  ; i < NUMBER_VALUES.length ; i++) { // Loop through all the letters
            if(roman.startsWith(NUMBER_LETTERS[i])) // Check if the string starts with that letter
                return NUMBER_VALUES[i] + toNumerical(roman.replaceFirst(NUMBER_LETTERS[i], "")); // Rinse and repeats until the string is empty and return it
        }
        return 0; // If something went wrong, simply return 0
    }
}
