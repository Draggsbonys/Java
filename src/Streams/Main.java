package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
    Stream это объект, который представляет последовательность элементов и позволяет выполнять на ней различные операции.

    Stream в не хранит данные, а предоставляет набор методов для обработки данных в виде последовательности элементов.
    Он может использоваться для выполнения различных операций, таких как фильтрация, сортировка, маппинг, сведение и т.д.
    Stream может быть создан из разных источников, например, из массива, списка, файла, потока данных и т.д.
*/
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Bye");
        stringList.add("World");

/*
        Метод map() используется для преобразования элементов последовательности с помощью заданной функции и создания нового потока, содержащего результаты преобразования.

        Метод collect() используется для сбора результатов преобразования в новый список
*/
        List<Integer> integerList = stringList.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(integerList);

        int[] array = {5, 9, 1, 0, 8, 3};

        // Пример преобразования массива с помощью метода map()
        array = Arrays.stream(array).map(element -> {
           if (element % 3 == 0) {
               element = element / 3;
           }
           return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
    }
}
