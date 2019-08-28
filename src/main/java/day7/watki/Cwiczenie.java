package day7.watki;

public class Cwiczenie implements Runnable {
    private String name;
    private int delayTime;

    public Cwiczenie(String name, int delayTime) {
        this.name = name;
        this.delayTime = delayTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delayTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}
