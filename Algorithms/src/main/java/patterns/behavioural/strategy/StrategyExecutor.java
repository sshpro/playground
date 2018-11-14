package patterns.behavioural.strategy;

public class StrategyExecutor {

    // Behavioural pattern, also known as policy pattern
    // Enables an algorithm's behaviour to be selected at runtime
    // Defines a family of algorithms
    // Encapsulate each algorithm &
    // makes the algorithms interchangeable within that family

    //Promotes the Open/Closed principle by using Composition over inheritance

    // In this example this executor is client which decides run time based on requirement which sorting & searching algorithm to choose

    public static int execute(int[] array, int target){
        ISearch search = new BinarySearch();
        // Notice the sorting algorithm passed here,
        // this can be dynamically chosen by consumer on runtime
        ISort sort;
        if(array.length < 10)
            sort = new BubbleSort();
        else if(array.length < 100)
            sort = new MergeSort();
        else
            sort = new QSort();
        return search.search(sort, array, target);
    }
}
