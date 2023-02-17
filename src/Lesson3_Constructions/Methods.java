package Lesson3_Constructions;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first;
        int second;

        System.out.println("Введите первое число");
        first = input.nextInt();

        System.out.println("Введите второе число");
        second = input.nextInt();

        System.out.println("Сумма: " + sum(first, second));

    }
    // Создаем метод сложения двух чисел примитивного типа int
    public static int sum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
