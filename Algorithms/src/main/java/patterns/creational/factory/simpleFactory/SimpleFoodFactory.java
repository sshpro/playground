package patterns.creational.factory.simpleFactory;

import patterns.creational.factory.ChineseFood;
import patterns.creational.factory.IndianFood;
import patterns.creational.factory.ItalianFood;
import patterns.creational.factory.Food;

public class SimpleFoodFactory {
    public  enum FoodType {
        Chinese,
        Italian,
        Indian
    }


    // Its not really pattern, its actually code construct, and good practice,
    // Keeping object creations in one place so, if modifications to be done, its only done at one place
    // Avoids the duplication of creating
    public static Food createFood(FoodType foodType, String[] ingredients){
        switch (foodType) {
            case Indian:
                return new IndianFood(ingredients);
            case Chinese:
                return new ChineseFood(ingredients);
            case Italian:
                return new ItalianFood(ingredients);
            default:
                return null;
        }
    }
}
