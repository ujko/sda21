package day2;

import java.util.Arrays;
import java.util.Random;

public class ArraySample {

    public static void main(String[] args) {
/*        String[] tab = new String[4];
        tab[0] = "Dom";
        tab[1] = "Ala";
        tab[2] = "Kasia";
        tab[3] = "Zosia";


        //tak nie mozna
        //tab[4] = "Agnieszka";
        //System.out.println(tab[2]);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        String[] tab1 = new String[tab.length + 1];
        for (int i = 0; i< tab.length; i++){
            tab1[i] = tab[i];
        }

        tab = tab1;
        tab[4] = "Agnieszka";
        for (String s : tab) {
            System.out.println(s);
        }*/

        /*int[] a = new int[6];
        Random random = new Random();
        for(int i =0; i<a.length;i++) {
            a[i]=random.nextInt(49) + 1;
        }


        a = Arrays.copyOf(a,7);
        a[6] = 300;
        for (int x : a){
            System.out.print(x + ", ");
        }*/

//        int[] b = {2, 3, 4, 5, 6};
        /*String[] b = {"Pawel", "Kasia", "Zosia"};
        for (String a : b) {
            System.out.println(a);
        }*/

        /*String a = "Ala ma kota";
        char[] b = a.toCharArray();
        for (char c : b) {
            System.out.print(c + ", ");
        }
        System.out.println("\n*************************");
        String s = "";
        for (int i = b.length - 1; i >= 0; i--) {
            s += b[i];
        }
        System.out.println(s);
        String ss = "Ala ma psa";
        for (int i = 0; i < ss.length(); i++) {
            System.out.print(ss.charAt(i) + ", ");
        }*/

   /*     String[][] tab = new String[2][4];
        tab[0][0] = "Kasia";
        tab[0][1] = "Damina";
        tab[0][2] = "Kasia";
        tab[0][3] = "Berna";
        tab[1][0] = "Ala";
        tab[1][1] = "Fabian";
        tab[1][2] = "Ola";
        tab[1][3] = "Anna";

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                System.out.printf("%8s, ", tab[i][j]);
            }
            System.out.println();
        }*/

        /*String[][] tab = {{"Ala", "ma", "kota"}, {"Mam", "dom"}, {"jakis", "dlugi", "text", "zeby", "bylo", "widac"}};
*/
        /*for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                System.out.printf("%8s, ", tab[i][j]);
            }
            System.out.println();
        }*/




/*        for (String[] a : tab) {
            for (String s : a) {
                System.out.print(s + ":");
            }
            System.out.println();
        }*/
    }
}
