package Collection.Map;

import java.util.Objects;

public class Student {
    String name;
    String surname;
    int course;

    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    // Для корректного сравнения объектов внутри HashMap необходимо переопределять оба метода equals() и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
