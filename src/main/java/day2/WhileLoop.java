package day2;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<10) {
            System.out.print(" " + i);
            i++;
        }

        do {
            System.out.println("\nJestem w petli " + i);
        } while (i<10);
    }
}
