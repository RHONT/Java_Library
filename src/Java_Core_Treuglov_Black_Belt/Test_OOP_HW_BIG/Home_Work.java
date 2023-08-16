package Java_Core_Treuglov_Black_Belt.Test_OOP_HW_BIG;

import java.util.ArrayList;

interface Speakable {
    default void speak() {
        System.out.println("Кто-то из них говорит");
    }
}

public class Home_Work {
    static void add_to_mas(ArrayList<Object> al, Pingvin a) {
        al.add(a);
    }

    public static void main(String[] args) {
        int count_of_speak = 0;
        ArrayList<Object> arr1 = new ArrayList<>();
        Mechenosec m1 = new Mechenosec("Lada");
        Mechenosec m2 = new Mechenosec("Mada");
        arr1.add(m1);
        arr1.add(m2);
        add_to_mas(arr1, new Pingvin("Rjhh"));
        add_to_mas(arr1, new Pingvin("Kurt"));
        for (Object a : arr1) {
            if (a instanceof Animal) {
                System.out.println("***");
                System.out.println(((Animal) a).name);
                ((Animal) a).sleep();
                ((Animal) a).eat();
                System.out.println("***");
            }
        }
        System.out.println("***");
        System.out.println("***");
        ((Animal) (arr1.get(1))).eat();
        System.out.println("***");
        System.out.println("***");
//        System.out.println(m1.name);
//        m1.eat();
//        m1.sleep();
//        m1.swim();
//        System.out.println("**************");
//
//        Speakable p1 = new Pingvin("King");
//        p1.speak();
//        System.out.println("**************");

        Animal a1 = new Lev("Hao");
        Animal a2 = new Lev("Hao");
        Animal a3 = new Lev("Hao");
//        System.out.println(a1.name);
//        a1.sleep();
//        a1.eat();
//        Lev a_1=(Lev)a1;
//        a_1.speak();
//        a_1.run();
//
//
//        System.out.println("**************");
        Mammal mam = new Lev("Lao Zi");
        Pingvin p1 = new Pingvin("Kovalskiy");
//        System.out.println(mam.name);
//        mam.run();
//        mam.eat();
//        mam.sleep();
//        mam.speak();
//        System.out.println("**************");
        Pingvin b1 = new Pingvin("JJJ");
//        System.out.println(b1.name);
        Tiger t1 = new Tiger("Cat");

        Animal[] zveri = {m1, m2, a1, a2, a3, mam, p1, t1, b1};
        for (Animal a : zveri) {
            if (a instanceof Speakable) {
                ((Speakable) a).speak();
                count_of_speak++;
            }
        }
        System.out.println("Speake Animal: " + count_of_speak);
        System.out.println("**************");
        Animal[] zveri_2 = {m1, m2, a1, a2, a3, mam, p1, t1, b1};
        for (Animal a : zveri_2) {
            if (a instanceof Animal) {
                System.out.println(a.name);
                a.eat();
                a.sleep();

            }
        }
        System.out.println("**************");
        Speakable[] zveri_3 = {mam, p1, b1, t1};
        for (Speakable a : zveri_3) {

            System.out.println(((Animal) a).name);
            ((Animal) a).eat();
            ((Animal) a).sleep();
            a.speak();


        }

    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    //Animal(){
    //    name = "Животное";
    //}

    void eat() {
    }

    ;

    void sleep() {
    }

    ;
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }
    //Fish(){
    //    name = "Рыба";
    //}

    void sleep() {
        System.out.println("Всегда интересно, а как спят рыбы?");
    }

    void swim() {
    }

}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        //this.name=name;
    }

    void fly() {
    }

    @Override
    public void speak() {
        System.out.println(name + " Sing");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Рычание абстрактного льва");
    }

    void run() {
    }

    ;
}

class Mechenosec extends Fish {
    //Mechenosec(){
    //    name="Меченосец";
    //}
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Меченосец хищная рыба, жрет других рыб");
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба и быстро плавает");
    }

}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        //this.name=name;
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят друг к другу вплотную");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println("Пингвин не умеет петь");
    }

}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Лев любит пожрать мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев, не самая быстрая кошка");
    }

    @Override
    public void speak() {
        System.out.println("Рычание льва");
    }
}

class Tiger extends Mammal {
    Tiger(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Tiger любит пожрать мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня Tiger спит");
    }

    @Override
    void run() {
        System.out.println("Tiger,самая быстрая кошка");
    }

    @Override
    public void speak() {
        System.out.println("Рычание тигра!");
    }
}