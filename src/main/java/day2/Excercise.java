package day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Excercise {

    public static void main(String[] args) {
        /*String[] tab = new String[0];

        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (true) {
            System.out.print("Co chcesz kupic?: ");
            s = scanner.nextLine();
            if ("koniec".equalsIgnoreCase(s)) {
                break;
            }
            tab = Arrays.copyOf(tab, tab.length + 1);
            tab[tab.length - 1] = s;
        }
        for (String x : tab) {
            System.out.println(x);
        }*/
        int maxRandomVal = 50;
        int[] x = new int[10];
        Random random = new Random();

        for(int i = 0; i < x.length; i++){
            x[i] = random.nextInt(maxRandomVal);
        }

        int max = 0;
        int min = maxRandomVal;
        int sum = 0;

        for (int value : x) {
            if (max < value){
                max = value;
            }
            if(min > value){
                min = value;
            }
            sum += value;
        }

        for (int y : x
             ) {
            System.out.print(y + " ");

        }
        System.out.println("\nTo jest max: " + max);
        System.out.println("To jest min: " + min);
        System.out.println("To jest srednia: " + ((double)sum/x.length));

    }
}
