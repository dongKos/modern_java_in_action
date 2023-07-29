package lambda.chapter3_6.method_reference;

import behavior_parameterized.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import static behavior_parameterized.chapter2_1.Runner.appleBox;

public class MethodReferenceRunner {
    public static void main(String[] args) {
        var inventory = new ArrayList<>(appleBox());
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());
        System.out.println(inventory);

        var inventory2 = new ArrayList<>(appleBox());
        inventory2.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory2);
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("dongko");
    }
}
