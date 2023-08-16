package Algoritm.Algoritm.Sorting.СортировкаСлиянием;

import java.util.Arrays;

/**
 * Когда в одном массиве содержаться две последовательности
 * <p>
 * Input Array[1, 3, 6, 9, 2, 4, 4, 7]
 * Output Array[1, 2, 3, 4, 4, 6, 7, 9]
 */

public class SortTwoSequanceInOneArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 6, 9, 2, 4, 4, 7};
        System.out.println("Input Array" + Arrays.toString(array));
        merge(array, 0, 3, 4, 7);
        System.out.println("Output Array" + Arrays.toString(array));
    }

    public static void merge(int[] array, int ls, int le, int rs, int re) {
        int[] supportArray = Arrays.copyOf(array, array.length);
        int l = ls;
        int r = rs;
        for (int i = ls; i <= re; i++) {
            if (l > le) {
                array[i] = supportArray[r];
                r += 1;
            } else if (r > re) {
                array[i] = supportArray[l];
                l += 1;
            } else if (supportArray[l] < supportArray[r]) {
                array[i] = supportArray[l];
                l += 1;
            } else {
                array[i] = supportArray[r];
                r += 1;
            }
        }
    }

}
