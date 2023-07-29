package chapter2_behavior_parameterized.chapter2_2.pretty_print;

import chapter2_behavior_parameterized.chapter2_1.Apple;

import java.util.List;

import static chapter2_behavior_parameterized.chapter2_1.Runner.appleBox;

public class Runner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();
        for(Apple apple : inventory) {
            System.out.println(prettyPrintApple(apple, new AppleColorPrettyPrinter()));
        }

        for(Apple apple : inventory) {
            System.out.println(prettyPrintApple(apple, new AppleWeightPrettyPrinter()));
        }
    }

    public static String prettyPrintApple(Apple apple, ApplePrettyPrinter applePrettyPrinter) {
        return applePrettyPrinter.prettyPrint(apple);
    }
}
