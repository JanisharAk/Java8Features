package part01_LambdaExpressions.pack02_WithLambda;

public class Main {
    // functional interface parameter is passed
    static void fun(Test t) {
        t.print();
    }
    public static void main(String[] args)
    {
        // lambda expression is passed
        // without parameter to functional interface t
        fun(() -> System.out.println("This is lambda expression without parameter"));
    }
}
