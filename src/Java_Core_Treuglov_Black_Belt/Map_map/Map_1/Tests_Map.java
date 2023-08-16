package Java_Core_Treuglov_Black_Belt.Map_map.Map_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

final class Unit{
    final int health,damage,initiative;
    String name;

    public Unit(String name, int health, int damage, int initiative) {
        this.health = health;
        this.damage = damage;
        this.initiative = initiative;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return health == unit.health && damage == unit.damage && initiative == unit.initiative && Objects.equals(name, unit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, damage, initiative, name);
    }

    @Override
    public String toString() {
        return
                " name: '" + name + '\'' +
                ", health: " + health +
                ", damage: " + damage +
                ", initiative: " + initiative+"\n";
    }
}

public class Tests_Map {
    static Integer ref(String str)  {
        return Integer.valueOf(str);
    }
    public static void main(String[] args) {
        String buf_str;
        String[] buf_arr_str;

        Map<Integer,Unit> list_unit = new HashMap<>(16,0.75f){
            @Override
            public String toString() {

                StringBuilder sb = new StringBuilder();
                forEach((key, value) -> {
                    if ((key==null) || (value==null)) {
                        if (key == null) sb.append("Пусто ");
                        if (value == null) sb.append("Отсутсвует\n");
                    }
                    else
                    sb.append(key).append(" ").append(value);
                });


                return sb.toString();
            }
        };

        File f_for_read=new File("D:\\Java_Educ\\Java_my_examples\\Begin\\src\\Map_map\\Map_1\\path_name.txt");
        try {
            Scanner read_scan=new Scanner(f_for_read);
            while (read_scan.hasNextLine()) {
                buf_arr_str=read_scan.nextLine().split(" ");
                list_unit.put(ref(buf_arr_str[0]),new Unit(buf_arr_str[1],ref(buf_arr_str[2]),ref(buf_arr_str[3]),ref(buf_arr_str[4])));
            }
            read_scan.close();
        }
        catch (FileNotFoundException o) {
            System.out.println("Файл не найден");
        }

        System.out.println(list_unit);

        System.out.println(list_unit.remove(1));
        System.out.println(list_unit.containsKey(2));
        System.out.println((list_unit.get(2).health==90));
        list_unit.put(8,new Unit("Новобранец",50,10,5));
        list_unit.putIfAbsent(1, new Unit("Новобранец",50,10,5));
        list_unit.putIfAbsent(2, new Unit("jgh",50,10,5));  // not input
        list_unit.put(555,new Unit("Новобранец",50,10,50));
        list_unit.put(100,new Unit("Новобранец",50,10,100));

        Unit u1=new Unit("Пришлый",50,10,100);
        list_unit.putIfAbsent(444,u1);
//        list_unit.put(null,null);
//        list_unit.put(null,null);
        System.out.println(list_unit);
        Iterator<Unit> it=list_unit.values().iterator();
        int count=0;
        while (it.hasNext()) {
            count++;
            if (it.next().health>100) System.out.println(list_unit.get(count));
            //// if (it.next().health>100) {System.out.println(it.next());} // не работает почему-то
        }
        // напихать нулов не получиться. Только один нул... Ибо нул сразу перемещаеться на нулевую позицию, а
        // следовательно постянно затираеться. Прежние значение удаляються.


        System.out.println((list_unit.get(7).health==5000));
        //list_unit.get(7).health=1000; //после final сделать этого уже нельзя
        System.out.println(list_unit.get(7).hashCode());
        System.out.println(list_unit.get(444).hashCode());
        System.out.println(u1.hashCode());

        for (Map.Entry<Integer,Unit> buf_entry:list_unit.entrySet()) {
            System.out.println(buf_entry.getKey() + "---" + buf_entry.getValue());
        }

        list_unit.clear();
        if (list_unit.size()==0){
            System.out.println("Список пуст");
        }
        else
        System.out.println(list_unit);



    }





}
