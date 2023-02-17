package Lesson11_Overriding;

public class Main {
    // Лучшим примером для runtime binding являются overloaded methods
    // Overloaded methods всегда используют compile time binding
    public void run (Animal animal) {
        System.out.println("Animal runs");
    }
    public void run (Snake snake) {
        System.out.println("Snake does not run");
    }

    public static void main(String[] args) {
        Main main = new Main();

        Animal animal = new Snake();

        // Compile time binding - так как метод является final он не может быть перезаписан - привязывается super class
        animal.amountPaw();

        // Compile time binding - так как метод является static и он не может быть перезаписан- привязывается super class
        animal.amountTail();

        // Run time binding - так как метод не является final, static, private и он перезаписан - привязывается subclass
        // Overriding methods всегда используют run time binding
        animal.moving();

        main.run(animal);

        // Так как мы создали объект Snake с типом данных Animal и вызываем не final, static, private метод
        // Компилятору непонятно какой из двух объектов (Animal или Snake) привязать к данному методу
        // И уже на стадии run time (запуска кода), java определяет что данный объект является Snake
    }
}