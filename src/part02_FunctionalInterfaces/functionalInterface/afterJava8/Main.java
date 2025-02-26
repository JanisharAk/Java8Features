package part02_FunctionalInterfaces.functionalInterface.afterJava8;

public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        MyInterface myInterface = () -> System.out.println("Hello World");

        // Calling the abstract method
        myInterface.print();

        // Calling the default method using the interface reference
        myInterface.defaultMethod();

        // Calling the static method using the interface name (not via instance)
        MyInterface.staticMethod();
    }
}
