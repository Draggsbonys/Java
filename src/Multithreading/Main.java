package Multithreading;
/*
    Многопоточность - это принцип построения программы, при котором несколько блоков кода могут выполнляться одновременно.
    Основные цели многопоточности являются повышение производительности и выполнение нескольких задач.

    В компьютерах с многоядерными процесосрами, многопоточность может достигаться путем распределения задач (потоков) между ядрами,
    таким образом мы получаем и производительность и выполнение нескольких задач.

    В компьютерах с одноядерными процессорами, многопоточность достигаетс с помощью технологии context switch, одно ядро процессора
    переключается между несколькими задачами и создается видимость одновременной работы. Здесь мы получаем выполнение нескольких задач,
    однако не получаем производительности, так как процессору необходимо затрачивать время на переключение между задачами.

    Спопобы создания потоков:

    Использование класса Thread: это самый базовый способ создания потока.
    Для этого необходимо создать объект класса Thread и переопределить метод run(). Затем запустите поток с помощью метода start().

    Реализация интерфейса Runnable: это альтернативный способ создания потоков.
    В этом случае вам не нужно наследовать класс Thread, а нужно реализовать интерфейс Runnable и передать его в конструктор Thread.

    Использование лямбда-выражения: с помощью лямбда-выражений можно создать потоки в одну строку.
*/
public class Main {
/*
    Три состояния потока (Thread):

    New (до запуска) ---> Runnable (во время запуска) ---> Terminated (завершен)
                           /                     \
                Ready (готовый к запуску)      Running (запущен)
*/
}




