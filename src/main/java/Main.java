import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Lada(2015, "vesta", "автомат", "green", 7));
        list.add(new Lada(2005, "granta", "ручная", "red", 17));
        list.add(new Bmw(2000, "3", "автомат", "red", 6));
        list.add(new Bmw(2010, "3", "ручная", "green", 11));
        list.add(new Ford(2001, "fiesta", "автомат", "green", 7));
        list.add(new Ford(2021, "mustang", "автомат", "red", 27));
        list.add(new Kia(2012, "cerato", "автомат", "grey", 7.5));
        list.add(new Kia(2011, "rio", "ручная", "green", 7));
        list.add(new Mazda(2010, "3", "автомат", "green", 7));
        list.add(new Mazda(1999, "6", "автомат", "red", 13));
        list.add(new Mazda(2006, "5", "автомат", "red", 10));

        for(Car i: list) {
            i.isGreen();
            i.isEconom();
            i.isOldCar();
        }

        Kia a = new Kia(2000, "Rio", "автомат", "синий", 6);
        list.get(0).distance();
    }
}
