package algorithms.recursion;

public class Palindrome {
    public static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindrome(middleString(str));
    }

    private static String middleString(String str){
        if(str.length() == 1 || str.length() == 2)
            return "";
        else
            return str.substring(1, str.length() - 1);
    }
}
