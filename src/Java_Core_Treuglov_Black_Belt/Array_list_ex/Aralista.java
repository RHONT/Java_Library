package Java_Core_Treuglov_Black_Belt.Array_list_ex;

import java.util.ArrayList;

public class Aralista {
    public static void main(String[] args) {
        ArrayList<Integer> remember = new ArrayList<>();
        ArrayList<Integer> remember1 = new ArrayList<>();
        ArrayList<Integer> in1 = new ArrayList<>();
        in1.add(1);
        in1.add(2);
        in1.add(3);
        in1.add(4);
        in1.add(5);
        in1.add(6);
        in1.add(7);
        remember = (ArrayList) in1.clone();

        ArrayList<Integer> in2 = new ArrayList<>();
        in2.add(1);
        in2.add(2);
        in2.add(3);
        in2.add(8);
        in2.add(9);


        System.out.println(in1);
        System.out.println(in2);

        in1.removeAll(in2);   // Пересечение второй массив выкашивает все значения первого
        System.out.println(in1);


        remember.retainAll(in2);       //Сохраняет пересечение массивов. Только сохр то, что есть во во втором массиве
        System.out.println(remember);
    }
}
