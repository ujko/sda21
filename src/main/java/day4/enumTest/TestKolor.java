package day4.enumTest;

public class TestKolor {
    public static void main(String[] args) {
        Kolor k = Kolor.BLACK;
        System.out.println(k.getKolor());
        for(Znak z : Znak.values()) {
            System.out.println(z);
        }
        for(Kolor kk : Kolor.values()) {
            System.out.println(kk.getKolor());
        }
    }
}
