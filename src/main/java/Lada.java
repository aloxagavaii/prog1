public class Lada extends Car{
    String model;
    Lada(int y, String m, String g, String c, double e) {
        super(y, g, c, e);
        model = m;
    }

    @Override
    void info() {
        System.out.println(String.format("Lada %s! Год выпуска: %d, цвет: %s, мощность: %d, коробка: %s, максимальная скорость: %d", model, yearRelease, color, power, gearBox, maxSpeed));
    }
}