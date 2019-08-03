package day3.inheritance.zadanie;

public class ZTest {
    public static void main(String[] args) {
        Zwierzeta[] z = new Zwierzeta[2];
        z[0] = new Pies();
        z[1] = new Kot();
        for(Zwierzeta zz : z) {
            zz.dzwiek();
        }
    }
}
