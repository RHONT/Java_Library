package Java_Core_Treuglov_Black_Belt.Test_OOP_Home_work_2;

public class Pet extends Animal {
    public String name;
    public int tail = 1;
    public int paw = 4;

    public Pet() {
        System.out.println("Я питомец");
        this.eyes = 2;
    }

    public void run() {
        System.out.println("Питомец бежит!");
    }

    public void jump() {
        System.out.println("Питомец прыгает!");
    }
}
