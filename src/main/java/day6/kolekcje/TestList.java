package day6.kolekcje;

import java.util.*;

public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pawel");
        list.add("Kasia");
        list.add("Tomek");
        if(list.contains("Tomek")) {
            System.out.println("Jest tomek");
        }

//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for(String s : list) {
//            System.out.println(s);
//        }
        System.out.println(list);
        list.remove("Kasia");
        list.remove(0);
        System.out.println(list);
        List<String> list2 = Arrays.asList("Kaia", "Pawel");
        List<String> list3 = List.of("J", "Zo", "Alek");
        List<String> list4 = new ArrayList<>(list2);
        list4.add("jakis element");
        list.addAll(list2);
        list.addAll(list3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Collections.sort(list, c);
        System.out.println(list);
    }

}
