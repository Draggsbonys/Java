package Lesson15_Casting;
/*
 * Существуют два типа приведения типов в Java:
 *
 * Неявное приведение типов (implicit casting):
 * Это автоматическое преобразование типов, которое выполняется компилятором.
 * Например, когда значение типа int присваивается переменной типа long,
 * Компилятор автоматически преобразует значение типа int в тип long.
 *
 * Явное приведение типов (explicit casting):
 * Это преобразование типов, которое выполняется вручную программистом.
 * Это делается с помощью оператора круглых скобок,
 * За которым следует имя типа, в который нужно преобразовать значение.
 */
public class Primitive {
    // Implicit casting:
    int i1 = 10;
    long l = i1;

    // Explicit casting:
    double d = 3.14159;
    int i2 = (int) d;

/*
 * При explicit casting возможна потеря части информации,
 * Eсли переменная не вмещает в себя присваевоемое значение.
*/
    // Так как short вмещает в себя только числа в диапазоне от -32.768 до 32.767, в него будет записано значение 3392
    int i3 = 200000;
    short s1 = (short) i3;
}