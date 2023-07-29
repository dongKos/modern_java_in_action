package chapter4_stream.what_is_stream.chapter4_3_2_iteration;

import chapter4_stream.what_is_stream.Dish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class IterationRunner {
    public static void main(String[] args) {
        byForEach();
        byIterator();
        byStream();
    }

    private static void byForEach() {
        List<Dish> menus = new ArrayList<>(createDishes(10));
        List<String> names = new ArrayList<>();
        for(Dish dish : menus) {
            names.add(dish.getName());
        }
        System.out.println(names);
    }

    private static void byIterator() {
        List<Dish> menus = new ArrayList<>(createDishes(10));
        List<String> names = new ArrayList<>();
        Iterator<Dish> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            names.add(dish.getName());
        }
        System.out.println(names);
    }

    private static void byStream() {
        List<Dish> menus = new ArrayList<>(createDishes(10));
        List<String> names = menus.stream().map(Dish::getName)
            .toList();
        System.out.println(names);
    }
}
