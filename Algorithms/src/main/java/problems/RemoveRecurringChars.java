package problems;

import java.util.LinkedList;
import java.util.List;

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

    public static int removeRepeatingCharsRecursively(char[] input, int initialLength, int minRepeatCount){
        int i = 0;
        int j = 0;
        int count = 0;

        if(initialLength == 0 || input == null)
            return 0;
        while (i < initialLength){
            while (j < initialLength && input[i] == input[j++]){
                count++;
            }
            if(count >= minRepeatCount)
                break;
            i++;

        }
        j--;
        if(count >= minRepeatCount){
            while(i < initialLength){
                char temp = '\0';
                if(j < initialLength)
                    temp = input[j++];
                input[i++] = temp;
            }
        }else
            count = 0;
        int newLength = initialLength - count;
        return  newLength == initialLength ? newLength : removeRepeatingCharsRecursively(input, newLength, minRepeatCount);
    }


    public static void removeRepeatingCharacterRecursively(List<Character> characters, int minRepeatCount){
        if(characters == null || characters.isEmpty())
            return;
        int repeatedCount;
        do {
            repeatedCount = 0;
            for(int i = 0 ; i < characters.size(); i++){
               int j = i + 1;
               while (j < characters.size() && characters.get(i) == characters.get(j)){
                   j++;
               }
               repeatedCount = j - i;
               if(repeatedCount >= minRepeatCount){
                   characters.subList(i, i + repeatedCount).clear();
                   break;
               }
            }
        }while (repeatedCount >= minRepeatCount);
    }

}
