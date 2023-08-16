package Java_Core_Oleksandr_Tsymbaliuk.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class tests {
    public static void main(String[] args) {
        Integer[] arr = new Random().ints(1, 100).limit(10).boxed().toArray(Integer[]::new);

        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 / 10 != 0) {
                    o1 = (o1 / 10) + (o1 % 10);
                }
                if (o2 / 10 != 0) {
                    o2 = (o2 / 10) + (o2 % 10);
                }

                if (o1 > o2) {
                    return 1;
                }
                if (o1 < o2) {
                    return -1;
                }
                return 0;
            }
        };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, c1);
        System.out.println(Arrays.toString(arr));
    }
}
