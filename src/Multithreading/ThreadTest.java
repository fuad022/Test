package Multithreading;

public class ThreadTest {
    public static void main(String[] args) {
        MyThreads myThreads1 = new MyThreads();
        MyThreads myThreads2 = new MyThreads();
        myThreads1.start(); // start() определен в классе Thread.
        myThreads2.start();
///////////////////////////////////////////////////////////
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("h" + i);
    }
}

///////////////////////////////////////////////////////////
class MyThreads extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("h" + i);
    }
}
















