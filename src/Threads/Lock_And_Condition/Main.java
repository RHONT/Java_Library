package Threads.Lock_And_Condition;

public class Main {
    public static void main(String[] args) {
        Quai quai = new Quai();
        Potok_Putter potok_putter = new Potok_Putter(quai);
        Potok_getter potok_getter = new Potok_getter(quai);


        try {
            potok_getter.join();
            potok_putter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("конец");
    }
}
