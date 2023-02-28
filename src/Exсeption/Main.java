package Exсeption;
/*
 * java.io - это пакет, в котором собраны классы и интерфейсы, которые предназначены
 * Для чтения и записи информации из/в какой либо источник, например файл
 */
import java.io.*;
/*
 * В Java исключения (Exceptions) представляют собой способ обработки ошибок в программе.
 * Исключения возникают, когда в программе происходит неожиданное событие, например, ошибка при работе с файлом или делении на ноль.
 * Вместо того чтобы просто завершить работу программы, Java позволяет обработать эти ошибки и принять решение о том, что делать в такой ситуации.
 *
 * В Java исключения классифицируются на три типа:
 *
 * Проверяемые исключения (Checked Exceptions): это исключения, которые необходимо обработать явно в коде программы.
 * К ним относятся, например, IOException и SQLException.
 *
 * Непроверяемые исключения (Unchecked Exceptions): это исключения, которые не обязательно обрабатывать явно,
 * Но их все же можно обработать. К ним относятся, например, NullPointerException и ArrayIndexOutOfBoundsException.
 *
 * Ошибки (Errors): это исключения, которые обычно возникают в критических ситуациях,
 * Например, когда закончилась память. Обычно их не обрабатывают явно в коде программы.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // ArrayIndexOutOfBoundsException, так как пятого индекса в нашем массиве нет
        int[] array = {1,2,3};
        System.out.println(array[5]);

        // NullPointerException, так как у null не может быть длины
        String s = null;
        System.out.println(s.length());

        // Класс File - абстрактная репрезентация пути к файлу или папке
        File file = new File("test10.txt");

        // Класс FileInputStream предназначен для создания потока, с помощью которого можно читать информацию из источника
        FileInputStream fileInputStream = new FileInputStream(file);

        // Класс FileOutputStream предназначен для создания потока, с помощью которого можно записывать информацию в источник
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        /*
         * Конструкторы классов FileInputStream и FileOutputStream могут выбрасывать исключение FileNotFoundException
         * Если файл который был указан в конструкторе потока не будет найден
         *
         * Методы read и write классов FileInputStream и FileOutputStream могут выбрасывать исключение IOException
         * Если поток из/в который производилось чтение/запись был прерван
         */
    }
}
