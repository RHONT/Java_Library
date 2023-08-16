package Java_Core_Treuglov_Black_Belt.map_2_Hash_in_Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class Map_2 {

    static void bay_now(Map a){

        Iterator<Map.Entry<String, Map<String, Integer>>> it_outer = a.entrySet().iterator();
        while (it_outer.hasNext()){
            Map.Entry inner_map=(Map.Entry) it_outer.next();
            HashMap inner_maps= (HashMap) inner_map.getValue();

            Iterator<Map.Entry<String,String>> it_inner=inner_maps.entrySet().iterator();

            while (it_inner.hasNext()){
                Map.Entry<String,Integer> value_inner=(Map.Entry) it_inner.next();

                if (value_inner.getValue().intValue()<=1) {


                    System.out.println(value_inner);
                }
            }
        }

    }

    static void bay_already(Map<String,Map<String,Integer>> a, int numb){

        Iterator<Map.Entry<String, Map<String, Integer>>> it_outer = a.entrySet().iterator();
        while (it_outer.hasNext()){
            Map.Entry inner_map=(Map.Entry) it_outer.next();
            HashMap inner_maps= (HashMap) inner_map.getValue();

            Iterator<Map.Entry<String,String>> it_inner=inner_maps.entrySet().iterator();

            while (it_inner.hasNext()){
                Map.Entry<String,Integer> value_inner=(Map.Entry) it_inner.next();

                if (value_inner.getValue().intValue()<=1) {

                    a.get(inner_map.getKey()).put(value_inner.getKey(),value_inner.getValue()+numb);

                    System.out.println(value_inner);
                }
            }
        }

    }

    static void show_me_low(Map<String,Map<String,Integer>> a,int b) {
        a.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).filter(r->r.getValue()<=b).forEach(System.out::println);

    }

    static Map<String,Map<String,Integer>> great_application_me_low(Map<String,Map<String,Integer>> a,int b) {
        String count;
        Map<String,Map<String,Integer>> buf=new HashMap<>();
//        for (Map.Entry entry:a.entrySet()) {
//            buf.put(entry.getKey(),entry.getValue());
//        }
//        buf.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).map(h->{
//            if (h.getValue()>=b) h.setValue(0);
//            return h;
//        }).forEach(System.out::println);  не работает

        buf.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).filter(e->e.getValue()>b).map(e->{
            e.setValue(e.getValue()*0);
                return e;
        }).forEach(System.out::println);

        return buf;

    }



    public static void main(String[] args) throws InterruptedException {
        Map<String,Integer> str_map=new HashMap<>(16,0.75f);
        str_map.put("3640М 000",3);
        str_map.put("3640G 000",5);
        str_map.put("3640М 001",1);
        str_map.put("3640G 001",2);

        Map<String,Integer> str_map1=new HashMap<>(16,0.75f);

        str_map1.put("Баннер литой",0);
        str_map1.put("Баннер 440 грамм",1);

        Map<String,Integer> str_map2=new HashMap<>(16,0.75f);
        str_map2.put("Бэклит 190 грамм 1.24",5);
        str_map2.put("Бэклит 190 грамм 1.37",1);

        Map<String,Map<String,Integer>> str_map_father=new HashMap<>(16,0.75f);
        Map<String,Map<String,Integer>> application=new HashMap<>(16,0.75f);
        str_map_father.put("Пленка",str_map);
        str_map_father.put("Баннер",str_map1);
        str_map_father.put("Бэклит",str_map2);

        Map<String,Map<String,Integer>> str_map_father_copy=new HashMap<>();
        str_map_father_copy.putAll(str_map_father);

        System.out.println("Текущее количество материала: ");
        System.out.println(str_map_father);
        Thread.sleep(1000);
        System.out.println();

//        application=great_application_me_low(str_map_father,1);
//        //application.entrySet().stream().forEach(System.out::println);
//        System.out.println(application);
//
//        System.out.println("Старый массив:");
//        //str_map_father.entrySet().stream().forEach(System.out::println);
//        System.out.println(str_map_father);

        //str_map_father.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).filter(r->r.getValue()<=1).forEach(System.out::println);
//        show_me_low(str_map_father,4);
//
//        System.out.println("-----------------");

        str_map_father.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).filter(r->r.getValue()<=1).forEach(g->System.out.println(g)); // одно и тоже! System.out::println
        System.out.println("-----------------");
        Thread.sleep(1000);
        str_map_father.entrySet().stream().flatMap(e->e.getValue().entrySet().stream()).filter(r->r.getValue()<=1).map(e->{e.setValue(e.getValue()+250); return e;}).forEach(System.out::println);

//        str_map_father.entrySet().stream().flatMap(e-> {
//            System.out.println(e.getKey());
//            return e.getValue().entrySet().stream();
//        }).forEach(System.out::println);
        Thread.sleep(1000);

        System.out.println("-----------------");
        System.out.println(str_map_father);
        System.out.println(str_map_father_copy);



        // Пример сложных самонаписанных сортировок. Ебал я их в рот. Проще использовать stream()!
//        bay_now(str_map_father);
//        System.out.println();
//
//        System.out.println("Недостающий материал заказан!");
//        bay_already(str_map_father,200);
//
//        System.out.println("Теперь список таков:");
//
//        System.out.println(str_map_father);




        }

    }


