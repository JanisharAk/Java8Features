package part02_FunctionalInterfaces.functionalInterface;

public class Code01_BeforeJava8 {
    public static void main(String[] args) {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}
