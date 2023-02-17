package Lesson11_Overriding;
/*
 * Binding - определение вызываемого метода, основываясь
 * На объекте, который производит вызов
 * Или типа данных reference variable
 */
public class Animal {
        /*
         * Compile time binding - привязка метода к классу на стадии компиляции кода
         * К compile time binding относятся final, static и private методы
         *
         * Run time binding - привязка метода к объекту на стадии запуска кода
         * К run time binding относятся все методы, кроме final, static и private методов
         *
         * Их также  называют статическим и динамическим связыванием
         * Статическое связывание происходит во время компиляции, а динамическое – во время выполнения.
         * Статическое связывание используется в языке Java для разрешения перегруженных методов,
         * В то время как динамическое связывание используется в языке Java для разрешения переопределенных методов.
         *
         * Все переменные имеют compile time binding
         */

        public final void amountPaw () {
            System.out.println("Four paws");
        }
        public static void amountTail () {
            System.out.println("One tail");
        }
        private void amountEyes () {
            System.out.println("Four paws");
        }
        public void moving() {
            System.out.println("Animal moving");
        }

}
