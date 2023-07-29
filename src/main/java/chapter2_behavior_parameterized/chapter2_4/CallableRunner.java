package chapter2_behavior_parameterized.chapter2_4;

import java.util.concurrent.*;

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        Future<String> withLambda = executorService.submit(() -> Thread.currentThread().getName());

        System.out.println(threadName.get());
        System.out.println(withLambda.get());
    }
}
