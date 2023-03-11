package Generic;
import java.util.ArrayList;
import java.util.Arrays;
import static Generic.ParameterizedMethod.*;

public class Main {
    public static void main(String[] args) {
        // Реализация Parameterized Class с Type place holder
        ParameterizedClass<String> infoString = new ParameterizedClass<>("Hello");
        System.out.println(infoString);

        // Реализация Parameterized Class с Type place holder
        ParameterizedClass<Integer> infoInteger = new ParameterizedClass<>(500);
        System.out.println(infoInteger);

        // Реализация Parameterized Method с Type place holder
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(
                new String("Hello"),
                new String("World")
        ));
        System.out.println(getSecondElement(stringArrayList));

        // Реализация Parameterized Method с Type place holder
        ArrayList<StringBuilder> stringBuilderArrayList = new ArrayList<>(Arrays.asList(
                new StringBuilder("Hello"),
                new StringBuilder("World")
        ));
        System.out.println(getSecondElement(stringBuilderArrayList));

        // Пример реализации subtypes generic
        Subtyping<Integer> integerInfo = new Subtyping<>(5);
        System.out.println(integerInfo.getElement(2));
    }
}
