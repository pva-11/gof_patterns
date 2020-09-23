package patterns.strategy;

import patterns.strategy.ducks.Duck;
import patterns.strategy.ducks.MallardDuck;
import patterns.strategy.ducks.ToyDuck;
import patterns.strategy.quack.Quack;

public class StrategyMain {
    public static void main(String[] args) {
        System.out.println("======");
        System.out.println("#1 Strategy Pattern: composition of Ducks Behavior");
        System.out.println("======");

        Duck mallard = new MallardDuck("Mallard");
        System.out.println(mallard.getDescription());
        mallard.pleaseQuack();
        mallard.startFly();
        System.out.println("===");

        Duck toy = new ToyDuck("Toy");
        System.out.println(toy.getDescription());
        toy.pleaseQuack();
        toy.startFly();
        System.out.println("===");

        Duck toyImprovedQuack = new ToyDuck("Toy improved");
        System.out.println(toyImprovedQuack.getDescription());
        toyImprovedQuack.pleaseQuack();
        System.out.println("[Dynamically improved]");
        toyImprovedQuack.setQuack(new Quack());
        toyImprovedQuack.pleaseQuack();
        toyImprovedQuack.startFly();

    }
}
