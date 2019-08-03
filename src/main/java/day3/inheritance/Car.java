package day3.inheritance;

public abstract class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }
    public Car(String name, int a) {
        this.name = name;
    }

    public void ride(String name) {
        System.out.println("Samochod " + name + " jedzie");
    }

    public abstract void doSth();

}
