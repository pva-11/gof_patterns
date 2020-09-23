package patterns.strategy.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("... (no duck sound)");
    }
}
