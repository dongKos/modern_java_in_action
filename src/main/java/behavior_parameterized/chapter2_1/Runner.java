package behavior_parameterized.chapter2_1;

import java.util.ArrayList;
import java.util.List;

import static behavior_parameterized.chapter2_1.Color.GREEN;
import static behavior_parameterized.chapter2_1.Color.RED;

public class Runner {
    public static void main(String[] args) {
        List<Apple> inventory = appleBox();

        System.out.println(filterGreenApples(inventory));
        System.out.println(filterApplesByColor(inventory, RED));
        System.out.println(filterApplesByWeight(inventory, 5));
    }

    public static List<Apple> appleBox() {
        return List.of(
            new Apple(GREEN, 10),
            new Apple(RED, 15),
            new Apple(GREEN, 20),
            new Apple(RED, 5),
            new Apple(RED, 8),
            new Apple(RED, 30),
            new Apple(RED, 40)
        );
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
}
