package day6.internal;

import day3.Exercise;
import day4.enumTest.Znak;

public class Kalkulator {

    public static enum Znak{
        DODAWANIE, ODEJMOWANIE, MNOZENIE, DZIELENIE, RESZTA_Z_DZIELENIA, DZIELENIE_ULAMKI;
    }

    public static String method(int a, int b, Znak znak) {
        switch (znak) {
            case DODAWANIE:
                return suma(a, b) + "";
            case ODEJMOWANIE:
                return roznica(a, b) + "";
            case MNOZENIE:
                return mnozenie(a, b) + "";
            case DZIELENIE:
                return dzielenie(a, b) + "";
            case RESZTA_Z_DZIELENIA:
                return resztaZDzielenia(a, b) + "";
            case DZIELENIE_ULAMKI:
                return Exercise.divide(a, b);
        }
        return "Podales bledny znak";
    }

    private static int suma(int a, int b) {
        return a + b;
    }

    private static int roznica(int a, int b) {
        return a - b;
    }

    private static int mnozenie(int a, int b) {
        return a * b;
    }

    private static int dzielenie(int a, int b) {
        return a / b;
    }

    private static int resztaZDzielenia(int a, int b) {
        return a % b;
    }
}
