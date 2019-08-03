package day3.inheritance;

import day1.Zadanie;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.color = "black";
        a.name = "rysiek";
        System.out.println(a);
        Zebra z = new Zebra();
        z.cage("gold");
        z.whatEat("grass");
        Tiger t = new Tiger();
        System.out.println(z);
        System.out.println(t);

        Animal[] zebras = new Animal[2];
        zebras[0] = z;
        zebras[1] = t;
    }
}
