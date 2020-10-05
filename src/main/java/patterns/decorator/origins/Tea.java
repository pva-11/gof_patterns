package patterns.decorator.origins;

import patterns.decorator.origins.Beverage;

public class Tea extends Beverage {

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
