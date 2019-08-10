package day5;

import javax.swing.*;
import java.math.BigInteger;

public class KalkulatorTest {
    public static void main(String[] args) {
//        JOptionPane.showConfirmDialog(null, "Cos tam");
        Kalkulator<BigInteger> k =
                new Kalkulator<>(new BigInteger("23"),new BigInteger("34"));
        System.out.println(k.sum());
    }
}
