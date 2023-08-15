package chapter7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Runner {
    public static void main(String[] args) {
        System.out.println((forkJoinSum(10_000_000)));
        System.out.println(countWordIteratively("Hello world!"));
    }

    private static int countWordIteratively(String s) {
        int counter = 0;
        boolean lastSpace = true;
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                lastSpace = true;
            } else {
                if (lastSpace) counter++;
                lastSpace = false;
            }
        }
        return counter;
    }

    private static long forkJoinSum(long number) {
        long [] numbers = LongStream.rangeClosed(1, number).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }
}
