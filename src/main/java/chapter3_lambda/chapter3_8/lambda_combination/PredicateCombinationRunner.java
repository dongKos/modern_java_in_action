package chapter3_lambda.chapter3_8.lambda_combination;

import chapter2_behavior_parameterized.chapter2_1.Apple;
import chapter2_behavior_parameterized.chapter2_1.Color;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import static chapter2_behavior_parameterized.chapter2_1.Color.GREEN;
import static chapter2_behavior_parameterized.chapter2_1.Color.RED;

public class PredicateCombinationRunner {
    public static void main(String[] args) {
        Predicate<Apple> redApple = apple -> RED.equals(apple.getColor());
        Predicate<Apple> notRedApple = redApple.negate();
        BiFunction<Color, Integer, Apple> appleBiFunction = Apple::new;
        Apple apple = appleBiFunction.apply(RED, 30);
        System.out.println(redApple.test(apple));
        System.out.println(notRedApple.test(apple));

        Predicate<Apple> redAndHeavyApple = redApple.and(apple1 -> apple1.getWeight() > 15);
        System.out.println(redAndHeavyApple.test(apple));

        Predicate<Apple> redAndHeavyAppleOrGreen = redAndHeavyApple.or(apple2 -> apple2.getColor().equals(GREEN));
        Apple greenButNotHeavyApple = appleBiFunction.apply(GREEN, 10);
        System.out.println(redAndHeavyAppleOrGreen.test(greenButNotHeavyApple));

        Predicate<Apple> greenAndLightOrRedApple =
            redApple.or(
                apple1 -> apple1.getColor().equals(GREEN) && apple1.getWeight() > 15
            );
    }
}
