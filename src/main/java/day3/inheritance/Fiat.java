package day3.inheritance;

public class Fiat extends Car {
    public Fiat() {
        super("fiat");
    }

    public void fiat() {
        System.out.println("to jest fiat");
    }

    @Override
    public void ride(String name) {
        System.out.println("inna metoda ride klasa Fiat " + name);
    }

    @Override
    public void doSth() {
        System.out.println("to jest Fiat");
    }
}
