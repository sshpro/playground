package patterns.creational.factory.abstractFactory;

public class IndianTakeAwayWithAbstractFactory extends TakeAwayWithAbstractFactory {
    IndianTakeAwayWithAbstractFactory(FoodFactory pizzaFactory) {
        super(pizzaFactory);
    }

    // Default behaviour
    IndianTakeAwayWithAbstractFactory(){
        super(new IndianFoodFactory());
    }
}
