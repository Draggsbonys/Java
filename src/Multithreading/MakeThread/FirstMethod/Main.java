package Multithreading.MakeThread.FirstMethod;

import Multithreading.MakeThread.FirstMethod.MyThread1;
import Multithreading.MakeThread.FirstMethod.MyThread2;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}

