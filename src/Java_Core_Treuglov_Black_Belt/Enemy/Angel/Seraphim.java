package Java_Core_Treuglov_Black_Belt.Enemy.Angel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seraphim implements Serializable {
    static final long serialVersionUID=2;

    public static int getDefens() {
        return defens;
    }

    public static void setDefens(int defens) {
        Seraphim.defens = defens;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public static int defens;

    @Override
    public String toString() {
        return "Seraphim{" +
                "health=" + health +
                ", str=" + str +
                ", name='" + name + '\'' +
                '}';
    }

    static {
        defens = 400;
    }

    public int health = 150;
    public int str = 250;
    String name="Серфим";

    public Seraphim(int a, int b, String name) {
        health = a;
        str = b;
        this.name=name;
    }

    public Seraphim() {
    }

    public static void main(String[] args) {
        Seraphim s1 = new Seraphim();
        Seraphim s2 = new Seraphim(300,400,"Ylia");
        System.out.println(s1.health);
        System.out.println(s1.str);

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\KH\\test.bin"))) {
            oos.writeObject(s1);
            oos.writeObject(s2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("Меня зовут Серфим, у меня силы: " + str + " А жизни: " + health);
    }
}
