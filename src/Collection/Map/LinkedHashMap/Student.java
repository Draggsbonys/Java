package Collection.Map.LinkedHashMap;
/*
    LinkedHashMap - это класс, который представляет собой хэш-таблицу с поддержкой порядка вставки элементов.
    Он расширяет класс HashMap и реализует интерфейс Map. Как и в HashMap, элементы в LinkedHashMap хранятся в виде пар "ключ-значение",
    и доступ к ним осуществляется по ключу. Однако, в отличие от HashMap, порядок элементов
    в LinkedHashMap определяется порядком их вставки в карту, что позволяет сохранять порядок итерации элементов.
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
