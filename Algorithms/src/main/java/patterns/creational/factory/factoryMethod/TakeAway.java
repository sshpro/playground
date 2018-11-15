package patterns.creational.factory.factoryMethod;

import patterns.creational.factory.IFood;

public abstract class TakeAway {

    public IFood orderFood(String[] ingredients){
        IFood pizza = createFood(ingredients);
        pizza.garnish();
        pizza.box();
        return pizza;
    }
    public abstract IFood createFood(String[] ingredients);
}
