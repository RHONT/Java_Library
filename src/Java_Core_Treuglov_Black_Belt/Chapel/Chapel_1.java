package Java_Core_Treuglov_Black_Belt.Chapel;



import Java_Core_Treuglov_Black_Belt.Enemy.Angel.Seraphim;
import Java_Core_Treuglov_Black_Belt.Enemy.demon.Diablo;

import static Java_Core_Treuglov_Black_Belt.Chapel.Tree.kust_h;


public class Chapel_1 {
    static int corse = Seraphim.defens - Diablo.range;
    int widthLoc = 400;
    int heightLoc = 400;
    int ploshad = kust_h * kust_h;

    Chapel_1() {

    }

    public static void main(String[] args) {
        Chapel_1 ch1 = new Chapel_1();
        System.out.println(ch1.ploshad);
        Seraphim S1 = new Seraphim();
        Seraphim S2 = new Seraphim(500, 300,"Dasha");
        Diablo D1 = new Diablo(600, 450);
        Diablo D2 = new Diablo();
        S1.show();
        S2.show();
        System.out.println(S1.defens);
        D1.show();
        System.out.println("Уровень зарубы: " + corse);
        Tree t1 = new Tree();
        System.out.println(t1.rost());


    }

}
