package chapter3_lambda.chapter3_6.method_reference.trifunction;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
