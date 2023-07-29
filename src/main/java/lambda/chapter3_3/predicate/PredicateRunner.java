package lambda.chapter3_3.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer integer) -> integer % 2 == 0;
        IntPredicate isEven2 = (int num) -> num % 2 == 0;
        System.out.println(isEven2.test(2));
        System.out.println(isEven.test(2));
    }
}
