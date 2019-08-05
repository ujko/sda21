package day4;

import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        String s = "  Ala ma kota a kot ma ale   ";
        String[] table = s.split(" ");
        Arrays.sort(table);
        System.out.println(Arrays.toString(table));
        if(s.contains("kot")) {
            System.out.println("Zawiera");
        }
        String dd = "abc";
//        System.out.println(dd.isEmpty());
        String ddd = dd.repeat(5);
        System.out.println(ddd);
        String changed = s.replace("Ala", "kasia");
        System.out.println(changed);
        System.out.println(s.substring(2,6));
        System.out.println(s.trim());

    }
}
