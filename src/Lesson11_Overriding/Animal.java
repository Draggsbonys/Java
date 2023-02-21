package Lesson11_Overriding;
/*
 * Binding - определение вызываемого метода, основываясь
 * На объекте, который производит вызов
 * Или типа данных reference variable
 */
public class Animal {
        /*
         * Переопределение (overriding) методов в объектно-ориентированном программировании означает создание
         * Новой версии метода в подклассе (наследнике), которая заменяет реализацию метода в суперклассе (родительском классе).
         * При вызове метода у объекта, который является экземпляром подкласса, будет выполнена реализация метода из подкласса, а не из суперкласса.
         *
         * Compile time binding происходит во время компиляции программы и означает, что связь между именем и его реализацией
         * Определяется на основе типа переменной или выражения во время компиляции.
         * Таким образом, в момент компиляции компилятор определяет тип переменной и использует эту информацию
         * Для связывания метода или операции с этой переменной.
         *
         * Runtime binding происходит во время выполнения программы и означает, что связь между именем и его реализацией
         * Определяется на основе типа объекта, который вызывает метод или операцию.
         * Таким образом, в момент выполнения программы, в зависимости от конкретного объекта,
         * Который вызывает метод или операцию, будет выбрана соответствующая реализация.
         *
         * Статическое связывание используется в языке Java для разрешения перегруженных методов,
         * В то время как динамическое связывание используется в языке Java для разрешения переопределенных методов.
         *
         * Основные условия для overriding методов:
         * Метод должен быть определен в суперклассе и иметь модификатор доступа, который позволяет его переопределению в подклассе (public, protected или без модификатора).
         * Метод в подклассе должен иметь ту же сигнатуру (название, тип и количество аргументов) и тот же возвращаемый тип, что и метод в суперклассе.
         * Модификатор доступа переопределяющего метода не должен быть менее ограничивающим, чем модификатор доступа переопределяемого метода.
         *
         * В Java все переменные имеют компиляционную привязку (compile time binding),
         * Что означает, что тип переменной определяется во время компиляции программы, а не во время выполнения.
         */

        public final void amountPaw () {
            System.out.println("Four paws");
        }
        public static void amountTail () {
            System.out.println("One tail");
        }
        public void moving() {
            System.out.println("Animal moving");
        }
}
