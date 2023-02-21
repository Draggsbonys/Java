package Lesson14_Interface;
import Lesson14_Interface.LunchInterface.*;
import Lesson14_Interface.SportInterface.*;
public class Teacher extends Employee implements Lunch, Sport {
    @Override
    public void eat(){
        System.out.println("Teacher eat for " + cost + " dollars");
    }
    @Override
    public void drink() {
        System.out.println("Teacher drink for " + cost + " dollars");
    }
    @Override
    public void run() {
        System.out.println("Teacher run");
    }
    public void jump(){
        System.out.println("Teacher jump");
    }
}
