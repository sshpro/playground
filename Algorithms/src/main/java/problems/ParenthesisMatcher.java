package problems;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesisMatcher {

    public static boolean matched(String str, HashMap<Character, Character> parenthesisMap){
        Stack<Character> stack = new Stack<>();
        for(int i= 0 ; i < str.length() ; i++){
            Character value = str.charAt(i);
            if(parenthesisMap.containsKey(value)){
                stack.push(value);
            }else if(parenthesisMap.containsValue(value)){
                if(stack.isEmpty())
                    return false;
                Character key = stack.pop();
                if(parenthesisMap.get(key) != value)
                    return false;
            }
        }
       return stack.isEmpty();
    }

}
