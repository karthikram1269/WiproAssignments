package assignments;
import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karthik", "Anusha", "Vikram", "Suresh", "Bhavana");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println("Sorted Names: " + names);
    }
}
