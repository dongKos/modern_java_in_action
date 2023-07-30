package chapter5_stream_uses.chapter5_5_reduce;

import chapter4_stream.what_is_stream.Dish;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class ReduceRunner {
    public static void main(String[] args) {
        sumByReduce();
        minByReduce();
        maxByReduce();
        getDishesCountByReduce();
    }

    private static void sumByReduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // reduce 인자로 초기값, BinaryOperator 를 넘긴다.
        int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);
    }

    private static void minByReduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // reduce 인자로 초기값, BinaryOperator 를 넘긴다.
        Optional<Integer> result = numbers.stream().reduce(Integer::min);
        System.out.println(result.get());
    }

    private static void maxByReduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // reduce 인자로 초기값, BinaryOperator 를 넘긴다.
        Optional<Integer> result = numbers.stream().reduce(Integer::max);
        System.out.println(result.get());
    }

    private static void getDishesCountByReduce() {
        List<Dish> dishes = createDishes(10);
        int result = dishes.stream()
            .map(d -> 1)
            .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
