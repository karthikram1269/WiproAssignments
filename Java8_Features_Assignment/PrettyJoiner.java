package assignments;
import java.util.*;
import java.util.stream.Collectors;

public class PrettyJoiner {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Chennai", "Delhi", "Mumbai", "Bangalore");

        String joined = cities.stream()
                              .collect(Collectors.joining(", "));

        System.out.println("Cities: " + joined);
    }
}
