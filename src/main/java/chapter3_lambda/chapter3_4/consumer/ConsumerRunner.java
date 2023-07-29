package chapter3_lambda.chapter3_4.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {
        forEach(Arrays.asList("a", "b", "c", "d"),
            (String s) -> System.out.println(s)
        );
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
