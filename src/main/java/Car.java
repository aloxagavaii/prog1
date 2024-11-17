public abstract class Car {
    int yearRelease;
    String gearBox;
    String color;
    int power;
    int maxSpeed;
    int tank;
    double expenditure100;

    Car(int y, String g, String c, double e) {
        gearBox = g;
        color = c;
        expenditure100 = e;
        yearRelease = y;
        power = 199;
        maxSpeed = 220;
        tank = 60;
    }

    void setPower(int p) {
        power = p;
    }

    void setTank(int t) {
        tank = t;
    }

    void info() {
        System.out.println(String.format("Год выпуска: %d", yearRelease));
    }

    void distance() {
        System.out.println("Машина проедет "+(int)(tank/expenditure100*100)+" километров");
    }

    void isOldCar() {
        if(yearRelease>2006) {
            info();
        } else {
            System.out.println("устаревший авто");
        }
    }

    void isGreen() {
        if(color.equals("green")) {
            color = "red";
            System.out.println("цвет изменен");
        }
    }

    void isEconom() {
        if(expenditure100>10) {
            setTank((100));
            System.out.println("Бак увеличен до 100");
        }
    }
}
