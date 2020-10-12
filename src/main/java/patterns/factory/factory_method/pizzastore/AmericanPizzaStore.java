package patterns.factory.factory_method.pizzastore;

import patterns.factory.factory_method.pizza.AmericanCheesePizza;
import patterns.factory.factory_method.pizza.AmericanPizza;
import patterns.factory.factory_method.pizza.Pizza;

public class AmericanPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaName) {
        if (pizzaName.equals("cheese")) {
            return new AmericanCheesePizza();
        }
        return new AmericanPizza();
    }
}
