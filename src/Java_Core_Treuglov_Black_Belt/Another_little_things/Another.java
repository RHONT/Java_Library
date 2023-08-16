package Java_Core_Treuglov_Black_Belt.Another_little_things;

interface i1 {
    int a = 5;

    void abc();
}

interface i2 {
    int a = 10;

    void abc();
}

public class Another implements i1, i2 {
    public static void main(String[] args) {
        Another a1 = new Another();
        Car c1 = new Car("blue", "v5");
        Car c2 = new Car("blue", "v5");
        Car c3 = new Car("blue", "v8");
        Car c4 = new Car("green", "v8");
        Car c5 = new Car("green", "v4");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c4.equals(c5));
        System.out.println(c1.equals(c5));
        System.out.println(c1.equals(a1));


        ((i1)a1).abc();
        int a = 10;
        int b = 20;
        int c=0;
        System.out.println(a<b? "А меньше Б":"Б меньше А");
        c = (a>b? 100:200);
        System.out.println(c);

    }

    ;

    public void abc() {
        System.out.println("Проверка");
    }
}

class Car {
    String color, engine;

    Car(String clr, String engn) {
        this.color = clr;
        this.engine = engn;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Car) {
            if ((this.color.equals(((Car) o).color)) && (this.engine.equals(((Car) o).engine))) return true;
        }
        return false;
    }
}
