package patterns.factory.abstract_factory;

import patterns.factory.abstract_factory.pizzastore.AmericanPizzaStoreWithNativeIngredients;
import patterns.factory.abstract_factory.pizzastore.ItalianPizzaStoreWithNativeIngredients;
import patterns.factory.abstract_factory.pizzastore.PizzaStoreWithNativeIngredients;

public class OrderPizzaWithNativeIngredients {
    public static void main(String[] args) {
        PizzaStoreWithNativeIngredients italianPizzaStore = new ItalianPizzaStoreWithNativeIngredients();
        italianPizzaStore.createPizza();

        PizzaStoreWithNativeIngredients americanPizzaStore = new AmericanPizzaStoreWithNativeIngredients();
        americanPizzaStore.createPizza();
    }
}
