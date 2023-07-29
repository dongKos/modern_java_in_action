package chapter3_lambda.chapter3_8.lambda_combination;

import chapter2_behavior_parameterized.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static chapter2_behavior_parameterized.chapter2_1.Runner.appleBox;

public class ComparatorCombinationRunner {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(appleBox());
        apples.sort(
            Comparator.comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor)
                .reversed()
        );
        System.out.println(apples);
    }
}
