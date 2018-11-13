package algorithms.sort;

public class BubbleSort {

    public static int[] sort(int[] array){
        int len = array.length;
        while (len > 0){
            int swapCount = 0;
            for(int i = 0; i < len - 1 ; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    swapCount++;
                }
            }
            if(swapCount == 0)
                break;
            len--;
        }
        return array;
    }

    private static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
