package chapter3_lambda.chapter3_8.lambda_combination;

import java.util.function.Function;

public class FunctionCombinationRunner {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        System.out.println(h.apply(2));


        Function<Integer, Integer> o = f.compose(g);
        System.out.println(o.apply(3));
    }
}
