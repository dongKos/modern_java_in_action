package chapter3_lambda.chapter3_3;

public class VariableRunner {
    public static void main(String[] args) {
        int num = 10;
        Runnable runnable = () -> System.out.println(num);
        runnable.run();
//        num = 20; Compile Error

        final int num2 = 20;
        Runnable runnable2 = () -> System.out.println(num2);
        runnable2.run();
    }
}
