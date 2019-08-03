package day3.interfaces;

public interface Building {
    int sum(int a, int b);

    default void method() {
        System.out.println("Interface building");
    }
}
