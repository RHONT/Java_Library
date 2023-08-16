package Java_Core_Treuglov_Black_Belt.Priority_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

abstract class Human_evel {
    static int id = 0;
    String name_unit;
    int health;
    int defense;
    int weapon;
}

class Khight extends Human_evel implements Comparable{
    public Khight() {
        id+=1;
        this.name_unit="Knight";
        this.health=new Random().nextInt(100)+30;
        this.defense=new Random().nextInt(50)+5;
        this.weapon = new Random().nextInt(30)+5;
    }

    @Override
    public String toString() {
        return "\nKhight\n" +
                "health=" + health +
                ", defense=" + defense +
                ", weapon=" + weapon;
    }

    @Override
    public int compareTo(Object o) {
        return health-health;
    }
}

class Defense_comp implements Comparator<Khight> {
    @Override
    public int compare(Khight o1, Khight o2) {
        return o1.defense-o2.defense;
    }
}

public class Priority_queu {

    static class Weapon_comp implements Comparator<Khight> {
        @Override
        public int compare(Khight o1, Khight o2) {
            return o1.weapon-o2.weapon;
        }
    }

    public static void main(String[] args) {

        Comparator<Khight> def_comp=new Defense_comp();

        PriorityQueue<Khight> detachment_1 = new PriorityQueue<Khight>(new Weapon_comp());  //or + def_comp + or есть встроенный comparable
        detachment_1.add(new Khight());
        detachment_1.add(new Khight());
        detachment_1.add(new Khight());
        detachment_1.add(new Khight());
        detachment_1.add(new Khight());

        System.out.println(detachment_1);
        System.out.println();

        System.out.println (detachment_1.remove());

        System.out.println();

        System.out.println(detachment_1);

    }


}
