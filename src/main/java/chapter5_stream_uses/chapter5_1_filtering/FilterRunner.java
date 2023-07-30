package chapter5_stream_uses.chapter5_1_filtering;

import chapter4_stream.what_is_stream.Dish;
import chapter4_stream.what_is_stream.StreamRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class FilterRunner {
    public static void main(String[] args) {
        byPredicate();
        byDistinct();
    }

    private static void byPredicate() {
        List<Dish> menus = createDishes(10);
        List<Dish> vegetarianMenus = menus.stream().filter(Dish::isVegetarian)
            .toList();
        System.out.println(vegetarianMenus);
    }

    private static void byDistinct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6);
        numbers.stream()
            .filter(num -> num % 2 == 0)
            .distinct()
            .forEach(System.out::println);
    }
}
