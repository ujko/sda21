package day3;

public class Reminder {

    public static void main(String[] args) {
//        method2();

    }

    private static void method2() {
        int a = 7;
        Integer b = 23;
        int c = b;

        String s = "23";
        String s1 = "32";
        System.out.println(Integer.parseInt(s) + Integer.parseInt(s1));

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("%d + %d = %d\n", a, b, a + b);

        System.out.println(check(23));
        System.out.println(check(22));
        System.out.println(sum(2,4));
        System.out.println(sum(2,4, 6));
        System.out.println(sum(2,4, 6,3,2,43,54));

        int[] dd = {2,3,4,5,6,7};
        System.out.println(sum(dd));
    }

    public static int check(int a) {
        return a % 2 == 0 ? 1 : 0;
    }

    public static int sum(int... a) {
        int result = 0;
        for(int i : a) {
            result +=i;
        }
        return result;
    }
}
