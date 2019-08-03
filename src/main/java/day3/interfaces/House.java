package day3.interfaces;

public class House implements Building {
    @Override
    public int sum(int a, int b) {
        System.out.println("House");
        return 0;
    }
}
