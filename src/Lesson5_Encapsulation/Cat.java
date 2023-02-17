package Lesson5_Encapsulation;
/*
* Конструктор это метод класса, который инициализирует новый объект после его создания
* В конструктор передают значение переменных, которые обязательно должны быть инициализированы

 * Инкапсуляция это один из принципов объектно ориентированного программирования (ООП)
 * Инкапсуляция это сокрытие данных
 */
public class Cat {
    private String name;
    private int age;
    private String owner;

    // Конструктор с аргументами выглядит следующим образом
    public Cat(String name){
        this.name = name;
    }

    // При помощи комбинаций клавиш alt+insert можно автоматически создать getter и setter методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
