package Multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {
        //        Future<Integer> future = executorService.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("Start");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Finish");
//                Random random = new Random();
//                int randomValue = random.nextInt();
//                if (randomValue < 5)
//                    throw new Exception("Bad heppened");
//
//                return random.nextInt(10);
//            }
//        });

//        Future<Integer> future = executorService.submit(new MyCall());

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(() -> { // Callable
            System.out.println("Start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish");
            Random random = new Random();
            int randomValue = random.nextInt();
            if (randomValue < 5)
                throw new Exception("Bad heppened");

            return random.nextInt(10);
        });

        executorService.shutdown();

        try {
            int result = future.get(); // get дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}


//class MyCall implements Callable<Integer> {
//
//    @Override
//    public Integer call() throws Exception {
//        System.out.println("Start");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Finish");
//        Random random = new Random();
//        int randomValue = random.nextInt();
//        if (randomValue < 5)
//            throw new Exception("Bad heppened");
//
//        return random.nextInt(10);
//    }
//}