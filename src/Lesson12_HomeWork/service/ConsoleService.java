package Lesson12_HomeWork.service;
import static Lesson12_HomeWork.service.TransactionService.*;
import Lesson12_HomeWork.entity.Client;
import Lesson12_HomeWork.entity.Hotel;
import Lesson12_HomeWork.entity.Room;
import java.util.ArrayList;
import java.util.Scanner;


public class ConsoleService {
    private Scanner input = new Scanner(System.in);
    private String hotelName;
    private String clientNumber;
    private int amountBed;
    private Client client;
    private Hotel hotel;
    private Room room;
    private boolean isDoneClient = false;
    private boolean isDoneHotel = false;
    private boolean isDoneRoom = false;
    private boolean hasFreeRoom;

    public void consoleService(ArrayList<Hotel> hotelList, ArrayList<Client> clientList){

        while(!isDoneClient) {
            System.out.println("Введите ваш номер телефона:");
            clientNumber = input.nextLine();
            for (Client client: clientList) {
                if (clientNumber.equals(client.getPhoneNumber())) {
                    this.client = client;
                    isDoneClient = true;
                }
            }
            if (isDoneClient == false) {
                System.out.println("Клиент с таким номером не найден!");
            }
        }

        while(!isDoneHotel) {
            System.out.println("Введите название отеля:");
            hotelName = input.nextLine();
            for (Hotel hotel: hotelList) {
                if (hotelName.equals(hotel.getName())) {
                    this.hotel = hotel;
                    isDoneHotel = true;
                }
            }
            if (isDoneHotel == false) {
                System.out.println("Такой отель не найден!");
            }
        }

        while(!isDoneRoom) {
            hasFreeRoom = true;
            System.out.println("Введите количество спальных мест:");
            amountBed = input.nextInt();
            hasFreeRoom = true;
            for (Room room: hotel.getRoomList()) {
                if (amountBed == room.getAmountBed()) {
                    if (room.getIsFree() == true) {
                        room.setIsFree(false);
                        this.room = room;
                        hasFreeRoom = room.getIsFree();
                        paymentService(client, room.getCostRoom());
                        break;
                    } else {
                        hasFreeRoom = false;
                    }
                } else if (amountBed < 1) {
                    System.out.println("Минимальное количество спальных мест 1");
                    break;
                } else if (amountBed > 4) {
                    System.out.println("Максимальное количество спальных мест 4");
                    break;
                }
            }
            if (hasFreeRoom == false) {
                System.out.println("Свободных номеров с таким количеством спальных мест нет");
            }
        }
    }
}
