package patterns.strategy.ducks;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.quack.QuackBehavior;

public abstract class Duck {

    private String description;

    private FlyBehavior fly;
    private QuackBehavior quack;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }

    public void startFly() {
        fly.fly();
    }

    public void pleaseQuack() {
        quack.quack();
    }

}
