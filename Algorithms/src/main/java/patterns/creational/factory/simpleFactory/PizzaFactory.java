package patterns.creational.factory.simpleFactory;

import patterns.creational.factory.AmericanPizza;
import patterns.creational.factory.IndianPizza;
import patterns.creational.factory.ItalianPizza;
import patterns.creational.factory.Pizza;

public class PizzaFactory {
    public  enum PizzaType {
        American,
        Italian,
        Indian
    }


    // Its not really pattern, its actually code construct, and good practice,
    // Keeping object creations in one place so, if modifications to be done, its only done at one place
    // Avoids the duplication of creating
    public static Pizza createPizza(PizzaType pizzaType, String[] ingredients){
        switch (pizzaType) {
            case Indian:
                return new IndianPizza(ingredients);
            case American:
                return new AmericanPizza(ingredients);
            case Italian:
                return new ItalianPizza(ingredients);
            default:
                return null;
        }
    }
}
