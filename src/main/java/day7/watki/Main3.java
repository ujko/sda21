package day7.watki;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Start");
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Suma3(0,5));
        Thread.sleep(2000);
        System.out.println("cos tam robie 1");
        int a = 0;
        try {
            a = future.get();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("cos tam robie 2");
        System.out.println(a);
        service.shutdown();
        System.out.println("Koniec");
    }
}
