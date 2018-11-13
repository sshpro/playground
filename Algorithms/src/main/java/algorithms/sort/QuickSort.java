package algorithms.sort;

public class QuickSort {
    // Theoretically O(n^2) but its O(nlogn) running wise
    public static int[]sort(int[] array, int low, int high){
        if(low < high){
            int pIndex = partition(array, low, high);
            sort(array, low, pIndex - 1);
            sort(array, pIndex + 1, high);
        }
        return array;
    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int pIndex = low;
        for(int j = low; j < high ; j++){
            if(array [j] <= pivot){
                swap(array, pIndex, j);
                pIndex++;
            }
        }
        swap(array, pIndex, high);
        return pIndex;
    }

    private static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
