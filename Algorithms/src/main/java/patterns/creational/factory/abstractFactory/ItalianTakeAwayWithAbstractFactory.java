package patterns.creational.factory.abstractFactory;

public class ItalianTakeAwayWithAbstractFactory extends TakeAwayWithAbstractFactory {
    ItalianTakeAwayWithAbstractFactory(FoodFactory pizzaFactory) {
        super(pizzaFactory);
    }
    // Default behaviour
    ItalianTakeAwayWithAbstractFactory(){
        super(new ItalianFoodFactory());
    }
}
