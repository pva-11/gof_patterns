package patterns.factory.abstract_factory.pizzastore;

import patterns.factory.abstract_factory.ingredients_factory.AmericanIngredientFactory;
import patterns.factory.abstract_factory.ingredients_factory.IngredientFactory;
import patterns.factory.abstract_factory.ingredients_factory.ItalianIngredientFactory;

public class AmericanPizzaStoreWithNativeIngredients extends PizzaStoreWithNativeIngredients {
    @Override
    public IngredientFactory getNativeIngredients() {
        return new AmericanIngredientFactory();
    }
}
