package Java_Core_Treuglov_Black_Belt.Lyamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predict {
    @Override
    public String toString() {
        return "Predict{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    int a;
    int b;

    public Predict(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static void serch(ArrayList<Predict> f, Predicate<Predict> a ){
        for (Predict c:f) {
            if (a.test(c)) {System.out.println(c);}
        }
    }

    public static void main(String[] args) {
        Predicate<Predict> ab=((f)->f.a>=5);
        Predicate<Predict> ac=((f)->f.b>=6);

        ArrayList<Predict> list =new ArrayList<>();
        Predict p1=new Predict(1,2);
        Predict p2=new Predict(3,4);
        Predict p3=new Predict(5,6);
        Predict p4=new Predict(7,8);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p1);
        System.out.println(list);
        serch(list,ab);
        System.out.println("*****************");
        serch(list, ab.and(ac));           // оба запроса в одном
        System.out.println("*****************");
        serch(list, ab.negate());       // меняем полярность запроса. выдать противоположные от заданного
        System.out.println("*****************");
        serch(list, ab.or(ac));

        list.removeIf((f)->f.a>=5);
        System.out.println(list);
    }
}


