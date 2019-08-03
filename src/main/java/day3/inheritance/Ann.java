package day3.inheritance;

public class Ann {

    static {
        System.out.println("metoda static");
    }

    {
        System.out.println("metoda dynamic");
    }

    public Ann() {
        System.out.println("Konstruktor");
    }
}
