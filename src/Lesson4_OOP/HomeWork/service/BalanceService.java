package Lesson4_OOP.HomeWork.service;
import Lesson4_OOP.HomeWork.entity.Account;
public class BalanceService {
    // Метод показа баланса в консоль
    public static void showBalance (Account account) {
        System.out.println("Остаток на счету: " + account.getBill().getAmount() + " тенге");
    }
}
