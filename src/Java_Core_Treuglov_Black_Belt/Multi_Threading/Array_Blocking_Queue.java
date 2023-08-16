package Java_Core_Treuglov_Black_Belt.Multi_Threading;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Array_Blocking_Queue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> abq= new ArrayBlockingQueue<>(5);

        Map<Integer,String> list_weapon=new HashMap<>();
        list_weapon.put(1,"Лук");
        list_weapon.put(2,"Меч");
        list_weapon.put(3,"Щит");
        list_weapon.put(4,"Копье");
        list_weapon.put(5,"Нож");

        Thread blacksmith= new Thread(()->{
            int count;
            while (true) {
                try {
                    count=new Random().nextInt(4) + 1;
                    abq.put(list_weapon.get(count));
                    System.out.println("Кузнец выковал: " + list_weapon.get(count));
                    System.out.println("На столе лежит" + abq);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread warriors= new Thread(()->{
            String str;
            while (true) {
                try {
                    str=abq.take();
                    System.out.println("Пехотинцы взяли: " + str);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread warriors2= new Thread(()->{
            String str;
            while (true) {
                try {
                    str=abq.take();
                    System.out.println("Ветераны взяли: " + str);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        blacksmith.start();
        warriors.start();
        warriors2.start();
    }
}
