package day3.interfaces;

public class Block implements Building,AnotherHouse {
    @Override
    public int sum(int a, int b) {
        System.out.println("Block");
        return a + b;
    }

    @Override
    public void method() {
        System.out.println();
    }
}
