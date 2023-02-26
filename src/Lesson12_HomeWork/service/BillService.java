package Lesson12_HomeWork.service;
import Lesson12_HomeWork.entity.Client;

public class BillService {
    private int balance;

    public void paymentService(Client client, int sum) {
        balance = client.getBill().getAmount();
        if (balance >= sum) {
            client.getBill().setAmount(balance - sum);
            System.out.println("Номер успешно забронирован!");
            System.out.println("Остаток на счету: " + client.getBill().getAmount() + " тенге");
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
}
