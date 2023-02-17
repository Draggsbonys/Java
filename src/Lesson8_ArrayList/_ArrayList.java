package Lesson8_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* ArrayList в Java представляет собой класс, который реализует динамический массив.
* То есть массив, который может изменять свой размер во время выполнения программы.
* ArrayList может содержать в себе только reference типы данных
* В основе ArrayList лежит массив типа Object
* Использование <> при объявлении ArrayList является крайне желательным
* Он реализует интерфейс List и расширяет класс AbstractList.
* ArrayList хранит элементы в последовательности, а каждый элемент может быть доступен по его индексу.
*/
public class _ArrayList {
    public static void main(String[] args) {
        // Примеры объявления и инициализации ArrayList

        // Объявление и инициализация пустого списка:
        ArrayList<String> list1 = new ArrayList<>();

        // Объявление и инициализация списка с начальной емкостью:
        ArrayList<Integer> list2 = new ArrayList<>(10);

        // Объявление и инициализация списка с элементами
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Hello", "World"));

        // Использование оператора add() для добавления элементов в список:
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);

        // Использование метода Collections.addAll() для добавления элементов в список:
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "Hello", "World");

        // Далее рассмотрим некоторые методы класса ArrayList

        // Метод add() - добавляет элемент в конец списка.
        list1.add("Hello");
        list1.add("World");
        System.out.println("add(Hello): " + list1);

        // Метод remove() - удаляет элемент из списка по индексу.
        list1.remove(0);
        System.out.println("remove(0): " + list1);

        // Метод get() - получает элемент из списка по индексу.
        System.out.println("get(0): " + list1.get(0));

        // Метод set() - заменяет элемент в списке по индексу на заданный элемент.
        list1.set(0, "Bye");
        System.out.println("set(Bye): " + list1);

        // Метод size() - возвращает количество элементов в списке.
        System.out.println("size(): " + list1.size());
    }
}
