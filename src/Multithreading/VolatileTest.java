package Multithreading;

import java.util.Scanner;

public class VolatileTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        int i = 0;
        while (running) {
            i++;
            System.out.println("Hello" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}