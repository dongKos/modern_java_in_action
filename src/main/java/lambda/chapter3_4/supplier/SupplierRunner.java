package lambda.chapter3_4.supplier;

import behavior_parameterized.chapter2_1.Apple;
import behavior_parameterized.chapter2_1.Color;

import java.util.function.Supplier;

public class SupplierRunner {
    public static void main(String[] args) {
        Supplier<Apple> appleSupplier = () -> new Apple(Color.RED, 15);
        System.out.println(appleSupplier.get());
    }
}
