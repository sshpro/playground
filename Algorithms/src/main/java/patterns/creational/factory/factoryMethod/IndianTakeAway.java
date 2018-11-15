package patterns.creational.factory.factoryMethod;

import patterns.creational.factory.IFood;
import patterns.creational.factory.IndianFood;

public class IndianTakeAway extends TakeAway {
    @Override
    public IFood createFood(String[] ingredients) {
        return new IndianFood(ingredients);
    }
}
