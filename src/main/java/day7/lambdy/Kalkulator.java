package day7.lambdy;

public class Kalkulator {
    private int a;
    private int b;

    public Kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int oblicz(Oblicz oblicz) {
        return oblicz.oblicz(a, b);
    }
}
