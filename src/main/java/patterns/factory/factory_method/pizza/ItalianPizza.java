package patterns.factory.factory_method.pizza;

public class ItalianPizza implements Pizza {
    @Override
    public void startPrepare() {
        System.out.println("Start of Italian Pizza preparation");
    }

    @Override
    public void prepare() {
        System.out.println("Italian Pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Italian Pizza baked");
    }

    @Override
    public void box() {
        System.out.println("Italian Pizza boxed");
    }
}
