package Java_Core_Treuglov_Black_Belt.Test_Interface_and_lyamda;

import java.util.function.Predicate;

interface Ability_xMore_life {
    void хMore_life_work(Enemy e1);
}

interface dead_or_alife {
    boolean check_life(Enemy e1);

}

public class HW_1_Intrrface_and_lyamda {

    static void check_life_enemy(Enemy e1, dead_or_alife da) {
        if (da.check_life(e1)) {
            System.out.println(e1.name + "is alive");
        }

    }

    static void increase_life_enemy(Enemy e1, Ability_xMore_life xx) {
        xx.хMore_life_work(e1);
        if (e1.healthpoint > 300) {
            System.out.println("It is very fat zombies!");
        }
        System.out.println("It is amazing!");
        System.out.println("***************");


    }

    static void Ability_plus(Enemy ee, Predicate<Enemy> t) {
        if (t.test(ee)) {
            System.out.println("Cool");
        }
        ;


    }


    public static void main(String[] args) {
        Enemy e1 = new Enemy();
        Enemy e2 = new Zombi();
        e1.enemy_info();
        e2.enemy_info();
        e2.x2_life();
        e2.enemy_info();
        Zaglushka zagl = new Zaglushka();
        check_life_enemy(e1, zagl);
        check_life_enemy(e2, zagl);
        increase_life_enemy(e1, (e11 -> {
            e11.healthpoint *= 10;
            System.out.println("Health " + e11.name + " increase! = " + e11.healthpoint);
        }));
        increase_life_enemy(e2, (e11 -> {
            e11.healthpoint *= 10;
            System.out.println("Health " + e11.name + " increase! = " + e11.healthpoint);
        }));
        Ability_plus(e1, dd -> dd.healthpoint > 0);


    }
}

class Enemy {
    int healthpoint = 0;
    String name;

    Enemy() {
        this.healthpoint = 10;
        this.name = "Gumanoid";
    }

    Enemy(int a, String b) {
        this.healthpoint = a;
        this.name = b;
    }

    void take_damage(int a) {
    }

    void enemy_info() {
        System.out.println("Name : " + this.name + " Healthpoint: " + this.healthpoint);
    }

    void x2_life() {
        this.healthpoint *= 2;
        System.out.println("Enemy healthpoint's increased = " + this.healthpoint);
    }


}

class Zombi extends Enemy {

    Zombi() {
        super();
        name = "Zombi";
        this.healthpoint *= 2;
    }

}

class Zaglushka implements dead_or_alife {
    @Override
    public boolean check_life(Enemy e1) {
        if (e1.healthpoint > 1)
            return true;
        else return false;
    }
}

