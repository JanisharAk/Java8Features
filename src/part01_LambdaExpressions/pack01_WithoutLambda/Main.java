package part01_LambdaExpressions.pack01_WithoutLambda;

public class Main {
    // Functional interface parameter is passed
    static void fun(Test t) {
        t.print();
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass and passing it
        fun(new MyClass());
    }
}
