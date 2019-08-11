package day6.kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        System.out.println(podajDzienTygodnia(3));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Poniedzialek");
        map.put(2, "Wtorek");
        map.put(3, "Sroda");
        map.put(4, "Czwartek");
        map.put(5, "Piatek");
        map.put(6, "Sobota");
        map.put(7, "Niedziela");

        System.out.println(map.get(6));

        Set<Integer> keySet = map.keySet();
        for(Integer i : keySet) {
            System.out.println("key = " + i + ", value = " + map.get(i));
        }

        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ", " + m.getValue());
        }
    }

    private static String podajDzienTygodnia(int dzien) {
        switch (dzien) {
            case 1:
                return "poniedzialek";
            case 2:
                return "wtorek";
            case 3:
                return "sroda";
            case 4:
                return "czwartek";
            case 5:
                return "piatek";
            case 6:
                return "sobota";
            case 7:
                return "niedziela";
        }
        return "bledny dzien";
    }
}
