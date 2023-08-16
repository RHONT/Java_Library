package Java_Core_Treuglov_Black_Belt.Queue_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Work_Queue {

    static void Anal_Celebration(LinkedList<String> a, String b){
        Iterator it = a.iterator();
        while (it.hasNext()) {
            System.out.println(a.remove() + " Выебана в " + b + " И послана домой!");
        }
        System.out.println("Бляди коничлись милород!");

    }

    public static void main(String[] args) {
        Queue<Integer> list_number_q=new LinkedList<>();
        list_number_q.add(3);
        list_number_q.add(3);
        list_number_q.add(3);
        list_number_q.offer(3); // Если очередь ограничена, то элемент не добавиться. Исключение не выпадет.

        list_number_q.remove();
        list_number_q.remove();
        list_number_q.remove();
        list_number_q.remove();
        //list_number_q.remove();  // Тут выпадет NoSuchElementException. Ибо удалять нечего
        list_number_q.poll();      // Аналог remove, Исключение не выдает, возвращает null
       // list_number_q.element();   // Тут выпадет NoSuchElementException. Ибо нечего выводить.
        list_number_q.peek();       // аналог element, но не ругаеться

        list_number_q.add(5);
        list_number_q.add(5);
        list_number_q.add(5);

        list_number_q.peek();
        list_number_q.remove();
        list_number_q.peek();


        System.out.println(list_number_q);
/////////////////////////////////////////////////////////////////
        Queue<String> list_number_q_string=new LinkedList<>();
        list_number_q_string.add("Маша");
        list_number_q_string.add("abcccc");
        list_number_q_string.add("abccccc");
        list_number_q_string.offer("abc"); // Если очередь ограничена, то элемент не добавиться. Исключение не выпадет.

        System.out.println(list_number_q_string);

        list_number_q_string.remove();
        list_number_q_string.remove();
        list_number_q_string.remove();
        list_number_q_string.remove();
        //list_number_q.remove();  // Тут выпадет NoSuchElementException. Ибо удалять нечего
        list_number_q_string.poll();      // Аналог remove, Исключение не выдает, возвращает null
        // list_number_q.element();   // Тут выпадет NoSuchElementException. Ибо нечего выводить.
        list_number_q_string.peek();       // аналог element, но не ругаеться

        list_number_q_string.add("Маша");
        list_number_q_string.add("Олеся");
        list_number_q_string.add("Гуталина");
        list_number_q_string.add("Ксения");
        list_number_q_string.add("Милана");
        Anal_Celebration((LinkedList<String>) list_number_q_string,"Глаз!");




    }
}
