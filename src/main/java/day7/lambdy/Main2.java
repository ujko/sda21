package day7.lambdy;

public class Main2 {

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator(4,5);
        System.out.println(k.oblicz((x, y) -> x - y));
    }
}
