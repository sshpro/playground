package patterns.creational.factory.abstractFactory;

import patterns.creational.factory.IFood;

public abstract class FoodFactory {
    public abstract IFood createPizza(String[] ingredients);
}
