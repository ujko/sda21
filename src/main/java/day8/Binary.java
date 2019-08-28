package day8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Binary {

    public static void main(String[] args) {
        System.out.println(przelicz(5) == 1);//1
        System.out.println(przelicz(123) == 1);//1
        System.out.println(przelicz(32) == 0);//0
        System.out.println(przelicz(17) == 3);//3
        System.out.println(przelicz(299) == 2);//2
        System.out.println(przelicz(296) == 2);//2
    }

    private static int przelicz(int a) {
        String s = prepareBinaryString(a);
        return Arrays.stream(createStringTable(s))
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    private static String prepareBinaryString(int a) {
        String s = Integer.toBinaryString(a);
        return s.substring(0, s.lastIndexOf('1') + 1);
    }

    private static String[] createStringTable(String s) {
        return s.split("1");
    }

    private static int przelicz3(int a) {
        String s = Integer.toBinaryString(a);
        s = s.substring(0, s.lastIndexOf('1') + 1);
        String[] ss = s.split("1");
        int max = 0;
        for (String b : ss) {
            if (b.length() > max) {
                max = b.length();
            }
        }
        return max;
    }

    private static int przelicz2(int a) {
        String s = Integer.toBinaryString(a);
        String regex = "(0+)1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int max = 0;
        while (matcher.find()) {
            String l = matcher.group(1);
            if (l.length() > max) {
                max = l.length();
            }
        }
        return max;
    }

    private static int przelicz1(int a) {
        String s = Integer.toBinaryString(a);
        char[] tab = s.toCharArray();
        int x = 0;
        int max = 0;
        for (char c : tab) {
            if (c == '0') {
                x++;
            } else {
                if (x > max) {
                    max = x;
                }
                x = 0;
            }
        }
        return max;
    }
}
