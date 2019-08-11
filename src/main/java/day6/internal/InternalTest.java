package day6.internal;

public class InternalTest {
    public static String mainStaticPublic;
    private static String mainStaticPrivate;
    public String mainDynamicPublic;
    private String mainDynamicPrivate;

    public static class StaticInternal {
        public static String staticInternalStaticPublic;
        private static String staticInternalStaticPrivate;
        public String staticInternalDynamicPublic;
        private String staticInternalDynamicPrivate;

        public void method() {
            InternalTest it = new InternalTest();
            it.mainDynamicPrivate = "jakis string";
        }
    }

    public class DynamicInternal {
//        public static String dynamicInternalStaticPublic;
//        private static String dynamicInternalStaticPrivate;
        public String dynamicInternalDynamicPublic;
        private String dynamicInternalDynamicPrivate;

        public void method() {

        }
    }

    public void method() {
        DynamicInternal di = new DynamicInternal();
        StaticInternal si = new StaticInternal();
    }

}
