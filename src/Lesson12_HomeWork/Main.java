package Lesson12_HomeWork;
import java.util.ArrayList;
import java.util.Arrays;
import Lesson12_HomeWork.entity.Bill;
import Lesson12_HomeWork.entity.Client;
import Lesson12_HomeWork.entity.Hotel;
import Lesson12_HomeWork.entity.Room;
import Lesson12_HomeWork.service.ConsoleService;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> parisRoomList = new ArrayList<>(Arrays.asList(
                new Room(1,1000,false),
                new Room(1,1000,false),
                new Room(2,2000,true),
                new Room(2,2000,true),
                new Room(3,3000,true),
                new Room(3,3000,true),
                new Room(4,4000,true),
                new Room(4,4000,true)
        ));
        ArrayList<Room> tokyoRoomList = new ArrayList<>(Arrays.asList(
                new Room(1,1000,true),
                new Room(2,2000,true),
                new Room(3,3000,true),
                new Room(4,4000,true)
        ));
        ArrayList<Room> londonRoomList = new ArrayList<>(Arrays.asList(
                new Room(1,1000,true),
                new Room(2,2000,true)
        ));

       ArrayList<Hotel> hotelArrayList = new ArrayList<>(Arrays.asList(
                new Hotel("Paris", parisRoomList),
                new Hotel("Tokyo", tokyoRoomList),
                new Hotel("London", londonRoomList)
        ));

        Bill billSergey = new Bill(1000);
        Bill billLada = new Bill(2000);

        Client sergeyShmidt = new Client("Sergey","Shmidt","+9906456987","one@gmail.com", billSergey);
        Client ladaShmidt = new Client("Lada", "Shmidt", "+9906123456", "two@gmail.com", billLada);

        ArrayList<Client> clientList = new ArrayList<>(Arrays.asList(sergeyShmidt, ladaShmidt));

        ConsoleService consoleService = new ConsoleService();

        consoleService.consoleService(hotelArrayList,clientList);

    }
}
