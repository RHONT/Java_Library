package Java_Core_Treuglov_Black_Belt.Test_OOP_Home_work_2;

public class Dog extends Pet {
    public Dog(String name) {
        this.name = name;
        System.out.println("Я собака и меня зовут: " + this.name);
    }

    void play() {
        System.out.println("Собака играет!");
    }
}
