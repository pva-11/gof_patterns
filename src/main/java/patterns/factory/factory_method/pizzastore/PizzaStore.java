package patterns.factory.factory_method.pizzastore;

import patterns.factory.factory_method.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String pizzaName) {
        Pizza pizza = createPizza(pizzaName);
        pizza.startPrepare();
        pizza.prepare();
        pizza.bake();
        pizza.box();
    }

    public abstract Pizza createPizza(String pizzaName);

}
