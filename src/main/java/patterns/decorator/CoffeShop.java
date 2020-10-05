package patterns.decorator;

import patterns.decorator.decorators.Milk;
import patterns.decorator.origins.Tea;
import patterns.decorator.origins.Beverage;
import patterns.decorator.origins.Espresso;
import patterns.decorator.decorators.Sugar;

public class CoffeShop {
    public static void main(String[] args) {
        Beverage teaWith2SugarAndMilk = new Tea();
        teaWith2SugarAndMilk = new Sugar(teaWith2SugarAndMilk);
        teaWith2SugarAndMilk = new Sugar(teaWith2SugarAndMilk);
        teaWith2SugarAndMilk = new Milk(teaWith2SugarAndMilk);

        Beverage espressoWithMilk = new Espresso();
        espressoWithMilk = new Milk(espressoWithMilk);

        System.out.println("Final order:");
        System.out.println(teaWith2SugarAndMilk.getDescription() + " $" + teaWith2SugarAndMilk.cost());
        System.out.println(espressoWithMilk.getDescription() + " $" + espressoWithMilk.cost());

    }
}
