package Java_Core_Treuglov_Black_Belt.Run_word;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Run_word extends Thread{
    volatile boolean bool=true;

    @Override
    public void run() {
        super.run();
        System.out.println("Начало работы потока r1");
        long count=0;
        while (bool) {
            count++;
        }
        System.out.println("Цикл завершен. Натикало: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        String str="Привет мир!";
        char[] str_char=str.toCharArray();
        System.out.println(Arrays.toString(str_char));
        System.out.println(str_char);
        for (char t:str_char){
            System.out.print(t);
            Thread.sleep(40);
        }

        Run_word r1=new Run_word();
        r1.start();
        Thread.sleep(2500);
        r1.bool=false;
        r1.join();


        Thread ff=new Thread(new f1() );
        ff.start();

        ff.join();

        potok p1=new potok();
        p1.start();

    }


}

class f1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток F1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поспали три секунды, пора работать.");
    }
}

class potok extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Начало потока 'поток'");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Спал поток 2 секунды и окончился 'поток'");
    }
}
