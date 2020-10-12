package patterns.factory.factory_method.pizzastore;

import patterns.factory.factory_method.pizza.ItalianCheesePizza;
import patterns.factory.factory_method.pizza.ItalianPizza;
import patterns.factory.factory_method.pizza.Pizza;

public class ItalianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaName) {
        if (pizzaName.equals("cheese")) {
            return new ItalianCheesePizza();
        }
        return new ItalianPizza();
    }
}
