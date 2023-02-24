package OOP.HomeWork.service;
import OOP.HomeWork.entity.Account;
public class DepositService {
    // Метод пополнения счета клиента
    static public void deposit (Account account, int amount) {
        account.getBill().setAmount(account.getBill().getAmount() + amount);
        // Вызов метода показа баланса в консоль
        BalanceService.showBalance(account);
    }
}
