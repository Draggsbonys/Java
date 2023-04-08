package Multithreading.SecondMethod;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread2());

        thread1.start();
        thread2.start();
    }
}
