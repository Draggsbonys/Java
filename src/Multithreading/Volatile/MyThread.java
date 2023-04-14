package Multithreading.Volatile;
/*
    Ключевое слово volatile используется для объявления переменной, значение которой может изменяться другими потоками.
    Это означает, что переменная может быть изменена в одном потоке,
    а затем использована в другом, и volatile гарантирует, что другой поток увидит самое последнее значение переменной.

    Без ключевого слова volatile переменная может кэшироваться в локальном потоке,
    и другие потоки могут получать устаревшее значение переменной.
    Однако, если переменная помечена как volatile, компилятор и среда выполнения гарантируют,
    что изменения в одном потоке будут видны другим потокам в самое ближайшее время.

    Для синхронизации значения переменной между потоками, ключевое слово volatile используется тогда,
    когда только один потом может изменять значение переменной, а остальные потоки могу его только читать.
*/
public class MyThread extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while(b) {
            counter++;
        }
        System.out.println("Our counter: " + counter);
    }
}
