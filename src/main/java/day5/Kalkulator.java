package day5;

import java.math.BigInteger;

public class Kalkulator <T extends Number> {
    private Number a1;
    private Number a2;

    public Kalkulator(T a1, T a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Number sum() {
        if(a1 instanceof Integer) {
            Integer b1 = (Integer)a1;
            Integer b2 = (Integer)a2;
            return b1 + b2;
        } else if(a1 instanceof BigInteger) {
            BigInteger b1 = (BigInteger)a1;
            BigInteger b2 = (BigInteger)a2;
            return b1.add(b2);
        }
        return -1;
    }

}
