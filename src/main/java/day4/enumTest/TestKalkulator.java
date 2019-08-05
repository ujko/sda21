package day4.enumTest;

public class TestKalkulator {

    public static void main(String[] args) {
//        kalkulator();

        EnumMock e = EnumMock.RED;
        EnumMock r = EnumMock.RED;
        e.setName("Kasia");
        System.out.println(e==r);
        System.out.println(r.getName());

    }

    private static void kalkulator() {
        String a = Kalkulator.method(4, 3, Znak.DZIELENIE);
        System.out.println(a);
        Znak pierwszy = Znak.DZIELENIE;
        Znak drugi = Znak.DZIELENIE;
        Znak de = Znak.DODAWANIE;
        pierwszy.setName("Pawel");
        System.out.println(pierwszy == drugi);
        System.out.println(pierwszy == de);
        System.out.println(drugi.getName());
        System.out.println(de.getName());
    }
}
