package Java_Core_Treuglov_Black_Belt.Test_Polymorphism;

interface Up_q {
    default String exp() {
        String s = "Знаток";
        return s;
    }

    void low_exp(String str);
}

public class Terraforming {
    public static void main(String[] args) {
        Employee forester_1 = new Employee();
        forester_1.name = "Gordon";

        Employee forester_2 = new Employee();
        forester_2.name = "Kurt";

        Geck grass_1 = new Grass();
        System.out.println("Seeding area is: " + grass_1.seeding_area(12, 23));
        grass_1.color_plant("Blue");
        System.out.println(grass_1.name);
        grass_1.rost(5);
        grass_1.name_operator = "Den";
        System.out.println(grass_1.name_operator);
        grass_1.appointment_of_an_emploee(forester_1);
        System.out.println(grass_1.name_operator);
        forester_1.level = forester_1.exp();
        System.out.println(forester_1.level);

        System.out.println("************************");

        Grass grass_2 = new Grass();
        System.out.println("Seeding area is: " + grass_2.seeding_area(20, 20));
        grass_2.color_plant("Blue");
        System.out.println(grass_2.name);
        grass_2.rost(5);
        grass_2.appointment_of_an_emploee(forester_2);
        System.out.println(grass_2.name_operator);
        forester_2.low_exp("beginner");
        System.out.println(forester_2.specialize);

        System.out.println(forester_2.level);


    }

}

abstract class Geck {
    String name_operator;
    String name;
    String color;

    void rost(int rost_object) {
        System.out.println("The plant is growing");
    }

    void appointment_of_an_emploee(Employee emp1) {
        if ((emp1.name == null) || (emp1.name.length() == 0)) {
            this.name_operator = "Set the operator";
        } else {
            this.name_operator = emp1.name;
        }
    }

    abstract void color_plant(String clr_plnt);

    abstract int seeding_area(int height, int width);

}

class Grass extends Geck {
    Grass() {
        this.name = "Grass";
        System.out.println("Grass is created");
    }

    @Override
    void color_plant(String clr_plnt) {
        this.color = clr_plnt;
        System.out.println(this.color);
    }

    @Override
    int seeding_area(int height, int width) {

        return (height + width);
    }

    @Override
    void rost(int rost_object) {
        super.rost(rost_object);
    }

}

class Employee implements Up_q {
    String name, specialize, level;

    @Override
    public void low_exp(String str) {
        this.specialize = str;
    }

    @Override
    public String exp() {
        return Up_q.super.exp();
    }


}



