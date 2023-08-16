package Java_Core_Treuglov_Black_Belt.HomeWork_Sorting_string_in_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {
    public static void main(String[] args) {
        HomeWork obj1 = new HomeWork();
        ArrayList<String> work_list = new ArrayList<>();

        work_list = obj1.sortstring("123", "a", "b", "d", "d", "a", "b", "d", "d", "a", "b", "d", "10");
        ArrayList<String> work_list_new = new ArrayList<>(work_list); // greate new list
        System.out.println();
        System.out.println("Значение рабочего листа:");
        System.out.println(work_list);

        work_list.remove("123");
        System.out.println("Значение измененного work_list");
        System.out.println(work_list);
        System.out.println("Значение work_list_new");
        System.out.println(work_list_new);
    }

    ArrayList<String> sortstring(String... s) {
        ArrayList<String> newstr = new ArrayList<>();
        ArrayList<String> newstrdublicat = new ArrayList<>();

        for (String temp_str : s) {
            if (!newstr.contains(temp_str)) {
                newstr.add(temp_str);
            } else {
                newstrdublicat.add(temp_str);
            }
        }
        Collections.sort(newstr);
        System.out.println("Уникальные значения строк:");
        System.out.println(newstr);
        System.out.println();
        System.out.println("Дубликаты строк:");
        System.out.println(newstrdublicat);

        return newstr;
    }
}
