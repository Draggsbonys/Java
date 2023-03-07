package Lambda.Predicate;
import java.util.ArrayList;
import java.util.Arrays;

import static Lambda.Predicate.Employee.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(
                new Employee("Alex", "IT",500),
                new Employee("Masha", "NYPD",10000),
                new Employee("Max", "Max",700),
                new Employee("Egor", "FBI",7000)
        ));
        filterOfEmployee(employeeArrayList, employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 200);

        filterOfEmployee(employeeArrayList, employee -> {
            String firstChar = String.valueOf(employee.getName().charAt(0));
            return firstChar.equals("E") && employee.getSalary() != 450;
        });

        filterOfEmployee(employeeArrayList, employee -> employee.getName().equals(employee.getDepartment()));
    }
}
