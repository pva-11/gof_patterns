package patterns.decorator.decorators;

import patterns.decorator.decorators.CondimentDecorator;
import patterns.decorator.origins.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }

}
