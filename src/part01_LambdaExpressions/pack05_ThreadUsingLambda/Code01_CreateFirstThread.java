package part01_LambdaExpressions.pack05_ThreadUsingLambda;

public class Code01_CreateFirstThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            // Used to set custom name to the current thread
            Thread.currentThread().setName("My First Thread");
            System.out.println(Thread.currentThread().getName() + " is running");
        };

        // Instantiating Thread class by passing Runnable
        // reference to Thread constructor
        Thread run = new Thread(runnable);

        // Starting the thread
        run.start();
    }
}
