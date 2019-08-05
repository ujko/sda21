package day4.exceptions;

import java.util.IllegalFormatCodePointException;

public class TestKalkulator {

    public static void main(String[] args) {
        try {
                int a = Kalkulator.method(1, 2, "tt");
                System.out.println(a);
            } catch (IllegalFormatCodePointException e){
                System.out.println("kode exception");
            } catch (IllegalArgumentException e) {
                System.err.println("argument exception");
        } finally {
            System.out.println("Blok finally");
        }
    }
}
