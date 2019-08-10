package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
//        regex1();
        regex2("Marian Kowalski 777-777-777  20-212 Gdansk");
    }


    private static void regex2(String adres) {
        String regex = "([A-Z][a-z]+)\\s+([A-Z][a-z]+)" +
                "\\s+([0-9]{3}-\\d{3}-\\d{3})\\s+" +
                "(\\d{2}-\\d{3})\\s+" +
                "([A-Z][a-z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(adres);
        Person person = null;
        if(matcher.find()) {
            person = new Person(
                    matcher.group(1),
                    matcher.group(2),
                    matcher.group(3),
                    matcher.group(4),
                    matcher.group(5));
        }
        System.out.println(person);

        String kodPocztowy = "[\\d]{2}-\\d{3}";
        Pattern kodPocztowyPattern = Pattern.compile(kodPocztowy);
        Matcher matcher1 = kodPocztowyPattern.matcher(adres);
        while(matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }

    private static void regex1() {
        String s = "Ala   ma  kota a    kot " +
                "\n" +
                "" +
                " ma Ale";

        String[] result = s.split("\\s+");

        for(int i = 0; i< result.length;i++) {
            System.out.println(i + ": " + result[i]);
        }
    }
}
