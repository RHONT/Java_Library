package Algoritm.Algoritm.Sorting.Buble;

import java.util.Arrays;
import java.util.Random;

//https://www.youtube.com/watch?v=3P_YKzAhclE&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=15
// Сортировка пузырьком.
// Отсортированная часть идет с конца.
public class BubleSorting {
    public static void main(String[] args) {
        int[] array = new Random().ints(5, 1, 10).toArray();
        System.out.println(Arrays.toString(array));
        search(array);
        System.out.println(Arrays.toString(array));
    }

    private static void search(int[] array) {
        int counter = 1;
        int sortedIndex = array.length;
        while (counter > 0) {
            counter = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }
            }
            sortedIndex--;
        }

    }
}
