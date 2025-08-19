package assignments;
interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() { System.out.println("Sparrow eating..."); }
    public void fly() { System.out.println("Sparrow flying..."); }
}

class Ostrich implements Bird {
    public void eat() { System.out.println("Ostrich eating..."); }
}

public class LSPExample {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        Bird ostrich = new Ostrich();
        ostrich.eat();
    }
}
