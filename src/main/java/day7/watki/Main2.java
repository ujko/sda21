package day7.watki;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Cwiczenie("Text 1", 2));
        Thread t2 = new Thread(new Cwiczenie("Text 2", 8));
        Thread t3 = new Thread(new Cwiczenie("Text 3", 1));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Koniec");
    }
}
