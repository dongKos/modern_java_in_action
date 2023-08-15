package chapter5_stream_uses.chapter5_8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        createStreamByValue();
        createStreamByNullableValue();
        createStreamByNullableValueWithFlatMap();
        createStreamByArray();
        createStreamByFile();
        createInfiniteStreamByFunction();
        fibo();
    }

    private static void createStreamByValue() {
        Stream<String> stream = Stream.of("Modern", "java", "in", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();
    }

    private static void createStreamByNullableValue() {
        String homeValue = System.getProperty("home");
        Stream<String> homeValueStream =
            homeValue == null ? Stream.empty() : Stream.of(homeValue);

        Stream.ofNullable(homeValue).forEach(System.out::println);
    }

    private static void createStreamByNullableValueWithFlatMap() {
        Stream.of("config", "home", "value")
            .flatMap(key -> Stream.ofNullable(System.getProperty(key)))
            .forEach(System.out::println);
    }

    private static void createStreamByArray() {
        int[] numbers = {2, 3, 4, 5, 6, 7, 10};
        int sum = Arrays.stream(numbers).sum();
    }

    private static void createStreamByFile() {
        long uniqueWords = 0;
        try (Stream<String> lines =
                 Files.lines(Paths.get("data.txt"), Charset.defaultCharset())
        ) {
            uniqueWords = lines.flatMap(
                    line -> Arrays.stream(line.split(" "))
                )
                .distinct()
                .count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("uniqueWords : " + uniqueWords);
    }

    private static void createInfiniteStreamByFunction() {
        Stream.iterate(0, n -> n + 2)
            .limit(10)
            .forEach(System.out::println);
    }

    private static void fibo() {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
            .limit(20)
            .map(t -> t[0])
            .forEach(System.out::println);
    }
}
