package patterns.factory.factory_method.pizza;

public class AmericanPizza implements Pizza {
    @Override
    public void startPrepare() {
        System.out.println("Start of American Pizza preparation");
    }

    @Override
    public void prepare() {
        System.out.println("American Pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("American Pizza baked");
    }

    @Override
    public void box() {
        System.out.println("American Pizza boxed");
    }
}
