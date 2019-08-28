package day7.lambdy;

@FunctionalInterface
public interface Oblicz {
    int oblicz(int a, int b);

    default void doSth() {
        System.out.println("metoda default");
    }
}
