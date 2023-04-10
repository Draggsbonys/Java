package Multithreading.ThreadMethods.Name;
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("First Thread");
        System.out.println("Name of Thread: " + myThread.getName());
    }
}
