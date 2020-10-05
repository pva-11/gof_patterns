package patterns.decorator.decorators;

import patterns.decorator.origins.Beverage;

public class Sugar extends CondimentDecorator {

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
