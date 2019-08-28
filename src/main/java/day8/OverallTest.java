package day8;

import java.util.ArrayList;
import java.util.List;

public class OverallTest {

    public static void main(String[] args) {
        lista();
    }

    private static void lista() {
        List<String> list = new ArrayList<>();
        list.add("element");
        list.add("el");
        list.add("e");
        list.add("eleme");
        list.add("ele");
        list.add("elemen");
        list.add("et");
        list.stream()
                .map((x)-> x.substring(0,x.length() - 1))
                .filter((x) -> x.length() >= 2)
                .forEach(System.out::println);
//        list.forEach(System.out::println);
    }
}
