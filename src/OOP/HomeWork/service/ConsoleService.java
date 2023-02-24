package OOP.HomeWork.service;
import OOP.HomeWork.entity.Account;
import java.util.Scanner;

public class ConsoleService {
    private TransferService transferService = new TransferService();
    private DepositService depositService = new DepositService();
    private PaymentService paymentService = new PaymentService();
    private BalanceService balanceService = new BalanceService();
    private Scanner input = new Scanner(System.in);
    private ValidationService validationService = new ValidationService();
    private EnterPhoneNumber enterPhoneNumber = new EnterPhoneNumber();
    private int operation;
    private String firstNumber;
    private String secondNumber;
    private int quantity;
    public void adjustment (Account firstAccount, Account secondAccount) {
        String firstAccountNumber = firstAccount.getPerson().getPhoneNumber();
        String secondAccountNumber = secondAccount.getPerson().getPhoneNumber();

        System.out.println("Выберите операцию: 1-Показать баланс счета 2-Пополнение счета, 3-Снятие со счета, 4-Перевод на другой счет");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                // Получаем и проверяем на наличие в системе номер телефона клиента
                enterPhoneNumber.enterPhoneNumber(firstNumber);
                validationService.numberValidation(firstAccount,secondAccount,firstNumber);

                // Выводим в консоль баланс клиента
                if (firstNumber.equals(firstAccountNumber)) {
                    balanceService.showBalance(firstAccount);
                } else {
                    balanceService.showBalance(secondAccount);
                }
                break;

            case 2:
                // Получаем и проверяем на наличие в системе номер телефона клиента
                enterPhoneNumber.enterPhoneNumber(firstNumber);
                validationService.numberValidation(firstAccount,secondAccount,firstNumber);

                // Получаем и проверяем на отрицательное значение сумму пополнения
                System.out.println("Введите сумму пополнения");
                quantity = input.nextInt();
                validationService.amountValidation(quantity);

                // Пополняем счет клиента
                if (firstNumber.equals(firstAccountNumber)) {
                    depositService.deposit(firstAccount, quantity);
                } else {
                    depositService.deposit(secondAccount, quantity);
                }
                break;

            case 3:
                // Получаем и проверяем на наличие в системе номер телефона клиента
                System.out.println("Введите номер счета");
                firstNumber = input.next();
                validationService.numberValidation(firstAccount,secondAccount,firstNumber);

                // Получаем и проверяем на отрицательное значение сумму снятия
                System.out.println("Введите сумму снятия");
                quantity = input.nextInt();
                validationService.amountValidation(quantity);

                // Проверяем на отрицательную сумму на счету после списания и совершаем списание
                if (firstNumber.equals(firstAccountNumber)) {
                    paymentService.payment(firstAccount, quantity);
                } else if (firstNumber.equals(secondAccountNumber)) {
                    paymentService.payment(secondAccount, quantity);
                }
                break;

            case 4:
                // Получаем и проверяем на наличие в системе номер телефона отправителя
                System.out.println("Введите номер телефона отправителя");
                firstNumber = input.next();
                validationService.numberValidation(firstAccount, secondAccount, firstNumber);

                // Получаем и проверяем на наличие в системе номер телефона получателя
                System.out.println("Введите номер счета получателя");
                secondNumber = input.next();
                validationService.numberValidation(firstAccount, secondAccount, secondNumber);

                // Получаем и проверяем на отрицательное значение сумму перевода
                System.out.println("Введите сумму перевода");
                quantity = input.nextInt();
                validationService.amountValidation(quantity);
                // Осуществляем перевод
                if (firstNumber.equals(firstAccountNumber)) {
                    transferService.transfer(firstAccount, secondAccount, quantity);
                } else {
                    transferService.transfer(secondAccount, firstAccount, quantity);
                }
                break;
            default:
                System.out.println("Вы ввели несуществующую команду");
        }
    }
}
