package Java_Core_Treuglov_Black_Belt.Multi_Threading;

import java.util.TreeMap;
import java.util.concurrent.Semaphore;

public class Semaphor_Ex {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sm=new Semaphore(4);
        new Boxer("Василий",sm);
        new Boxer("Генадий",sm);
        new Boxer("Ярослав",sm);
        new Boxer("Пихтоний",sm);
        new Boxer("Иван",sm).join();
        System.out.println("Метод меин закончился");  // sm.acquire(); закончился сразу после выполнения этой строки. Не дождался конца.
    }

}

class Boxer extends Thread {
    private String name;
    Semaphore sm;

    public Boxer(String name, Semaphore sm) {
        this.name = name;
        this.sm = sm;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет тоскливо, когда груша освободиться");
            sm.acquire();
            System.out.println(name + " яростно лупит, как в последний раз");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sm.release();
        }
    }
}
