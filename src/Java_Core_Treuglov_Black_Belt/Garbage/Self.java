package Java_Core_Treuglov_Black_Belt.Garbage;

import java.util.Arrays;
import java.util.Random;

public class Self {
    public String name = "";
    public String rasa = "";
    public int[] dospeh = {randomforgame(), randomforgame(), randomforgame(), randomforgame()};
    public int[] rememberhealth = Arrays.copyOf(dospeh, dospeh.length);
    int shield = 0;
    int shieldremember = 0;

    Self(String name, String rasa) {
        this.name = name;
        this.rasa = rasa;
    }

    Self() {
        this.name = "Переселенец";
        this.rasa = "Без определения";
        int[] dospeh = {randomforgame(), randomforgame(), randomforgame(), randomforgame()};
    }


    static int randomforgame() {
        int a = 0;
        while (a < 5) {
            a = new Random().nextInt(10) + 1;
        }
        return a;
    }

    boolean proverkaSelf() {

        boolean b = true;

        for (int a : this.dospeh) {

            if (a >= 0) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }

    public void damagSelf(int a, int b) {
        if (this.shield > 0) {
            this.shield = this.shield - 1;
            this.shieldremember = this.shieldremember - 1;
            System.out.println("Щит сработал!");
        } else {

            this.dospeh[a] = this.dospeh[a] - b;
            //System.out.println("Враг нанес урон!" + casedospeh(a+1));
            System.out.println("Вы:");
            System.out.print("Шлем: " + rememberhealth[0] + "/" + this.dospeh[0] + " || Нагрудник: " + rememberhealth[1]
                    + "/" + this.dospeh[1] + " || Поножи: " + rememberhealth[2] + "/" + this.dospeh[2] + " || Сапоги: " + rememberhealth[3] + "/" + this.dospeh[3]);
            if (this.dospeh[a] == 0) {
                System.out.print("  --  Сударь, мы в беде! По нам остался лишь один удар!");
            }
        }
        System.out.println();
    }


    public String casedospeh(int a) {
        String dospeh;
        switch (a) {
            case 1:
                dospeh = "Шлем покоцали! Его прочность = " + rememberhealth[0] + "/" + this.dospeh[0];
                break;
            case 2:
                dospeh = "Нагрудник! Его прочность = " + rememberhealth[1] + "/" + this.dospeh[1];
                break;
            case 3:
                dospeh = "Поножи! Его прочность = " + rememberhealth[2] + "/" + this.dospeh[2];
                break;
            case 4:
                dospeh = "Сапоги! Его прочность = " + rememberhealth[3] + "/" + this.dospeh[3];
                break;
            default:
                dospeh = "Ошибка доспеха";
        }
        return dospeh;
    }

   /* public static void main(String[] args) {
        Self ya = new Self("Евгений","Русыч");
        Self yy = new Self();
        System.out.println(ya.toString());
    }*/

    @Override
    public String toString() {
        return "Вас зовут " + name + ",\nВаша расса: " + rasa + "\nВаша броня:\nШлем: " + dospeh[0] + "\nНагрудник:" + dospeh[1]
                + "\nПоножи:" + dospeh[2] + "\nСапоги:" + dospeh[3];
    }


}

