package assignments;
import java.util.*;
import java.util.stream.*;

public class WordCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karthik", "Anusha", "Vikram", "Sri");

        long count = names.stream()
                          .filter(n -> n.length() > 5)
                          .count();

        System.out.println("Names longer than 5 characters: " + count);
    }
}
