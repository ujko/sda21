package day3.inheritance.zadanie;

public class JavaDeveloper extends Programista {

    public JavaDeveloper()
    {
        super();
        System.out.println("konstruktor klasy java developer");
    }

    protected void smt(String t, int i) {
        System.out.println("metoda z javadeveloper "+i);
        smt(t);
    }
}
