package day4.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest {

    public static void main(String[] args)  {
      /*  try {
            method1("txt");
        } catch (CheckedException e) {
            System.out.println("nie jest dobrze");
        }*/

        sum();
    }

    private static void method1(String txt) throws CheckedException {
        method2(txt);
    }

    private static void method2(String txt) throws CheckedException {
        if(txt.equals("txt")) {
            throw new CheckedException("");
        } else {
            System.out.println("Jest ok");
        }
    }

    private static void sum() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        try {
            a = s.nextInt();
            System.out.println(a);
        } catch (InputMismatchException e) {
            System.out.println("Nie podales liczby");
        }
    }
}
