package Java_Core_Treuglov_Black_Belt.Multi_Threading;

import java.util.concurrent.Semaphore;

public class Semaphor_2 {
    static int cheese_head =30;

    public static void main(String[] args) {
        Semaphore sm=new Semaphore(2);
        new Rat("Серая",4,sm);
        new Rat("Белая",2,sm);
        new Rat("Плешивая",2,sm);
        new Rat("Черная",7,sm);
    }
}

class Rat extends Thread {
    private String name;
    private int jaw_size;
    Semaphore sm;

    public Rat(String name, int jaw_size, Semaphore sm) {
        this.name = name;
        this.jaw_size = jaw_size;
        this.sm = sm;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Жадная мышь " + name + " ждем возможности откусить кусок сыра!");
            sm.acquire();
            if (Semaphor_2.cheese_head<=0) {
                System.out.println("Мышка " + name + " огорчилась. Сыра не осталось...");
            }
            else {
                System.out.println("Мышь " + name + " Начинает трапезу!");
                for (int i = 0; i < 3; i++) {
                    Semaphor_2.cheese_head -= jaw_size;
                    System.out.print(" Хрум ");
                    Thread.sleep(300);
                    if (Semaphor_2.cheese_head<=0) {
                        System.out.println("\n Мышь " + name + " успела откусить всего: "+(i+1)+" кусочка. Сыр кончился!");
                        Semaphor_2.cheese_head=0;
                        break;
                    }
                }
                System.out.print("\n");
                System.out.println("Мышь " + name + " отожралась как следует. Сыра осталось: " + Semaphor_2.cheese_head);
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sm.release();
        }
    }
}
