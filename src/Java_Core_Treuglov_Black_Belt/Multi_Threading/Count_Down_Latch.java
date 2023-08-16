package Java_Core_Treuglov_Black_Belt.Multi_Threading;

import java.util.concurrent.CountDownLatch;

//Просиходит терраформация земли. И только спустя пять операций начинают добавляться животные.

public class Count_Down_Latch {

    static CountDownLatch cdl=new CountDownLatch(5);

    public static void main(String[] args) throws InterruptedException {
        Animal a1=new Animal("Гусеница",cdl);
        new Animal("Белка",cdl);
        new Animal("Лось",cdl);
        new Animal("Мамонт",cdl);

        create_planet();
        create_sphere();
        create_water();
        create_mountains();
        create_forest();



        System.out.println("поток main прекратил существование"); // Поток main завершил свою работу сразу как CDL стал равен 0

    }



    private static void create_planet() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("В мертвом космосе зародилась планета");
        cdl.countDown();
    }
    private static void create_water() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Из небытия ледяные пласты рухнул поток воды.");
        cdl.countDown();
    }
    private static void create_sphere() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Планету окружила атмосфера");
        cdl.countDown();
    }
    private static void create_mountains() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Из водный глади выросли горы");
        cdl.countDown();
    }
    private static void create_forest() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("На голой суше появились первые зеленые ростки");
        cdl.countDown();
    }


}

class Animal extends Thread {
    String name;
    CountDownLatch cdl;

    public Animal(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
        this.start();
    }

    @Override
    public void run() {
        try {
            cdl.await();
            System.out.println(name + " Выбежал(а) на сушу!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
