package Lesson4_OOP;
/*
* Объектно ориентированное программирование - методология программирования,
* Основанная на представлении программы в виде совокупности объектов, каждый из
* Которых является экземпляром определенного класса, а классы образуют иерархию наследования
*/
public class Cat {
    private String name;
    private int weight;

    // Методы set нужны для получения значаний private полей класса
    // Методы get нужны для изменения значений private полей класса

    // Создаем метод getName(), при вызове которого мы получим значение поля name
    public String getName(){
        return name;
    }

    // Создаем метод setName(), при вызове которого мы изменим значение поля name
    public void setName(String name) {
        // Ключевое солов this это ссылка на переменную в поле нашего класса
        this.name = name;
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
