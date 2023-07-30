package chapter5_stream_uses.chapter5_2_stream_slicing;

import chapter4_stream.what_is_stream.Dish;

import java.util.Comparator;
import java.util.List;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class PredicateSlicingRunner {
    public static void main(String[] args) {
        List<Dish> menusSortedByCaloriesAsc = createDishes(20)
            .stream()
            .sorted(Comparator.comparing(Dish::getCalories))
            .toList();
        byTakeWhile(menusSortedByCaloriesAsc);
        byDropWhile(menusSortedByCaloriesAsc);
        bySkip(menusSortedByCaloriesAsc);
    }


    private static void byTakeWhile(List<Dish> menusSortedByCaloriesAsc) {
        System.out.println("byTakeWhile");
        List<Dish> sliced = menusSortedByCaloriesAsc.stream()
            // 정렬된 스트림에 한해서 사용해야 한다.
            // predicate 만족안하면 스탑
            .takeWhile(dish -> dish.getCalories() < 5000)
            .toList();
        sliced.forEach(System.out::println);
    }

    private static void byDropWhile(List<Dish> menusSortedByCaloriesAsc) {
        System.out.println("byDropWhile");
        List<Dish> sliced = menusSortedByCaloriesAsc.stream()
            // 정렬된 스트림에 한해서 사용해야 한다.
            // predicate 만족안하면 이전거 버리고 그 다음거 리턴
            .dropWhile(dish -> dish.getCalories() < 5000)
            .toList();
        sliced.forEach(System.out::println);
    }

    private static void bySkip(List<Dish> menusSortedByCaloriesAsc) {
        System.out.println("bySkip");
        List<Dish> sliced = menusSortedByCaloriesAsc.stream()
            .filter(dish -> dish.getCalories() < 5000)
            // filtering 만족하는 요소 중 앞에 n개 건너뛰고 리턴
            .skip(2)
            .toList();
        sliced.forEach(System.out::println);
    }
}
