package lambda.chapter3_4.function;

import behavior_parameterized.chapter2_1.Apple;
import behavior_parameterized.chapter2_1.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        List<Integer> list = map(
            Arrays.asList("dongko", "boonong"),
            (String s) -> s.length()
        );
        System.out.println(list);

        AppleFunction();
    }

    public static void AppleFunction() {
        Function<Apple, Integer> weightFunction = (Apple apple) -> apple.getWeight();
        System.out.println(weightFunction.apply(new Apple(Color.RED, 30)));
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t: list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
