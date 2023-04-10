package Multithreading.MakeThread.SecondMethod;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread2());

        // Для запуска потока всегда необходимо использовать метод start(), метод run() не запустит поток и будет находится в потоке main
        thread1.start();
        thread2.start();
    }
}
