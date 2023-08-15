package chapter6_collect_data_with_stream._6_2_reduce;

import chapter4_stream.what_is_stream.Dish;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;
import static java.util.stream.Collectors.*;

public class Runner {
    public static void main(String[] args) {
        count();
        minMax();
        summarization();
        summarizeString();
        reduce();
    }


    static List<Dish> dishes = createDishes(50);

    private static void count() {
        long howManyDishes = dishes.stream().collect(counting());
        howManyDishes = dishes.stream().count();
    }

    private static void minMax() {
        Comparator<Dish> dishCaloriesComparator =
            Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish =
            dishes.stream().collect(maxBy(dishCaloriesComparator));
        System.out.println(mostCalorieDish);
    }

    private static void summarization() {
        int totalCalories = dishes.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories);

        Double avgCalories = dishes.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(avgCalories);

        IntSummaryStatistics statics = dishes.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(statics);
    }

    private static void summarizeString() {
        String shortMenu = dishes.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(shortMenu);
    }

    private static void reduce() {
        int totalCalories = dishes.stream().collect(reducing(
            0,
            Dish::getCalories,
            Integer::sum
        ));
        System.out.println(totalCalories);
    }
}
