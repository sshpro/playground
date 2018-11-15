package patterns.creational.factory.abstractFactory;

public class ChineseTakeAwayWithAbstractFactory extends TakeAwayWithAbstractFactory {
    // Super class
    ChineseTakeAwayWithAbstractFactory(FoodFactory pizzaFactory) {
        super(pizzaFactory);
    }

    // Default behaviour
    ChineseTakeAwayWithAbstractFactory(){
        super(new ChineseFoodFactory());
    }
}
