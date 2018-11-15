package patterns.creational.factory;

public abstract class Food implements IFood {
    String[] mIngredients;
   public Food(String[] ingredients){
        mIngredients = ingredients;
    }
}
