package day8.calc;

public class Kalkulator {

    public int dodaj(int a, int b) {
        Calc c = (x,y) -> x + y;
        return c.calc(a,b);
    }

    public int doSth(int a, int b, Calc calc) {
        return calc.calc(a,b);
    }
}
