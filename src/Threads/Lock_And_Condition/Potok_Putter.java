package Threads.Lock_And_Condition;

public class Potok_Putter extends Thread {
    Quai quai;

    public Potok_Putter(Quai quai) {
        this.quai = quai;
        this.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            quai.put(10);
            System.out.println(this.getName() + " положил в список " + 10);
        }

    }
}
