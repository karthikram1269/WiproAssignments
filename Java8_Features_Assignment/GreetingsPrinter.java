package assignments;
@FunctionalInterface
interface Printer {
    void print(String message);
}

public class GreetingsPrinter {
    public static void main(String[] args) {
        Printer printer = msg -> System.out.println(msg);

        greet("Hello, Welcome to Java 8 Features!", printer);
    }

    static void greet(String message, Printer printer) {
        printer.print(message);
    }
}
