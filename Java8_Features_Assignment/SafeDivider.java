package assignments;
import java.util.Optional;

public class SafeDivider {
    public static Optional<Integer> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(a / b);
    }

    public static void main(String[] args) {
        Optional<Integer> result = divide(10, 0);
        System.out.println(result.isPresent() ? result.get() : "Not Allowed");
    }
}
