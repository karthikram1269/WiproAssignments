package assignments;
import java.util.*;

public class ParallelSquarePrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.parallelStream()
               .forEach(n -> System.out.println(n + " squared = " + (n * n)));
    }
}
