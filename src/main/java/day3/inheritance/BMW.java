package day3.inheritance;

public class BMW extends Car {
    public BMW() {
        super("Bmw", 23);
    }

    public void bmw() {
        System.out.println("to jest bmw");
    }

    @Override
    public void doSth() {
        System.out.println("metoda abstrakcyjna w BMW");
    }
}
