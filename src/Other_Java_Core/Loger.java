package Other_Java_Core;

import java.lang.reflect.Method;
import java.util.*;

public class Loger {
    Storage storage = new Storage();

    public static void main(String[] args) {
        Loger t = new Loger();
        t.someMethod_1();
        t.someMethod_2();
        t.storage.VKL();
        t.storage.print();
        t.storage.VKL();
        t.storage.print();
        t.storage.automatical();

    }

    void someMethod_1() {
        int[] arr = new int[]{1, 2, 3};
        storage.add("1 = someOne", Arrays.toString(arr));
        arr[0] = 100;
        storage.add("1 = someOne", Arrays.toString(arr));
    }

    void someMethod_2() {
        String str = "result";
        storage.add("2 = someTwo", str);
    }


}

class Storage {
    boolean active = false;
    Map<String, List<String>> dict = new TreeMap<>();

    void print() {
        if (active) {
            for (var element : dict.entrySet()) {
                System.out.println("==========");
                System.out.println(element.getKey());
                for (var list : element.getValue()) {
                    System.out.println(list);
                }
            }
        }
    }

    void add(String method, String message) {
        if (!dict.containsKey(method)) {
            dict.put(method, new ArrayList<>(List.of(message)));
        } else dict.get(method).add(message);

    }

    void VKL() {
        active = !active;
    }

    void set(String... methodName) {
        for (var name : methodName) {
            dict.put(name, new ArrayList<>());
        }

    }

    void automatical() {
        int incr = 1;
        Loger tt = new Loger();
        Method[] m = tt.getClass().getDeclaredMethods();
        for (var element : m) {
            dict.put(String.valueOf(incr) + " = " + element.getName(), new ArrayList<>());
            incr++;
        }
        System.out.println(dict);
    }

}
