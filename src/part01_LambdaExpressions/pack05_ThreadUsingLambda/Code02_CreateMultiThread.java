package part01_LambdaExpressions.pack05_ThreadUsingLambda;

public class Code02_CreateMultiThread {
    public static void main(String[] args) {
        Runnable basic = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running common task by "
                    + threadName);
        };

        //Instantiate thread
        Thread thread1 = new Thread(basic);
        Thread thread2 = new Thread(basic);
        Thread thread3 = new Thread(basic);
        Thread thread4 = new Thread(basic);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
/*
Here the output varies everytime:-

Running common task by Thread-3
Running common task by Thread-1
Running common task by Thread-2
Running common task by Thread-0

 */