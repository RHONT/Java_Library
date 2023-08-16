package Java_Core_Treuglov_Black_Belt.Test_OOP_Associalish;

public class test {
    public static void main(String[] args) {
        Human h1 = new Human(100, "Иванов");
        Parasit p1 = new Parasit(90);
        h1.showhealth();
        h1.bad_health(p1);
        h1.showhealth();
        p1.damag_2(h1);
        h1.showhealth();
    }
}
