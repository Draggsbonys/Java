package OOP.HomeWork.service;
import OOP.HomeWork.entity.Account;
public class TransferService {
    // Метод перевода денег от одного клиента к другому
    public void transfer (Account accountFrom, Account accountTo, int amount) {
        // Проверяем наличие запрашиваемой на перевод суммы у отправителя
        if (accountFrom.getBill().getAmount() >= amount) {
            // Вызов метода списание со счета отправителя
            PaymentService.payment(accountFrom, amount);
            // Вызов метода пополнения на счет получаетеля
            DepositService.deposit(accountTo, amount);
            System.out.println("Клиент " + accountFrom.getPerson().getName() + " " + accountFrom.getPerson().getSurname() + " " + "списание на сумму " + amount + " тенге");
            System.out.println("Остаток на счету клиента: " + accountFrom.getPerson().getName() + " " + accountFrom.getPerson().getSurname() + " " + accountFrom.getBill().getAmount() + " тенге");
            System.out.println();
            System.out.println("Клиент " + accountTo.getPerson().getName() + " " + accountTo.getPerson().getSurname() + " " + "пополнение на сумму " + amount + " тенге");
            System.out.println("Остаток на счету клиента: " + accountTo.getPerson().getName() + " " + accountTo.getPerson().getSurname() + " " + accountTo.getBill().getAmount() + " тенге");
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
