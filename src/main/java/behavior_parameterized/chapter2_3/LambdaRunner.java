package behavior_parameterized.chapter2_3;

import behavior_parameterized.chapter2_1.Apple;

import java.util.List;

import static behavior_parameterized.chapter2_1.Color.RED;
import static behavior_parameterized.chapter2_1.Runner.appleBox;
import static behavior_parameterized.chapter2_2.Runner.filterApples;

public class LambdaRunner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();
        List<Apple> result = filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        List<Apple> result2 = filterApples(inventory,
            (Apple apple) -> {
                return RED.equals(apple.getColor());
            }
        );
        System.out.println(result);
        System.out.println(result2);
    }
}
