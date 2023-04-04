package Lambda.ForEach;
import java.util.List;
/*
    Интерфейс forEach() это метод, который объявлен в интерфейсе Iterable<T> и реализуется во многих классах коллекций
    (например, List, Set, Map и других). Он позволяет применять заданную операцию к каждому элементу коллекции.
*/
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Red", "One");

        list.forEach(str -> System.out.println(str));
    }
}
