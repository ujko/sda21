package day7.watki;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
//        Thread t = new Suma(4,5);
//        t.start();
//        for(int i=0; i< 20;i++) {
//            Thread.sleep(100);
//            System.out.println("Pracuje.... ");
//        }

//        Suma t1 = new Suma("Watek pierwszy");
//        Suma t2 = new Suma("Watek drugi");
//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        t1.start();
////        t2.start();
////        Thread.sleep(2000);
////        t1.setDzialaj(false);
////        Thread.sleep(1000);
////        t2.setDzialaj(false);
//        Thread t1 = new Thread(new Suma2("watek 1"));
//        Thread t2 = new Thread(new Suma2("watek 2"));
//
//        t1.start();
//        t2.start();
//        Thread.sleep(4000);
//        t1.interrupt();
//        t2.interrupt();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().doSth("Watek 1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().doSth("Watek 2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r).start();
        new Thread(r1).start();
        System.out.println("Koniec");
    }


    private void doSth(String name) throws InterruptedException {
        while (true) {
            Thread.sleep(500);
            System.out.println("Watek " + name);
        }
    }

}
