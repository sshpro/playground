package algorithms.sort;

public class SelectionSort {


    //Θ(n²) i.e its tight case scenario  O(n²) == Ω(n²)
    public static  int[] sort(int[] array){
        for(int i = 0; i< array.length ; i++){
            int indexOfMin = indexOfMin(array, i);
            swap(array, i, indexOfMin);
        }
        return array;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int indexOfMin(int[] array, int startIndex){
        int min = array[startIndex];
        int minIndex = startIndex;
        for(int i = startIndex + 1; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
