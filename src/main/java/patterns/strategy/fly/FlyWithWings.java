package patterns.strategy.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I believe I could fly!");
    }
}
