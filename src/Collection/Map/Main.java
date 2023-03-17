package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Oleg", "Shevcov", 3);
        Student st2 = new Student("Sergey", "Ivanov", 1);
        Student st3 = new Student("Maria", "Petrova", 4);
        Student st4 = new Student("Maria", "Petrova", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map.containsKey(st4));

        // Вывод элементов HashMap в консоль с помощью метода entrySet
        for(Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
