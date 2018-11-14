package patterns.behavioural.strategy;

import algorithms.sort.QuickSort;

public class QSort implements ISort {
    @Override
    public void sort(int[] array) {
        QuickSort.sort(array, 0, array.length - 1);
    }
}
