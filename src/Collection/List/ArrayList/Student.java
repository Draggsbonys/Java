package Collection.List.ArrayList;
/*
   ArrayList (односвязный список) представляет собой класс, который реализует динамический массив.
   То есть массив, который может изменять свой размер во время выполнения программы.
   ArrayList может содержать в себе только reference типы данных
   В основе ArrayList лежит массив типа Object
   Использование <> при объявлении ArrayList является крайне желательным
   Он реализует интерфейс List и расширяет класс AbstractList.
   ArrayList хранит элементы в последовательности, а каждый элемент может быть доступен по его индексу.

   Когда использовать ArrayList
   get
   set (начало и середина)
   add
   remove ( кроме начала списка )

   Для ArrayList поиск элемента по индексу происходит за O(1), то есть за постоянное время,
   так как каждый элемент имеет индекс, и поиск по индексу происходит быстро.
   Однако, поиск элемента по значению в ArrayList может занимать до O(n) времени,
   так как в этом случае нужно пройти все элементы списка, чтобы найти нужный элемент.
 */
public class Student {
    String name;
    int age;
    int course;

    Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + course;
    }
}
