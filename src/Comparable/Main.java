package Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(Arrays.asList(
                new Employee(100, "Bob", "Marley",3000),
                new Employee(55, "Michael", "Jordan",10000),
                new Employee(2, "Maria", "Ivanova",1000)
        ));

        System.out.println("Before sorted: \n" + list);
        Collections.sort(list);
        System.out.println("After sorted: \n" + list);
    }
}
