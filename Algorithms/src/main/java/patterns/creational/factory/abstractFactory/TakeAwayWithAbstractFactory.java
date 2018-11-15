package patterns.creational.factory.abstractFactory;

import patterns.creational.factory.IFood;

public abstract class TakeAwayWithAbstractFactory {
    private final FoodFactory mPizzaFactory;

    TakeAwayWithAbstractFactory(FoodFactory pizzaFactory){
        mPizzaFactory = pizzaFactory;
    }

    public IFood orderPizza(String[] ingredients){
        IFood pizza = mPizzaFactory.createPizza(ingredients);
        pizza.garnish();
        pizza.box();
        return pizza;
    }
}
