package day7.lambdy;

import day7.watki.Cwiczenie;

public class Main {

    public static void main(String[] args) {
//        Oblicz oblicz = new Oblicz() {
//            @Override
//            public int oblicz(int a, int b) {
//                return a + b;
//            }
//        };

//        Oblicz oblicz = (x, y) -> x - y;
//
//        System.out.println(oblicz.oblicz(3,4));

        Thread t = new Thread(() -> new Main().doSth());
        t.start();
        System.out.println("Koniec glownego watku");
    }

    private void doSth() {
        while (true) {
            System.out.println("Pracuje...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
