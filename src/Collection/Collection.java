package Collection;

public class Collection {

    /*
     * В Java коллекция (Collection) представляет собой группу объектов, которые могут содержать различные типы данных,
     * Такие как строки, целые числа, объекты и т. д. Коллекции используются для хранения, манипулирования и обработки больших объемов данных.
     * В Java коллекции представлены интерфейсами, определенными в пакете java.util. Эти интерфейсы включают в себя:

                                   Иерархия коллекций
                                        Iterable
                                           |
                              _______  Collection
                             /             |    \
                    _____ List ____      Queue  Set  Map
                   /       |       \
          ArrayList      Vector    LinkedList
                           |
                         Stack


     - Iterable это интерфейс представляет собой механизм, позволяющий последовательно перебирать элементы коллекции.

     - Collection это корневой интерфейс в иерархии коллекций, который определяет основные операции,
       которые могут выполняться над коллекциями, такие как добавление, удаление и проверка наличия элементов.

     - List это интерфейс, который расширяет интерфейс Collection и определяет упорядоченный список элементов,
       который может содержать дубликаты.

     - ArrayList это (односвязный список) представляет собой класс, который реализует динамический массив.

     - Vector это класс в Java, представляющий динамический массив.
       Он является потокобезопасной реализацией интерфейса List и поддерживает все его методы.

     - LinkedList это (двухсязный список) в Java представляет собой структуру данных, которая состоит из узлов,
       связанных друг с другом в однонаправленную или двунаправленную последовательность.

     - Stack это коллекция элементов, которая работает по принципу "последний вошел, первый вышел" (LIFO).
       Это означает, что элементы, добавленные последними, будут удалены первыми.

     - Queue это коллекция элементов, которая работает по принципу "последний вошел, первый вышел" (FIFO).
       Это означает, что элементы, добавленные первыми, будут удалены первыми.

     - Set это интерфейс, который расширяет интерфейс Collection и определяет
       коллекцию уникальных элементов без упорядочения.

     - Map это интерфейс, который определяет отображение ключей и значений.

     */
}
