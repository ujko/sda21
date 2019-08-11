package day6.internal;

public class Main {
    public static void main(String[] args) {
        InternalTest.StaticInternal ob = new InternalTest.StaticInternal();
        InternalTest.mainStaticPublic = "";

        InternalTest it = new InternalTest();
        InternalTest.DynamicInternal itdi = it.new DynamicInternal();
        it.mainDynamicPublic = "";
    }
}
