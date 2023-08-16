package Java_Core_Treuglov_Black_Belt.Lyamda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Supl {
    @Override
    public String toString() {
        return "Supl{" +
                "health=" + health +
                ", defence=" + defence +
                '}';
    }

    int health = new Random().nextInt(100);
    int defence= new Random().nextInt(100);

    public Supl() {
    }
}

class New_Unit{
    int health;
    int defense;

    public New_Unit(int health, int defense) {
        this.health = health;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "New_Unit{" +
                "health=" + health +
                ", defense=" + defense +
                '}';
    }
}

class tests{
    static ArrayList<New_Unit> s_3(bb<New_Unit> ad){     //Тестировал суплаер который сделал своими руками
        ArrayList<New_Unit> local_list=new ArrayList<>();
        for (int i=0;i<6;i++){local_list.add(ad.gat());}
        return local_list;
    }

    static ArrayList<New_Unit> s_1(){                 // тестировал ту же задачу без использования суплаера, работает
                                                      // но нужно каждый раз сюда залезать и, хериться мои предыдущие аргументы
                                                      //этот метод начинает влиять на все!
        ArrayList<New_Unit> local_list=new ArrayList<>();
        for (int i=0;i<6;i++){local_list.add(new New_Unit(1,1));}
        return local_list;
    }

    static ArrayList<New_Unit> s_2(Supplier<New_Unit> ad){           // стандартный суплаер в отрыве от первого класса где использовал рандом.Неудачный был мой первый выбор.
        ArrayList<New_Unit> local_list=new ArrayList<>();
        for (int i=0;i<6;i++){local_list.add(ad.get());}
        return local_list;
    }

    static ArrayList<Supl> create_five() {                             // Проба без суплаера.
        ArrayList<Supl> local_list=new ArrayList<>();
        for (int i=0;i<6;i++){local_list.add(new Supl());}
        return local_list;

    }

    static ArrayList<Supl> create_five_unit(Supplier<Supl> ad) {
        ArrayList<Supl> local_list=new ArrayList<>();
        for (int i=0;i<6;i++){local_list.add(ad.get());}
        return local_list;

    }
    public static void main(String[] args) {
        int hard_1=300;
        int hard_2=400;

        ArrayList<Supl> list_five=create_five_unit(()->new Supl());

        ArrayList<Supl> list_five_1=create_five();

        System.out.println(list_five_1);

        ArrayList<New_Unit> list_1=s_1();
        System.out.println(list_1);

        ArrayList<New_Unit> list_2=s_2(()->new New_Unit(30,30));
        System.out.println(list_2);

        ArrayList<New_Unit> list_3=s_2(()->{return new New_Unit(hard_1,hard_2);} );  // ради интереса просто взял тело в скобки. полное описание.
        System.out.println(list_3);

        ArrayList<New_Unit> list_4=s_3(()->new New_Unit(5,5));
        System.out.println(list_4);

        // удобство в том, что не нужно каждый раз лезьт в метод и его там переписывать. Долой статику, можно
        // видоизменять на ходу свойства объекта

    }
}

interface bb<T> { T gat();}

