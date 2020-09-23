package patterns.strategy.fly;

public class FlyNoWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
