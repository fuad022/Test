package Multithreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
        CountDownLatch(замок с обратным отсчетом) предоставляет возможность любому
        кол-ву потоков в блоке кода ожидать до тех пор, пока не завершится определенное кол-во
        операций, выполняющихся в др. потоках, перед тем как они будут "отпущены", чтобы продолжить
        свою деятельность.
        В данном примере 3 потока будут ждать(метод await()), пока CountDownLatch не станет 0.
        Отсчитывание происходитв цикле for с методом countDown().
         */
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i, countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }
    }
}

class Processor implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceed.");
    }
}
