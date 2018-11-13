package algorithms.recursion;

public class Power {

    public static  int power(int number, int pow){
        if(pow == 0)
            return 1;
        return number * power(number, pow - 1);
    }
}
