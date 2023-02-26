package Lesson12_HomeWork.service;
import Lesson12_HomeWork.entity.Client;
import Lesson12_HomeWork.entity.Hotel;
import Lesson12_HomeWork.entity.Room;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleService {
    private Scanner input = new Scanner(System.in);

    BillService billService = new BillService();
    private String hotelName;
    private Room hotelRoom;
    private int amountBed;
    private Hotel currentHotel = null;
    private boolean isDoneRoom = false;
    private String clientNumber;
    private boolean isDoneClient = false;
    private Client currentClient;
    private int currentRoomCost;

    public void consoleService(ArrayList<Hotel> hotelArrayList, ArrayList<Client> clientList){
        System.out.println("Введите ваш номер телефона:");
        clientNumber = input.nextLine();
        while(!isDoneClient) {
            OUTER_CLIENT:
            for (Client client: clientList) {
                if (clientNumber.equals(client.getPhoneNumber())) {
                    currentClient = client;
                    isDoneClient = true;
                } else {
                    System.out.println("Клиент с таким номером не найден!");
                }
                break  OUTER_CLIENT;
            }
        }

        System.out.println("Введите название отеля:");
        hotelName = input.nextLine();
        OUTER_HOTEL:
        for(Hotel hotel: hotelArrayList) {
            if (hotel.getName().equals(hotelName)) {
                currentHotel = hotel;
            } else {
                System.out.println("Отель не найден!");
            }

            while(!isDoneRoom) {
                System.out.println("Введите количество спальных мест");
                amountBed = input.nextInt();

                for(Room room: currentHotel.getRoomList()) {
                    if (room.getAmountPeople() == amountBed) {
                        hotelRoom = room;
                        currentRoomCost = room.getCostRoom();
                                room.setIsFree(false);
                        billService.paymentService(currentClient, currentRoomCost);
                        isDoneRoom = true;
                        break OUTER_HOTEL;
                    } else if (amountBed > 4) {
                        System.out.println("Максимальное количество мест - 4");
                        break;
                    } else if (amountBed <= 0) {
                        System.out.println("Минимальное количество мест - 1");
                        break;
                    }
                }
            }
        }

    }
}
