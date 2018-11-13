package algorithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] array, int left, int right){
        if (left < right) {
            int med = left + (right - left) / 2;
            sort(array, left, med);
            sort(array, med + 1, right);
            merge(array, left, med, right);
        }
        return array;
    }

    private static void merge(int[] array, int left, int med, int right){

        int leftArraySize = med - left + 1;
        int[] leftArray = new int[leftArraySize];
        System.arraycopy(array, left, leftArray, 0, leftArraySize);

        int rightArraySize = right - med;
        int[] rightArray = new int[rightArraySize];
        System.arraycopy(array, med + 1, rightArray, 0, rightArraySize);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArraySize && j < rightArraySize){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArraySize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArraySize){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
