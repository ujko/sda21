package day2;

public class Methods {

    public static void main(String[] args) {
        /*methodStatic();
        Methods methods = new Methods();
        methods.methodDynamic();
        new Methods().methodDynamic();*/
//        method1("Kasia", 23);
        Methods methods = new Methods();
        int s = methods.suma(10, 23);
        System.out.println(s);
        System.out.println(methods.suma(10, 23));

    }

    public static void methodStatic() {
        System.out.println("To jest metoda 1");
    }

    public void methodDynamic() {
        System.out.println("To jest metoda 2");
    }

    public static void method1(String name, int age) {
        System.out.println("Witaj " + name + " w wieku " + age);
    }

    public int suma(int a, int b) {
        return a + b;
    }
}
