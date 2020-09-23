package patterns.strategy.ducks;

import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(String description) {
        this.setDescription(description);
        this.setFly(new FlyWithWings());
        this.setQuack(new Quack());
    }
}
