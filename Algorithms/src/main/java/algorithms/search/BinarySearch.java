package algorithms.search;

public class BinarySearch {

    //O(log2(n)) worst case
    public static int binarySearch(int[] array, int target){
        int min = 0;
        int max = array.length - 1;
        int med;
        int guessCount = 1;
        while (min <= max){
            med = (min + max) /2;
            int guess = array[med];
            if(guess == target){
                System.out.println("Binary Search Guess Count " + guessCount);
                return med;
            }
            else if(target > guess){
                min = med + 1;
            }else {
                max = med - 1;
            }
            guessCount ++;
        }
        System.out.println("Binary Search Guess Count " + guessCount);
        return -1;
    }

    public static int binarySearch(int [] array , int min, int max, int target){
        int med = (min + max) / 2;
        if(min > max)
            return -1;
        else if(target == array[med])
            return med;
        else if( target > med)
            return binarySearch(array, med + 1, max, target);
        else
            return binarySearch(array, min, med - 1, target);
    }
}
