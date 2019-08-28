package day8.enumTest;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        pobierzKolor(Kolor.BLUE);
    }

    private static void pobierzKolor(Kolor kolor) {
        System.out.printf("%d, %d, %d", kolor.getR(), kolor.getG(), kolor.getB());
    }
}
