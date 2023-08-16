package Java_Core_Treuglov_Black_Belt.Enemy.demon;



import Java_Core_Treuglov_Black_Belt.Enemy.Angel.Seraphim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Diablo {
    static final long serialVersionUID=1;

    public static int range = 800;
    int health = 150;
    int str = 250;

    public Diablo(int a, int b) {
        health = a;
        str = b;
    }

    public Diablo() {
    }

    public static void main(String[] args) {
        Diablo d1 = new Diablo();
        Seraphim s1;
        Seraphim s2;

        System.out.println(d1.health);
        System.out.println(d1.str);
        System.out.println(range);

        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\KH\\test.bin"))){

            s1=(Seraphim) ois.readObject();
            System.out.println(s1);
            s2=(Seraphim) ois.readObject();
            System.out.println(s2);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void show() {
        System.out.println("Меня зовут Диабло, у меня силы: " + str + " А жизни: " + health);
        System.out.println("Ярости во мне! на " + range);
    }
}
