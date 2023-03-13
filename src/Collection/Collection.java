package Collection;

public class Collection {

    /*
                                   Иерархия коллекций
                                        Iterable
                                           |
                              _______  Collection
                             /             |    \
                    _____ List ____       Queue  Set  Map
                   /       |       \
          ArrayList      Vector    LinkedList
                           |
                         Stack


     - Collection это корневой интерфейс в иерархии коллекций, который определяет основные операции,
       которые могут выполняться над коллекциями, такие как добавление, удаление и проверка наличия элементов.

     - List это интерфейс, который расширяет интерфейс Collection и определяет упорядоченный список элементов,
       который может содержать дубликаты.

     - Set это интерфейс, который расширяет интерфейс Collection и определяет
       коллекцию уникальных элементов без упорядочения.

     - Queue это интерфейс, который расширяет интерфейс Collection и определяет коллекцию элементов,
       которые могут быть добавлены в конец и извлечены из начала.

     - Map это интерфейс, который определяет отображение ключей и значений.

     */
}
