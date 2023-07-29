package behavior_parameterized.chapter2_3;

import behavior_parameterized.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static behavior_parameterized.chapter2_1.Color.RED;
import static behavior_parameterized.chapter2_1.Runner.appleBox;

public class GenericRunner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();

        List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        System.out.println(redApples);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumbers = filter(numbers, (Integer number) -> number % 2 == 0);
        System.out.println(evenNumbers);

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(List.of("a","b","c", "", "d"), nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if(predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
