package patterns.factory.abstract_factory.ingredients_factory;

public class AmericanIngredientFactory implements IngredientFactory {
    @Override
    public void addCheese() {
        System.out.println("American Roquefort Cheese added");
    }

    @Override
    public void addVegetables() {
        System.out.println("Pepper and Mushrooms added");
    }

    @Override
    public void addMeat() {
        System.out.println("Sausages added");
    }
}
