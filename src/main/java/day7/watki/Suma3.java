package day7.watki;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Suma3 implements Callable<Integer> {
    private int a;
    private int b;

    public Suma3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("poczatek watku");
        if(a==0) {
            throw new IllegalArgumentException("nie podales a");
        }
        for(int i =0; i<10;i++) {
            System.out.println("cos robie " + i);
            TimeUnit.SECONDS.sleep(1);
        }
//        TimeUnit.SECONDS.sleep(3);
        return a + b;
    }
}
