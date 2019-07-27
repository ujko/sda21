package day1;


import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        System.out.print("Ile artykulow dodajesz do koszyka?: ");
        Scanner scanner = new Scanner(System.in);
        int iloscArt = scanner.nextInt();

        String result = "";
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < iloscArt; i++) {
            System.out.print("Podaj artykul: ");
            String s = s1.nextLine();
            result += (i + 1) + " " + s + "\n";
        }
        System.out.println(result);
    }

/*        System.out.println("Podaj słowo: ");
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();

        switch(slowo) {
            case "gwiazdka":
                System.out.println("*");
                break;
            case "dolar":
                System.out.println("$");
                break;
            default:
                System.out.println("Nie znam tego słowa");
        }*/
}

