package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish;

public class Human {
    private int health = 100;
    private String name;
    //private Parasit parasit;

    Human() {
        this.name = "Безымянный";
    }

    Human(int h, String n) {
        this.name = n;
        this.health = h;

    }

    public void uphealth() {
        this.health += 10;
    }

    public void bad_health(Parasit a) {
        this.health = this.health - a.ukus();
    }

    public void bad_health_2(int a) {
        this.health -= a;
    }

    void showhealth() {
        System.out.println("Товарищ " + this.name + "Имеет здоровье:");
        System.out.println(this.health);
    }


}
