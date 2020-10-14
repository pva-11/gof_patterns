package patterns.factory.abstract_factory.pizzastore;

import patterns.factory.abstract_factory.ingredients_factory.IngredientFactory;
import patterns.factory.abstract_factory.ingredients_factory.ItalianIngredientFactory;

public class ItalianPizzaStoreWithNativeIngredients extends PizzaStoreWithNativeIngredients {
    @Override
    public IngredientFactory getNativeIngredients() {
        return new ItalianIngredientFactory();
    }
}
