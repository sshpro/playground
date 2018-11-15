package patterns.creational.factory.abstractFactory;

import patterns.creational.factory.IFood;
import patterns.creational.factory.ItalianFood;

public class ItalianFoodFactory extends FoodFactory {
    @Override
    public IFood createPizza(String[] ingredients) {
        return new ItalianFood(ingredients);
    }
}
