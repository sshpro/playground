package algorithms.recursion;

public class SierpinskiGasket {

    public static void draw(int x, int y, int dimension){
        if(dimension <= 4) { // 4 pixel as base case, you can choose anything
            fillRect(x, y, dimension, dimension);
        }else {
            int newDimension = dimension / 2;
            draw(x, y, newDimension); // top-left
            draw(x + newDimension, y, newDimension);  // top-right
            draw(x+newDimension, y + newDimension, newDimension); // bottom-right
        }
    }

    private static void fillRect(int x, int y, int length, int width){
        //TODO fill rect
    }
}
