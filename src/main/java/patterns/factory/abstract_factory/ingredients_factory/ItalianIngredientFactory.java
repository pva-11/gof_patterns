package patterns.factory.abstract_factory.ingredients_factory;

public class ItalianIngredientFactory implements IngredientFactory {
    @Override
    public void addCheese() {
        System.out.println("Italian Parmesan Cheese added");
    }

    @Override
    public void addVegetables() {
        System.out.println("Cherry Tomatoes added");
    }

    @Override
    public void addMeat() {
        System.out.println("Light Prosciutto added");
    }
}
