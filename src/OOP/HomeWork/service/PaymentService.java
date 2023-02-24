package OOP.HomeWork.service;
import OOP.HomeWork.entity.Bill;
import OOP.HomeWork.entity.Account;

public class PaymentService {
    // Метод списания со счета денег у клиента
    public static void payment (Account account, int amount) {
        Bill bill = account.getBill();
        // Вызов метода проверки на отрицательную сумму
        ValidationService.fundsValidation(account, amount);
        // Проверяем наличие запрашиваемой на списание суммы у клиента
        if (bill.getAmount() - amount >= 0) {
            bill.setAmount(bill.getAmount() - amount);
        } else {
            System.out.println("Недостаточно средств");
            System.exit(0);
        }
        // Вызов метода показа баланса в консоль
        BalanceService.showBalance(account);
    }
}
