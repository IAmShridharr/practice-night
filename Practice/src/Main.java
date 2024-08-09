@FunctionalInterface
interface MyFunctionalInterface {
    // Abstract method
    void abstractMethod(String message);

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        MyFunctionalInterface myInterface = (message) -> System.out.println("Abstract method implementation: " + message);

        // Call the abstract method
        myInterface.abstractMethod("Hello, World!");

        // Call the default method
        myInterface.defaultMethod();

        // Call the static method
        MyFunctionalInterface.staticMethod();
    }
}