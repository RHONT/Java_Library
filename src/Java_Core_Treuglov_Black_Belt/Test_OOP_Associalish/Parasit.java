package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish;

public class Parasit {
    private int damaghealth = 10;

    Parasit() {

    }

    Parasit(int a) {
        this.damaghealth = a;
    }

    public int ukus() {
        return this.damaghealth;
    }

    public void damag_2(Human a) {
        a.bad_health_2(this.damaghealth);
    }
}
