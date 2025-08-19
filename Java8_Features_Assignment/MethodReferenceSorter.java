package assignments;
import java.util.*;

public class MethodReferenceSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karthik", "Anusha", "Vikram", "Bhavana");

        names.sort(String::compareTo);

        System.out.println("Sorted Names: " + names);
    }
}
