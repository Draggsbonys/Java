package Lesson14_Interface;

public class SportInterface {
    interface Sport{
        void run();
        void jump();

         /*
          * Статический метод не будет унаследован из интерфейса в класс.
          * Все статик методы по умолчанию имеют access modifier public.
          * Static methods не наследуются ни одним классом который их имплементирует.
          * Для вызова static method необходимо использовать имя интерфейса.
          */
        static void football () {
            System.out.println("footbal");
        }
    }
}
