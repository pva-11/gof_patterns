package patterns.factory.abstract_factory.pizza;

import patterns.factory.abstract_factory.ingredients_factory.IngredientFactory;
import patterns.factory.factory_method.pizza.Pizza;

public class PizzaWithNativeIngredients implements Pizza {

    private IngredientFactory ingredientFactory;

    public PizzaWithNativeIngredients(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void startPrepare() {
        System.out.println("Start of Pizza with Native ingredients preparation ");
    }

    @Override
    public void prepare() {
        ingredientFactory.addCheese();
        ingredientFactory.addMeat();
        ingredientFactory.addVegetables();
    }

    @Override
    public void bake() {
        System.out.println("Pizza baked");
    }

    @Override
    public void box() {
        System.out.println("Pizza boxed");
    }
}
