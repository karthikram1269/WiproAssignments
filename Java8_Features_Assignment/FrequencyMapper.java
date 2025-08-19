package assignments;
import java.util.*;
import java.util.stream.*;

public class FrequencyMapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karthik", "Anusha", "Karthik", "Vikram", "Anusha", "Karthik");

        Map<String, Long> frequency = names.stream()
                                           .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("Frequency Map: " + frequency);
    }
}
