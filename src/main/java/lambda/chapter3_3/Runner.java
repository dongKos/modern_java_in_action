package lambda.chapter3_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        System.out.println(processFile());
        System.out.println(processFile((BufferedReader br) -> br.readLine()));
        System.out.println(processFile((BufferedReader br) -> br.readLine() + "\n" + br.readLine()));
    }

    private static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException{
        try (BufferedReader br =
                 new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReaderProcessor.process(br);
        }
    }

    public static String processFile() throws IOException {
        try (BufferedReader br =
            new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }
}
