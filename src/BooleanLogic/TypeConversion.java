package BooleanLogic;

public class TypeConversion {
    public static void main(String[] args) {
        /*
         * Для принудительного приведения одного типа данных к другому,
         * Перед присвоением в скобкам пишется тип переменной
         * В которую будут записываться значения.
         * При этом, если в приводимую переменную записать значение
         * Больше чем позволяет хранить её тип данных
         * Мы получим отрицательное число
         */
        int a = 150;
        // Преобразуем тип данных int в byte принудительно, так как byte не вмещает в себя int
        byte b = (byte) a;
        System.out.println(b);

        // Преобразуем тип данных byte в short не принудительно, так как short вмещает в себя byte
        short c = b;
        System.out.println(c);
    }


}