package day1;

import java.util.Scanner;

public class Petle {

    public static void main(String[] args) {
        //Petla for
/*
        int iloscPowtorzen = 10;
        for (int i = 1; i <= iloscPowtorzen; i++) {
            System.out.print(i + ", ");
        }*/

        /*String outcome = "";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Podaj imie:");
                    break;
                case 1:
                    System.out.println("Podaj nazwisko:");
                    break;
                case 2:
                    System.out.println("Podaj wiek:");
                    break;
                case 3:
                    System.out.println("Podaj kolor oczu:");
                    break;
            }
            outcome = outcome + " " + scanner.nextLine();
        }
        System.out.println(outcome);*/
       /* for (int i = 0; i < 10; i+=3) {
            System.out.print(i + " ");
        }*/
        /*for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }*/

        for(int i=0; i < args.length; i++) {
            System.out.print(args[i]+ " ");
        }
    }
}
