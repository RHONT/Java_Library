package Java_Core_Treuglov_Black_Belt.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTo {

    static ArrayList<String> abc(String[] a) {
        ArrayList<String> bufer = new ArrayList<>();
        ArrayList<String> getter = new ArrayList<>();
        System.out.println(Arrays.toString(a));  // вывод изначального массива
        Arrays.sort(a);                          // Сортируем массив естественным способом
        Collections.addAll(bufer, a);
        System.out.println(bufer);
        for (int i = 0; (i < (bufer.size() - 1)); i++) {
            if (((bufer.get(i)).equals(bufer.get(i + 1))) == false) {
                getter.add(bufer.get(i));
            }
        }
        bufer = (ArrayList) getter.clone();
        getter.clear();
        return bufer;

    }

    public static void main(String[] args) {

        System.out.println(abc(new String[]{"c", "dsaf", "adsfadf", "fasdf", "a", "a", "b", "b", "c"}));

    }
}
