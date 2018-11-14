package problems;

public class RemoveRecurringChars {

    public static int remove(char[] input){
        int i = 0;
        int j = 0;
        int newIdx = 0;
        while(j < input.length){
            while(j < input.length && input[i] == input[j]){
                j++;
            }
            input[newIdx++] = input[i];
            i = j;
        }
        return newIdx;
    }

    public static int removeRecursively(char[] input, int initialLength){

    }
}
