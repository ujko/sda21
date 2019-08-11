package day6.generic;

public class TypyGeneryczne {

    public static void main(String[] args) {
        Klasa<String> k = new Klasa<>();
        k.setO("Pawel");
        String s = (String)k.getO();
        s.length();
    }

    public static <T> T doSth(T t) {
        return null;
    }
}
