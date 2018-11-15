package patterns.creational.factory.abstractFactory;

import patterns.creational.factory.IFood;
import patterns.creational.factory.IndianFood;

public class IndianFoodFactory extends FoodFactory {
    @Override
    public IFood createPizza(String[] ingredients) {
        return new IndianFood(ingredients);
    }
}
