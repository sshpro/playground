import java.util.Arrays;
import java.util.HashMap;

import algorithms.search.BFS;
import algorithms.sort.BubbleSort;
import algorithms.sort.QuickSort;
import problems.ParenthesisMatcher;

public class Main {
    public static void main(String[] arg){
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
        HashMap<Character, Character> parenthesisMap = new HashMap<Character, Character>() {{
            put('{','}');
            put('[',']');
            put('(',')');
        }};
        System.out.println("Parenthesis matched: " + ParenthesisMatcher.matched("(abc[{0 * 12]lxm)", parenthesisMap

    }


}
