package Algoritm.Algoritm.Search.BinarySearch;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 11).toArray();


        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 10));

    }

    static int binarySearch(int[] array, int requiredElement) {
        int left = 0;
        int right = array.length - 1;
        int current = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (; left <= right; ) {
            current = left + (right - left) / 2;
            if (array[current] == requiredElement) {
                return current;
            }
            if ((array[current] < requiredElement)) {
                left = current + 1;
            } else {
                right = current - 1;
            }
        }
        return -1;


    }
}
