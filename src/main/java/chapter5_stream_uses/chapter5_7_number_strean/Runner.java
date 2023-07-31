package chapter5_stream_uses.chapter5_7_number_strean;

import chapter4_stream.what_is_stream.Dish;

import java.util.List;

import static chapter4_stream.what_is_stream.StreamRunner.createDishes;

public class Runner {
    public static void main(String[] args) {
        List<Dish> dishes = createDishes(20);
        // 내부적으로 합계를 계산하기 전에 Integer를 int boxing하는 비용이 발생한다.
        // 바로 sum을 할 수는 없을까?
        int sumOfCalories = dishes.stream()
            .map(Dish::getCalories)
            .reduce(0, Integer::sum);
        System.out.println(sumOfCalories);
    }
}
