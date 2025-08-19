package assignments;
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { this.radius = r; }
    public double area() { return Math.PI * radius * radius; }
}

class Square implements Shape {
    double side;
    Square(double s) { this.side = s; }
    public double area() { return side * side; }
}

class AreaCalculator {
    public double calculate(Shape shape) {
        return shape.area();
    }
}

public class OCPExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Circle area: " + calc.calculate(circle));
        System.out.println("Square area: " + calc.calculate(square));
    }
}
