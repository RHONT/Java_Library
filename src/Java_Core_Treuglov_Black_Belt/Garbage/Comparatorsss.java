package Java_Core_Treuglov_Black_Belt.Garbage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

// сделать так чтобы работало
class Unit implements Comparable<Unit> {
    Integer id;
    String class_army;
    String TEMPLATE = "id=%d ||| army = %s";

    Unit(String str, int i) {
        id = i;
        class_army = str;
    }


    @Override
    public int compareTo(Unit o) {
//        int result=id-o.id;
//        if (id==o.id) {
//            result=class_army.compareTo(o.class_army);
//        }
//        return result;
        return (this.id - o.id) * (-1);


    }


    @Override
    public String toString() {
        return String.format(TEMPLATE, id, class_army);
    }
}

public class Comparatorsss {
    public static void main(String[] args) {
        TreeSet<Unit> ts = new TreeSet<Unit>();
        ts.add(new Unit("Undead", 15));
        ts.add(new Unit("Archer", 1));
        ts.add(new Unit("Tank", 10));
        ts.add(new Unit("Mag", 15));
        ts.add(new Unit("Magg", 15));


        for (Unit o : ts) {
            System.out.println(o.toString());
        }
        System.out.println("*********************");

        List<Unit> lu = new ArrayList<>();
        lu.add(new Unit("Undead", 15));
        lu.add(new Unit("Magg", 15));
        lu.add(new Unit("Archer", 1));
        lu.add(new Unit("Tank", 10));
        lu.add(new Unit("Mag", 15));
        Collections.sort(lu);


        for (Unit o : lu) {
            System.out.println(o.toString());
        }

    }
}
