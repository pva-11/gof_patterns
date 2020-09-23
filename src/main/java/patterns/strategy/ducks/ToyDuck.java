package patterns.strategy.ducks;

import patterns.strategy.fly.FlyNoWings;
import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.MuteQuack;
import patterns.strategy.quack.Quack;

public class ToyDuck extends Duck {

    public ToyDuck(String description) {
        this.setDescription(description);
        this.setFly(new FlyNoWings());
        this.setQuack(new MuteQuack());
    }

}
