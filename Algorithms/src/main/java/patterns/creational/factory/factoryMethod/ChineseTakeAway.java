package patterns.creational.factory.factoryMethod;

import patterns.creational.factory.ChineseFood;
import patterns.creational.factory.IFood;

public class ChineseTakeAway extends TakeAway {
    @Override
    public IFood createFood(String[] ingredients) {
        return new ChineseFood(ingredients);
    }
}
