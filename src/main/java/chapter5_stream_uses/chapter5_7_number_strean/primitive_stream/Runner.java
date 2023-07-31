package chapter5_stream_uses.chapter5_7_number_strean.primitive_stream;

import chapter4_stream.what_is_stream.Dish;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class Runner {
    public static void main(String[] args) {
        mapToIntStream();
        toObjectStream();
        optionalInt();
    }

    private static void mapToIntStream() {
        List<Dish> dishes = createDishes(20);
        var sumOfCalories = dishes.stream()
            .mapToInt(Dish::getCalories)
            .sum();
        System.out.println(sumOfCalories);
    }

    private static void toObjectStream() {
        List<Dish> dishes = createDishes(20);
        IntStream intStream = dishes.stream().mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();
    }

    private static void optionalInt() {
        List<Dish> dishes = createDishes(20);
        OptionalInt maxCalories = dishes.stream()
            .mapToInt(Dish::getCalories)
            .max();
        // 값이 없을 때 기본값을 설정할 수 있음
        var result = maxCalories.orElse(1);
    }
}
