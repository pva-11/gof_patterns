package patterns.decorator.decorators;

import patterns.decorator.origins.Beverage;

abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract  String getDescription();

}
