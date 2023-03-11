/*
 * Интерфейс Comparator в Java используется для сравнения объектов в коллекциях.
 * Он является функциональным интерфейсом, определенным в пакете java.util.
 * Comparator имеет единственный абстрактный метод compare(), который принимает два объекта и возвращает отрицательное число,
 * ноль или положительное число в зависимости от того, какой объект должен быть расположен первым в отсортированной коллекции.
 *
 * Интерфейс Comparator следует использовать, когда необходимы дополнительные, нестандартные сортировки помимо сортировки по умолчанию.
 */
package Comparator;
public class Animal {
    String name;
    String owner;
    int age;

    public Animal(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }
}
