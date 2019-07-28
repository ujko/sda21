package day2;

public class OverloadTest {

    public static void main(String[] args) {
        OverloadTest a = new OverloadTest();
        a.method();
        a.method("Pawel");
        a.method(23);
        a.ustawText("moj text", 43);
        String s = "aa";
    }

    public void method() {
        System.out.println("Pusta metoda");
    }

    public void method(String name) {
        System.out.println("Podales imie " + name);
    }

    public void method(int age) {
        System.out.println("Podales wiek " + age);
    }

    public void ustawText(String text) {
        ustawText(text, 25);
    }

    public void ustawText(String text, int margines) {
        System.out.println("Twoj tekst " + text + " margines " + margines);
    }
}
