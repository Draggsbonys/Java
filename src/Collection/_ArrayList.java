package Collection;
import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList (односвязный список) представляет собой класс, который реализует динамический массив.
 * То есть массив, который может изменять свой размер во время выполнения программы.
 * ArrayList может содержать в себе только reference типы данных
 * В основе ArrayList лежит массив типа Object
 * Использование <> при объявлении ArrayList является крайне желательным
 * Он реализует интерфейс List и расширяет класс AbstractList.
 * ArrayList хранит элементы в последовательности, а каждый элемент может быть доступен по его индексу.
 */
public class _ArrayList {
    public static void main(String[] args) {
        // Все спопобы объявления ArrayList
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>(200);
        List<String> list4 = new ArrayList<>();

        // Распространенные методы класса ArrayList

        // Метод add() - добавляет элемент в конец списка.
        list1.add("Hello");

        // Добавляет элемент в определенный индекс
        list1.add(1, "World");

        // Добавляет список в другой список
        list1.addAll(list2);

        // Добавляет список в другой список начиная с определенного индекса
        list1.addAll(0, list2);

        // Получает элемент из списка по индексу.
        list1.get(0);

        // Удаляет элемент из списка по индексу.
        list1.remove(0);

        // Заменяет элемент в списке по индексу на заданный элемент.
        list1.set(0, "Bye");

        // Возвращает количество элементов в списке.
        list1.size();

        // Получает индекс из списка по элементу
        list1.indexOf("Bye");

        // Проверяет список на наличие элементов
        list1.isEmpty();

        // Проверяет содержит ли список искомый элемент
        list1.contains("Hello");

        // Удаляет из списка все элементы другого списка
        list1.removeAll(list2);

        // Удаляет из списка все элементы кроме совпадений во втором списке
        list1.retainAll(list2);

        // Пропверяет содержит ли список все элементы второго списка
        list1.containsAll(list2);

        // Полностью очищает список
        list1.clear();

        // Создает представление списка на основе отрывка самого списка в интервале индексов
        List<String> listString = list1.subList(0, 0);

        // Создает массив типа Object на основании списка
        Object[] objectArray = list1.toArray();

        // Создает массив любого ссылочного типа на основании списка
        String[] stringArray = list1.toArray(new String[0]);

        // Создает неизменяемый список
        List<Integer> listInteger = List.of(1,2,3);

        // Создает неизменяемый список на основе другого списка
        List<String> stringList = List.copyOf(list1);
    }
}
