package day3;

public class Exercise {

    public static void main(String[] args) {
//        System.out.println(intToBinaryString(23));
//        ttte();

        int a, b = 13, c;
        a = ++b * 2; //28
        System.out.println("a = 28 - " + a + "; b = 14 - " + b);
        c = a++ + b;//42
        System.out.println("a = 29 - " + a + "; b = 14 - " + b + "; c = 42 - " + c);
        b = ++a + a-- - c++ - --c;//-24
        System.out.println("a = 29 - " + a + "; b = -24 - " + b + "; c = 42 - " + c);
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
    }

    private static void ttte() {
        System.out.println(divide(5, 3));
        System.out.println(divide(6, 3));
        System.out.println(divide(0, 3));
        System.out.println(divide(3, 0).equals("Blad dzielenia przez zero"));
        System.out.println(divide(24, 10).equals("2 2/5"));
    }

    public static String divide(int a, int b) {
        if (b == 0) {
            return "Blad dzielenia przez zero";
        }
        int c = a / b;
        int d = a % b;
        int nwd = nwd(a, b);
        return d == 0 ? c + "" : String.format("%d %d/%d", c, d / nwd, b / nwd);
    }

    private static int nwd(int a, int b) {
        if (a == 0) {
            return 0;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static String intToBinaryString(int x) {
        String s = "";
        while (x > 0) {
            s = (x % 2) + s;
            x /= 2;
        }
        return s;
    }


    /*public static void main(String[] args) {
        Exercise t1 = new Exercise();
        t1.konwerter(23);
        System.out.println(Integer.toBinaryString(23));
    }
    String kodBinarny = "";
    void intToBinaryString(int x){
        for(int i = x; i > 0; i /=2){
            tworzenieKodu(i);
        }
    }
    void tworzenieKodu(int x){
            kodBinarny = czyPrzez2(x) + kodBinarny;
    }
    int czyPrzez2(int x){
        return x % 2;
    }
    void konwerter (int x){
        intToBinaryString(x);
        System.out.println("Dla liczby  " + x + " Kod binarny to: " + kodBinarny);
        kodBinarny = "";
    }*/
}
