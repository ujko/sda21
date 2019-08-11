package day6.PT;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zliczanie {

    private static String podajMax(int minIloscLiter) throws IOException {
        Map<String, Integer> mapaSlow = zlicz(minIloscLiter, getLines());
        return podajMax(mapaSlow);
    }

    private static String podajMax(Map<String, Integer> mapaSlow) {
        int i = 0;
        String s = "";
        for (Map.Entry<String, Integer> m : mapaSlow.entrySet()) {
            if (m.getValue() > i) {
                i = m.getValue();
                s = m.getKey();
            }
        }
        return s + " wystepuje najczesciej w PT " + i;
    }

    private static Map<String, Integer> zlicz(int minIloscLiter, List<String> wiersze) {
        Map<String, Integer> mapaSlow = new HashMap<>();
        for (String wiersz : wiersze) {
            String[] slowa = wiersz.split("[\\s,!?:.\\-]+");
            for (String slowo : slowa) {
                if (slowo.length() >= minIloscLiter) {
                    if (mapaSlow.containsKey(slowo)) {
                        mapaSlow.put(slowo, mapaSlow.get(slowo) + 1);
                    } else {
                        mapaSlow.put(slowo, 1);
                    }
                }
            }
        }
        return mapaSlow;
    }

    private static List<String> getLines() throws IOException {
        return Files.readAllLines(Paths.get("pan-tadeusz.txt"));
    }

    public static void main(String[] args) throws IOException {
        System.out.println(podajMax(7));
    }
}