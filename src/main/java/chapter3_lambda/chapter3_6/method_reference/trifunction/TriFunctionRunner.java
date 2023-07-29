package chapter3_lambda.chapter3_6.method_reference.trifunction;

public class TriFunctionRunner {
    public static void main(String[] args) {
        TriFunction<String, Integer, String, User> userTriFunction = User::new;
        System.out.println(userTriFunction.apply("dongko", 31, "251-1"));
    }
}
