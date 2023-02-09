package Lesson1_Primitives;

public class DataTypes {
    // Метод main является точкой запуска нашей программы и необходим для её запуска
    public static void main(String[] args) {
        // Метод System.out.println позволяет выводить в консоль информацию разных типов
        System.out.println("Hello World");

        // Примитивные типы данных:
        byte b1;    // Размер 8 бит = 1 байт
        long l;     // Размер 64 бит = 8 байт
        int i;      // Размер 32 бит = 4 байт
        short s;    // Размер 16 бит = 2 байт
        double d;   // Размер 64 бит = 8 байт
        float f;    // Размер 32 бит = 4 байт
        char c;     // Размер 16 бит = 2 байта
        boolean b2; // Размер 8 бит = 1 байт


        int firstNumber = 10;
        int secondNumber = 5;
        int sum;
        int substraction;
        int multiplication;
        int devision;
        int reminder;

        // Оператор сложения
        sum = firstNumber + secondNumber;
        // Оператор вычитания
        substraction = firstNumber - secondNumber;
        // Оператор умножения
        multiplication = firstNumber * secondNumber;
        // Оператор деления
        devision = firstNumber / secondNumber;
        // Оператор взятия остатка от деления
        reminder = firstNumber % secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + substraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + devision);
        System.out.println("Остаток от деления: " + reminder);
    }
}
