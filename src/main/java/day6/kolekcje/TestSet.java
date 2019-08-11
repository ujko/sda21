package day6.kolekcje;

import java.util.*;

public class TestSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Pawel");
        set.add("Ania");
        set.add("Zosia");
        set.add("Pawel");
        set.add("Pawel");
        set.add("Pawel");
        System.out.println(set);
        List<String> list = new ArrayList<>(set);
        Set<String> set2 = new HashSet<>(list);
    }
}
