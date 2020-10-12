package patterns.factory.factory_method.pizza;

public class ItalianCheesePizza implements Pizza {
    @Override
    public void startPrepare() {
        System.out.println("Start of Italian Pizza with Cheese preparation");
    }

    @Override
    public void prepare() {
        System.out.println("Italian Pizza with Cheese prepared");
    }

    @Override
    public void bake() {
        System.out.println("Italian Pizza with Cheese baked");
    }

    @Override
    public void box() {
        System.out.println("Italian Pizza with Cheese boxed");
    }
}
