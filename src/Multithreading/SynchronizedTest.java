package Multithreading;

public class SynchronizedTest {
    private volatile int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest test = new SynchronizedTest();
        test.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {

        //В потоках используется анонимный класс реализующий интерфейс Runnable
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

//        Thread thread1 = new Thread(new MyThreadExmpl());
//        Thread thread2 = new Thread(new MyThreadExmpl());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

//class MyThreadExmpl implements Runnable {
//    SynchronizedTest stest = new SynchronizedTest();
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            stest.increment();
//        }
//    }
//}
