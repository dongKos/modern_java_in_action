package chapter5_stream_uses.chapter5_7_number_strean.number_range;

import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 100);
        IntStream intStream2 = IntStream.rangeClosed(0, 100);

        // 0 - 99까지 반복문
        IntStream.range(0, 100).forEach(System.out::println);
        IntStream.rangeClosed(0, 99).forEach(System.out::println);
    }
}
