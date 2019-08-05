package day4;

public class Ref {

    public static void main(String[] args) {
        TestRef r = new TestRef();
        TestRef rr = r;
        r.a = 6;
        rr.a = 17;

//        int a = 15;
//        int b = a;
//        a = 21;
//
//        System.out.println(a);
//        System.out.println(b);

        System.out.println(r.a);
        System.out.println(rr.a);
    }
}
