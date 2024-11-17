public class Ford extends Car{
    String model;
    Ford(int y, String m, String g, String c, double e) {
        super(y, g, c, e);
        model = m;
    }

    @Override
    void info() {
        System.out.println(String.format("Ford %s! Год выпуска: %d, цвет: %s, мощность: %d, коробка: %s, максимальная скорость: %d", model, yearRelease, color, power, gearBox, maxSpeed));
    }
}