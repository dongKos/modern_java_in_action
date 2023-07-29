package lambda.chapter3_6.method_reference;

import behavior_parameterized.chapter2_1.Apple;
import behavior_parameterized.chapter2_1.Color;
import lambda.chapter3_4.supplier.SupplierRunner;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static behavior_parameterized.chapter2_1.Runner.appleBox;

public class MethodReferenceForConstructorRunner {
    public static void main(String[] args) {
        Supplier<Apple> appleSupplier = Apple::new;
        Apple apple = appleSupplier.get();
        System.out.println(apple);

        BiFunction<Color, Integer, Apple> appleBiFunction = Apple::new;
        Apple appleWithBiFunction = appleBiFunction.apply(Color.RED, 200);
        System.out.println(appleWithBiFunction);

        Apple apple3 = map.get("apple").apply(Color.RED, 20);
        System.out.println(apple3);
    }

    static Map<String, BiFunction<Color, Integer, Apple>> map = new HashMap<>();
    static {
        map.put("apple", Apple::new);
    }
}
