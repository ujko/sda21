package day8;

public class Watki {
    private static boolean dzialaj = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Poczatek");
        Thread t1 = new Thread(() -> watek("watek 1"));
        Thread t2 = new Thread(() -> watek("watek 2"));
        Thread t3 = new Thread(() -> watek("watek 3"));
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(6000);
//        dzialaj = false;
//        t1.join();
//        t2.join();
//        t3.join();

        System.out.println("Koniec");
    }

    private static void watek(String name)  {
        while (dzialaj) {
            System.out.println("Pracuje... " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
