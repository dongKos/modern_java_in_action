package chapter2_behavior_parameterized.chapter2_4;

public class RunnableRunner {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
        t.start();

        Thread thread = new Thread(() -> System.out.println("Hello dongko!"));
        thread.start();
    }
}
