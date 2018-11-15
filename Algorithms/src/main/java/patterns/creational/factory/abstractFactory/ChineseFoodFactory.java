package patterns.creational.factory.abstractFactory;

import patterns.creational.factory.ChineseFood;
import patterns.creational.factory.IFood;

public class ChineseFoodFactory extends FoodFactory {
    @Override
    public IFood createPizza(String[] ingredients) {
        return new ChineseFood(ingredients);
    }
}
