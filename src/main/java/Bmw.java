public class Bmw extends Car{
    String model;
    Bmw(int y, String m, String g, String c, double e) {
        super(y, g, c, e);
        model = m;
    }

    @Override
    void info() {
        System.out.println(String.format("Bmw %s! Год выпуска: %d, цвет: %s, мощность: %d, коробка: %s, максимальная скорость: %d", model, yearRelease, color, power, gearBox, maxSpeed));
    }
}