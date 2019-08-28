package day8;

public class Rekursja {

    public static void main(String[] args) {
//        System.out.println(sum(2, 3));
        System.out.println(silnia1(100));
//        System.out.println(fibbon(100));
    }

    private static int fibbon(int a) {
        if (a <= 1) {
            return a;
        }
        return fibbon(a - 1) + fibbon(a - 2);
    }

    private static int silnia(int a) {
        if (a == 1) {
            return 1;
        }
        return silnia(a - 1) * a;
    }

    private static long silnia1(int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    private static int sum(int a, int b) {
        if (a == 0) {
            return b;
        }
        return sum(--a, ++b);
    }
}
