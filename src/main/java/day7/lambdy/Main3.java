package day7.lambdy;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(o(12,4,(x,y) -> x - y));
    }

    private static int o(int a, int b, Oblicz ob) {
        return ob.oblicz(a,b);
    }
}
