package patterns.behavioural.strategy;

public class InsertionSort implements ISort {
    @Override
    public void sort(int[] array) {
        algorithms.sort.InsertionSort.sort(array);
    }
}
