package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import static Lambda.Student.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(
                new Student("Alex", 5,17),
                new Student("Oleg", 10,15),
                new Student("Masha", 4,25),
                new Student("Bob", 8,30)
        ));

          // Выводим в консоль всех студентов чья оценка больше 6
          studentCheck(studentArrayList, (student) -> {
              // Реализация метода функционального интерфейса
              return student.getGrade() > 6;
          });

          // Выводим в консоль всех студентов чей возраст больше 18
          studentCheck(studentArrayList, (student) -> {
              // Реализация метода функционального интерфейса
              return student.getAge() > 18;
          });


    }
}
