package Java_Core_Treuglov_Black_Belt.Decue;

import java.util.ArrayDeque;
import java.util.Deque;

public class decuee {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(100);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
