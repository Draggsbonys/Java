package Lambda.SupplierConsumer;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

/*
 * Supplier - это функциональный интерфейс, который определяет функцию без параметров,
 * Которая возвращает некоторое значение.
 * Supplier имеет один абстрактный метод get(), который возвращает результат типа T.
 *
 * Consumer - это функциональный интерфейс, который представляет функцию,
 * Которая принимает один аргумент и не возвращает результат.
 * Consumer имеет один абстрактный метод accept(T t), который принимает объект типа T и не возвращает значение.
 *
 * Это позволяет создавать новые объекты без явного указания их типа в методе, что делает код более универсальным и гибким.
 */

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    @Override
    public String toString(){
        return "Model: " + model + ", color: " + color + ", engine: " + engine;
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

}
