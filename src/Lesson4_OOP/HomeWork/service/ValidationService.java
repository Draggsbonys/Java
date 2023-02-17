package Lesson4_OOP.HomeWork.service;
import Lesson4_OOP.HomeWork.entity.Account;

public class ValidationService {
    // Проверяем наличие введенных номеров телефона в коде
    static public void numberValidation (Account firstAccount, Account secondAccount, String inputNumber) {
        if (!firstAccount.getPerson().getPhoneNumber().equals(inputNumber) && !secondAccount.getPerson().getPhoneNumber().equals(inputNumber)) {
            System.out.println("Такой клиент не зарегистрирован");
            System.exit(0);
        }
    }
    // Проверяем чтобы вводимая сумма не была отрицательной
    static  public void amountValidation (int quantity) {
        if (quantity < 0) {
            System.out.println("Вы ввели отрицательную сумму");
            System.exit(0);
        }
    }
    // Проверяем чтобы на счету не осталась отрицательная сумма после транзакции
    static  public void fundsValidation (Account account, int quantity) {
        if (account.getBill().getAmount() < quantity) {
            System.out.println("Недостаточно средств");
            System.exit(0);
        }
    }

}
