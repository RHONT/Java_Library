package Java_Core_Treuglov_Black_Belt.Сarr;

public class Car {
    String color;
    String motor;
    int doors;

    Car() {
        color = "no name";
        motor = "no select";
        doors = 4;
    }

    Car(String color, String motor, int doors) {
        this.color = color;
        this.motor = motor;
        this.doors = doors;

    }
}

class CarTest {

    static void ChangeDoor(Car carCh, int a) {
        carCh.doors = a;
        System.out.println("Новые данные:");
        System.out.println(carCh.color);
        System.out.println(carCh.motor);
        System.out.println(carCh.doors);
    }

    static void testCar(Car carCh) {
        System.out.println("Текущее значение:");
        System.out.println(carCh.color);
        System.out.println(carCh.motor);
        System.out.println(carCh.doors);
    }

    static void changeColor(Car c1, Car c2) {
        String buffer;
        buffer = c1.color;
        c1.color = c2.color;
        c2.color = buffer;

    }

    static void sr1(Car m1, Car m2) {
        if ((m1.color == m2.color) && (m1.motor == m2.motor) && (m1.doors == m2.doors))
            System.out.println("machone ravni");
        else System.out.println("Machine Error!");
    }

    static void newSrav(Car m1, Car m2) {
        if (m1.color == m2.color) {
            if (m1.motor == m2.motor) {
                if (m1.doors == m2.doors) {
                    System.out.println("Машины одинаковы!");
                } else System.out.println("Двери разные, чуть-чуть не хватило!");

            } else System.out.println("Цвета похожи, а вот движки разные!");
        } else System.out.println("Даже цвета не совпадают. Дальнейшее сравнение отменяется!");
    }

    static String srDoor(Car m1, Car m2) {
        return (m1.doors > m2.doors) ? "У первой машины дверей больше или столько же" : "У первой машины дверей меньше или столько же";
    }


    public static void main(String[] args) {
        Car m1 = new Car("Black", "V6", 6);
        Car m2 = new Car("Red", "V6", 4);
        //newSrav(m1,m2);
        //sr1(m1,m2);
        System.out.println(srDoor(m1, m2));


       /* testCar(m1);
        testCar(m2);
        changeColor(m1,m2);
        testCar(m1);
        testCar(m2);

        //ChangeDoor(m1, 10);
        //testCar(m1);

        */

    }


}
