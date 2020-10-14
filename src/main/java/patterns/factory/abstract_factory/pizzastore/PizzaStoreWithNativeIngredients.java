package patterns.factory.abstract_factory.pizzastore;

import patterns.factory.abstract_factory.ingredients_factory.IngredientFactory;
import patterns.factory.abstract_factory.pizza.PizzaWithNativeIngredients;
import patterns.factory.factory_method.pizza.Pizza;

public abstract class PizzaStoreWithNativeIngredients {

    public void createPizza() {
        Pizza pizza = new PizzaWithNativeIngredients(getNativeIngredients());
        pizza.startPrepare();
        pizza.prepare();
        pizza.bake();
        pizza.box();
    }

    public abstract IngredientFactory getNativeIngredients();

}
