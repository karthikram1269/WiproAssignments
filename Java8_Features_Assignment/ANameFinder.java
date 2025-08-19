package assignments;
import java.util.*;
import java.util.stream.*;

public class ANameFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anusha", "Karthik", "Aman", "Bhavana");

        List<String> aNames = names.stream()
                                   .filter(n -> n.startsWith("A"))
                                   .collect(Collectors.toList());

        System.out.println("Names starting with A: " + aNames);
    }
}
