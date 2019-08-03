package day3;

public class Kalkulator {

    public static String method(int a, int b, String znak) {
        switch (znak) {
            case "+":
                return suma(a,b) + "";
            case "-":
                return roznica(a,b) + "";
            case "*":
                return mnozenie(a,b) + "";
            case "/":
                return dzielenie(a,b) + "";
            case "%":
                return resztaZDzielenia(a,b) + "";
            case "//":
                return Exercise.divide(a,b);
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
