package day7.watki;

public class Suma2 implements Runnable {
    private String name;

    public Suma2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(500);
                System.out.println(name);
            }
        } catch (InterruptedException e) {
            System.out.println("Koniec watku " + name);
        }
    }
}
