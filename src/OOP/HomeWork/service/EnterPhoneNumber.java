package OOP.HomeWork.service;

import java.util.Scanner;

public class EnterPhoneNumber {
    Scanner input = new Scanner(System.in);
    // Метод запроса на введение номера телефона клиента в консоль
    public void enterPhoneNumber (String phoneNumber) {
        System.out.println("Введите номер телефона");
        phoneNumber = input.next();
    }}
