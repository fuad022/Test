package Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        // Используем Semaphore, если хотим ограничить доступ к ресурсу.
        // максимум 3 потокам разрешено одновременно использовали какой-то ресурс.
        Semaphore semaphore = new Semaphore(3);
        try {
            //когда в потоке начинаем использовать этот ресурс, на объекте semaphore вызываем метод acquire()
            // и тем самым мы взяли одно разрешение и начали взаимодействие с ресурсом(кол-во разрешений уменьшилось на 1-цу).
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("All permits have been acquired");

//            semaphore.acquire();
//            System.out.println("Can't reach here...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Как только мы закончили использовать ресурс, мы вызываем метод release() и даем понять семафору то,
        // что мы закончили взаимодействовать с ресурсом и один слот освободился
        // и другой поток может начать взаимодействовать с ресурсом.
        semaphore.release(); // этот метод отпускает одно из разрешений т.е. возвращает разрешение.
        // availablePermits() возвращает кол-во разрешений, которое у нас есть.
        System.out.println(semaphore.availablePermits());
    }
}
