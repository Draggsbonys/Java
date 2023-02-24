package OOP.HomeWork;
import OOP.HomeWork.entity.Account;
import OOP.HomeWork.entity.Bill;
import OOP.HomeWork.entity.Person;
import OOP.HomeWork.service.ConsoleService;

public class Main {
    public static void main(String[] args) {
        ConsoleService adjustment = new ConsoleService();

        Person sergeyShmidt = new Person("Sergey", "Sergey", "+77071721720");
        Bill KZ0001 = new Bill(1000);
        Account accountSergey = new Account(sergeyShmidt, KZ0001);

        Person ladaShmidt = new Person("Lada", "Shmidt", "+77056041422");
        Bill KZ0002 = new Bill(500);
        Account accountLada = new Account(ladaShmidt, KZ0002);

        adjustment.adjustment(accountSergey,accountLada);
    }
}
