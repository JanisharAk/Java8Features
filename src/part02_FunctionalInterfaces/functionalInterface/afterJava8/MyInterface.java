package part02_FunctionalInterfaces.functionalInterface.afterJava8;

@FunctionalInterface
public interface MyInterface {
    void print();  // Abstract method (functional interface requirement)

    // Default method (instance method, can be overridden)
    default void defaultMethod() {
        System.out.println("This is a default method inside MyInterface");
    }

    // Static method (belongs to the interface, cannot be overridden)
    static void staticMethod() {
        System.out.println("This is a static method inside MyInterface");
    }
}
