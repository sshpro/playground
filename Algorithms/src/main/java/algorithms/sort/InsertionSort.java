package algorithms.sort;

public class InsertionSort {
    // k < log(n) < n < (n)log(n) < n^2 < n^3 < 2^n < n!
    //O(n²) worst case  Θ(n) best case
    public static int[] sort(int[] array){
        for (int i = 1; i < array.length ; i++)
            insert(array, i- 1, array[i]);
        return array;
    }

    private static void insert(int[] array, int rightIndex, int value){
        int i;
        for(i = rightIndex; i >= 0 && value < array[i]; i--){
            array[i+1] = array[i];
        }
        array[i + 1] = value;
    }

}
