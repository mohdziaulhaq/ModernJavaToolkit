package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        // Prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };
        new Thread(runnable).start();

        // Java 8 Lambda
        // () -> {}
        Runnable runnableThread = () -> {
            System.out.println("Inside RunnableThread");
        };

        Runnable runnableThread2 = () -> System.out.println("Inside RunnableThread2");
        new Thread(runnableThread2).start();

        new Thread( () -> System.out.println("Inside Runnable")).start();
    }
}
