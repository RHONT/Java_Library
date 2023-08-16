package Java_Core_Treuglov_Black_Belt.Test_OOP_Home_work_2;

public class Animal {
    public int eyes = 2;

    public Animal() {
        System.out.println("Я животное!");
    }

    void drink() {
        System.out.println("Животное пьет!");
    }

    void eat() {
        System.out.println("Животное ест!");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("Я кошка и меня зовут: " + this.name);
    }

    void sleep() {
        System.out.println("Котэ спит!");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Лайка");
        System.out.println(d1.paw);
        System.out.println();
        Cat с1 = new Cat("Мупаса");
        с1.eyes = 3;
        с1.sleep();

    }
}