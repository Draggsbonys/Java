package Collection;
import java.util.HashMap;
import java.util.Map;

/*
    Map в Java - это интерфейс, который представляет ассоциативный массив, то есть структуру данных,
    позволяющую хранить пары ключ-значение, где каждый ключ связан с определенным значением.

    HashMap в Java - это класс, который реализует интерфейс Map и используется для хранения пар ключ-значение
    в виде хеш-таблицы. В HashMap ключи хешируются для быстрого доступа к соответствующим значениям.
    Этот класс не гарантирует порядок элементов при итерации по ключам или значениям.
*/
public class _HashMap {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        // Метод put() добавляет элемент в коллекцию
        stringMap.put(1000, "Sergey");
        stringMap.put(1001, "Leonid");
        // Метод putIfAbsent() добавляет элемент в коллекцию, если такой элемент отсутствует в ней
        stringMap.putIfAbsent(1002, "Maria");
        // Метод get() позволяет получить элемент принимая в параметр ключ данного элемента
        stringMap.get(1000);
        // Метод remove() удаляет элемент из коллекции принимая в параметр ключ данного элемента
        stringMap.remove(1001);
        // Метод containsValue() возвращает true, если такой элемент присутствует в коллекции
        stringMap.containsValue("Maria");
        // Метод containsKey() возвращает true, если такой ключ присутствует в коллекции
        stringMap.containsKey(1002);
        // Метод keySet() возвращает множество всех ключей в коллекции
        stringMap.keySet();
        // Метод values() возвращает множество значений в коллекции
        stringMap.values();

    }
}
