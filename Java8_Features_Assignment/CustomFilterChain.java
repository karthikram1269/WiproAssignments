package assignments;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class CustomFilterChain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anusha", "Karthika", "Aman", "Vikram", "Bhavana");

        Predicate<String> startsWithA = n -> n.startsWith("A");
        Predicate<String> endsWithA = n -> n.endsWith("a");

        List<String> filtered = names.stream()
                                     .filter(startsWithA.and(endsWithA))
                                     .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filtered);
    }
}
