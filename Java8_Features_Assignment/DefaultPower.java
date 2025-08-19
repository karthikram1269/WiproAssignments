package assignments;
interface Calculator {
    int square(int x);

    default int cube(int x) {
        return x * x * x;
    }
}

public class DefaultPower implements Calculator {
    public int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        DefaultPower dp = new DefaultPower();
        System.out.println("Square: " + dp.square(4));
        System.out.println("Cube: " + dp.cube(4));
    }
}
