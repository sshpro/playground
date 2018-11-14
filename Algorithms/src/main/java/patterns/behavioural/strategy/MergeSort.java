package patterns.behavioural.strategy;

public class MergeSort implements ISort {

    @Override
    public void sort(int[] array) {
        algorithms.sort.MergeSort.sort(array, 0, array.length - 1);
    }
}
