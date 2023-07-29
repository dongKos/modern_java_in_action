package behavior_parameterized.chapter2_2;

import behavior_parameterized.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.List;

import static behavior_parameterized.chapter2_1.Runner.appleBox;

public class Runner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();

        System.out.println(filterApples(inventory, new AppleGreenColorPredicate()));
        System.out.println(filterApples(inventory, new AppleHeavyWeightPredicate()));
        System.out.println(filterApples(inventory, new AppleRedAndHeavyWeightPredicate()));
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if(predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
