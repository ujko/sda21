package day3.inheritance;

public class TestInheritance {

    static class A{
        public A() {
            System.out.println("Klasa A");
        }

        public void doSth() {
            System.out.println("metoda z klasy A");
        }
    }

    static class B extends A{
        public B() {
            System.out.println("Klasa B");
        }

        public void doSth() {
            System.out.println("metoda z klasy B");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.doSth();
    }

}
