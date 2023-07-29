package chapter2_behavior_parameterized.chapter2_3;

import chapter2_behavior_parameterized.chapter2_1.Apple;
import chapter2_behavior_parameterized.chapter2_2.ApplePredicate;

import java.util.List;

import static chapter2_behavior_parameterized.chapter2_1.Color.RED;
import static chapter2_behavior_parameterized.chapter2_1.Runner.appleBox;
import static chapter2_behavior_parameterized.chapter2_2.Runner.filterApples;

public class AnonymousClassRunner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();

        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return RED.equals(apple.getColor());
            }
        });

        System.out.println(redApples);
    }
}
