package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {

        //Создаем thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) // пример с коробками
            executorService.submit(new Work(i)); // передаем задания

        executorService.shutdown(); // shutdown() чем-то похож на start()
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}