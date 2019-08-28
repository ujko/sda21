package day7.watki;

public class Suma extends Thread {
    private boolean dzialaj = true;
    private String name;
    private int a;
    private int b;
    public Suma(String name) {
        this.name = name;
    }

    public void setDzialaj(boolean dzialaj) {
        this.dzialaj = dzialaj;
    }

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private void doSth() throws InterruptedException {
        while (dzialaj) {
            Thread.sleep(300);
            System.out.println("Watek - " + name);
        }
        System.out.println("Zakonczono watek " + name);
    }

    private void sum() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Suma " + a + b);
    }

    @Override
    public void run() {
        try {
//            sum();
            doSth();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
