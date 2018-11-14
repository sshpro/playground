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

    public static int removeRepeatingCharsRecursively(char[] input, int initialLength, int repeatCount){
        int i = 0;
        int j = 0;
        int count = 0;

        if(initialLength == 0 || input == null)
            return 0;
        while (i < initialLength){
            while (j < initialLength && input[i] == input[j++]){
                count++;
            }
            if(count >= repeatCount)
                break;
            i++;

        }
        j--;
        if(count >= repeatCount){
            while(i < initialLength){
                char temp = '\0';
                if(j < initialLength)
                    temp = input[j++];
                input[i++] = temp;
            }
        }else
            count = 0;
        int newLength = initialLength - count;
        return  newLength == initialLength ? newLength : removeRepeatingCharsRecursively(input, newLength, repeatCount);
    }
}
