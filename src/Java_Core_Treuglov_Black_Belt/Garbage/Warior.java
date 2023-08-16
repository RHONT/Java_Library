package Java_Core_Treuglov_Black_Belt.Garbage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import java.math.MathContext;


public class Warior {

    String name = "Переселенец";
    String rasa = "Без определения";
    int[] dospeh = {randomforgame(), randomforgame(), randomforgame(), randomforgame()};
    int[] rememberhealth = Arrays.copyOf(dospeh, dospeh.length);


    Warior(String name, String rasa, int[] a) {
        this.name = name;
        this.rasa = rasa;
        this.dospeh = a;
    }

    Warior(String name, String rasa) {
        this.name = name;
        this.rasa = rasa;
    }

    static int randomforgame() {
        int a = 0;
        while (a < 5) {
            a = new Random().nextInt(10) + 1;
        }
        return a;
    }

    static String otklick(int a) {
        String s;

        if (a > 0) {
            switch (a) {
                case 1:
                    s = ("Сквозь броню слышится скрежет зубов врага!");
                    break;
                case 2:
                    s = ("Враг злобно сопит!");
                    break;
                case 3:
                    s = "Враг по странному молчит";
                    break;
                case 4:
                    s = "Враг смеется над вами сударь!";
                    break;

                default:
                    s = "Вы не понимаете нанесли ли вы урон врагу";
            }
            return s;
        } else
            s = "";
        return s;
    }

    static String space(String s, int a) {
        String str = "";
        int buf;
        buf = a - s.length();
        for (int i = 0; i < buf; i++) {
            str = str + " ";
        }
        return str;

    }

    static void objavlenie(Warior a, Self b) {
        int maxlenght = 0;

        String[][] str = {{a.name, b.name},
                {a.rasa, b.rasa},
                {"Шлем:      " + Integer.toString(a.dospeh[0]), Integer.toString(b.dospeh[0])},
                {"Нагрудник: " + Integer.toString(a.dospeh[1]), Integer.toString(b.dospeh[1])},
                {"Поножи:    " + Integer.toString(a.dospeh[2]), Integer.toString(b.dospeh[2])},
                {"Сапоги:    " + Integer.toString(a.dospeh[3]), Integer.toString(b.dospeh[3])}};

        for (String[] z : str) {
            if (z[0].length() > maxlenght) {
                maxlenght = z[0].length();
            }
            ;
        }

        maxlenght += 4;

        for (int i = 0; i < str.length; i++) {
            str[i][0] = str[i][0] + space(str[i][0], maxlenght) + str[i][1];
            System.out.println(str[i][0]);
        }

    }

    public static void main(String[] args) {
        int intwar;
        byte fin = 0;
        Warior First = new Warior("Бушмамбек", "Орыч", new int[]{2, 2, 4, 10});
        Warior Second = new Warior("Владелен", "Огр");
        Warior workwarrior = Second;
        Self ya = new Self("Евгений", "Русыч");
        ya.shieldremember = 2;
        System.out.println(ya.toString());
        System.out.println();
        System.out.println(workwarrior.toString());
        Scanner scanwar = new Scanner(System.in);
        System.out.println();
        objavlenie(workwarrior, ya);
        //System.out.println("Куда лупим сударь?");
        //System.out.println("Голова: 1  Торс: 2  Ляхи: 3  Ступни: 4\n");
        //int intwar = scanwar.nextInt();
        //workwarrior.damag(intwar-1, 2);

        LABEL_1:
        while (workwarrior.proverka() == true) {
            //System.out.println();
            ya.damagSelf(new Random().nextInt(3), 2);

            if (ya.proverkaSelf() == false) {
                System.out.println("Сударь, мы повержены!");
                break;
            } else {
                System.out.println("Куда лупим сударь?");
                System.out.println("Голова: 1  Торс: 2  Ляхи: 3  Ступни: 4   Состояние щита: " + ya.shieldremember + "\n");
                String str = scanwar.nextLine();
                while (str.equals("Щит")) {
                    if (str.equals("Щит")) {
                        if (ya.shieldremember <= 1) {
                            System.out.println("Вы не можете использовать щит!");
                            str = scanwar.nextLine();
                        } else {
                            ya.shield = 2;
                            System.out.println("Вы выставили перед собой щит! Укажите куда ударите:");
                            str = scanwar.nextLine();
                            break;
                        }
                    }
                }
                //if (!str.equals("Щит")) {

                intwar = Integer.parseInt(str);

                workwarrior.damag(intwar - 1, 2);
                if (workwarrior.proverka() == false) {
                    System.out.println("Враг добит! Вы победили!");
                    break;
                } else continue LABEL_1;
                //}
            }
        }


        //System.out.println(workwarrior.proverka());
        //System.out.println(ya.proverkaSelf());


        scanwar.close();
    }

    void damag(int a, int b) {
        this.dospeh[a] -= b;
        //System.out.print("Вы попали! Прочность его доспеха " + rememberhealth[a] +"/" + this.dospeh[a]);
        System.out.println("Противник:");
        System.out.print("Шлем: " + rememberhealth[0] + "/" + this.dospeh[0] + " || Нагрудник: " + rememberhealth[1]
                + "/" + this.dospeh[1] + " || Поножи: " + rememberhealth[2] + "/" + this.dospeh[2] + " || Сапоги: " + rememberhealth[3] + "/" + this.dospeh[3]);
        System.out.println("  --  " + otklick(this.dospeh[a]));
        if (this.dospeh[a] == 0) {
            System.out.println("Доспех слетел! Нанесите решающий удар сударь!");
        }
        //System.out.println();
    }

    boolean proverka() {

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

    @Override
    public String toString() {
        return "Знатный воин по имени " + name + ",\nРассы: " + rasa + "\nБронирование его:\nШлем: " + dospeh[0] + "\nНагрудник:" + dospeh[1]
                + "\nПоножи:" + dospeh[2] + "\nСапоги:" + dospeh[3];
    }

}
