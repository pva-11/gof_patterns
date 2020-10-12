package patterns.factory.factory_method.pizza;

public class AmericanCheesePizza implements Pizza {
    @Override
    public void startPrepare() {
        System.out.println("Start of American Pizza with Cheese preparation");
    }

    @Override
    public void prepare() {
        System.out.println("American Pizza with Cheese prepared");
    }

    @Override
    public void bake() {
        System.out.println("American Pizza with Cheese baked");
    }

    @Override
    public void box() {
        System.out.println("American Pizza with Cheese boxed");
    }
}
