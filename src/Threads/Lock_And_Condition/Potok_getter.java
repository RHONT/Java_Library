package Threads.Lock_And_Condition;

public class Potok_getter extends Thread {

    Quai quai;

    public Potok_getter(Quai quai) {
        this.quai = quai;
        this.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            quai.remove();
            System.out.println(this.getName() + " удалил элемент");
        }
    }
}
