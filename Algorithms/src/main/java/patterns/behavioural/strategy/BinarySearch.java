package patterns.behavioural.strategy;

public class BinarySearch implements ISearch {
    @Override
    public int search(ISort sort, int[] array, int target) {
        if(sort != null)
            sort.sort(array);
        return algorithms.search.BinarySearch.binarySearch(array, target);
    }
}
