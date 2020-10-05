package patterns.decorator.origins;

public abstract class Beverage {

    String description = "Simple Hot Water";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
