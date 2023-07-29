package behavior_parameterized.chapter2_4;

import behavior_parameterized.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static behavior_parameterized.chapter2_1.Runner.appleBox;

public class Runner {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>(appleBox());
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        System.out.println(inventory);

        inventory.sort((Apple a1, Apple a2) -> a2.getWeight() - a1.getWeight());
        System.out.println(inventory);
    }
}
