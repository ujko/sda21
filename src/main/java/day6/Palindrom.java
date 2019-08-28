package day6;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(czyPalindrom2(args[0]));
    }

    private static boolean czyPalindrom (String slowo) {
//        String temp = slowo.replace(",", "")
//                .replace(" ", "")
//                .replace("?","").toLowerCase();

        String temp = slowo.replaceAll("[\\s,.?!]+", "").toLowerCase();
        String odwrocony = new StringBuilder(temp).reverse().toString();
        return temp.equals(odwrocony);
    }

    private static boolean czyPalindrom1(String slowo) {
        String isPalindrom="";
        String temp = slowo.replaceAll("[\\s,.?!]+", "").toLowerCase();
        for (int i = temp.length() - 1; i >= 0; i--){
            isPalindrom += temp.charAt(i);
        }
        return temp.equals(isPalindrom);
    }

    private static boolean czyPalindrom2 (String slowo){

        String temp = slowo.replaceAll("[\\s,.?!]+", "").toLowerCase();
        char[] tempchar = temp.toCharArray();
        for (int i = 0; i < temp.length()/2; i++){
            if (tempchar[i] != tempchar[tempchar.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
