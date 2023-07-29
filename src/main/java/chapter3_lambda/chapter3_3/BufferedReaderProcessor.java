package chapter3_lambda.chapter3_3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;
    default String dongko() {return "dongko";}
}
