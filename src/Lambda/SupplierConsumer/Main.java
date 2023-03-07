package Lambda.SupplierConsumer;
import java.util.ArrayList;
import static Lambda.SupplierConsumer.Car.*;

public class Main {
    public static void main(String[] args) {
        // Реализация функционального метода класса Supplier
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tilda", "Silver metallic", 1.6));
        System.out.println(ourCars);

        // Реализация функционального метода класса Consumer
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
        });
        System.out.println(ourCars);
    }
}
