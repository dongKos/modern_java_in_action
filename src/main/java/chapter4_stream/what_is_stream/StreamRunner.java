package chapter4_stream.what_is_stream;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static chapter4_stream.what_is_stream.Dish.Type.MEAT;
import static chapter4_stream.what_is_stream.Dish.Type.OTHER;

public class StreamRunner {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Dish> dishes = createDishes(50);
        var result = dishes.stream()
            .filter(d -> d.getCalories() < 4000)
            .sorted(Comparator.comparing(Dish::getCalories))
            .map(Dish::getName)
            .toList();
        System.out.println(result);
        System.out.println("time : " + (System.currentTimeMillis() - start));
    }

    public static List<Dish> createDishes(int count) {
        Faker faker = new Faker();
        List<Dish> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            boolean isEven = i % 2 == 0;
            result.add(new Dish(
                faker.food().dish(),
                (isEven) ? true : false,
                new Random().nextInt(10000 - 1000) + 1000,
                (isEven) ? MEAT : OTHER
            ));
        }
        return result;
    }
}
