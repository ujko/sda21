package day8.calc;

public class MainKalkulator {

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println(k.doSth(5, 6, (x, y) -> x * y));
    }
}
