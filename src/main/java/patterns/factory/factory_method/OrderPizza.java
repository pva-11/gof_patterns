package patterns.factory.factory_method;

import patterns.factory.factory_method.pizzastore.AmericanPizzaStore;
import patterns.factory.factory_method.pizzastore.ItalianPizzaStore;
import patterns.factory.factory_method.pizzastore.PizzaStore;

public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore italian = new ItalianPizzaStore();
        italian.orderPizza("cheese");

        PizzaStore american = new AmericanPizzaStore();
        american.orderPizza("");
    }
}
