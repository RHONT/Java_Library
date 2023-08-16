package Algoritm.Algoritm.Sorting.Choice;

import java.util.Arrays;
import java.util.Random;
//https://www.youtube.com/watch?v=6xswgQZ1quU&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=10
// Сортировка выбором

public class Choice {
    public static void main(String[] args) {
        int[] test = new Random().ints(10, 1, 11).toArray();
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(sortInsert(test)));

    }

    private static int[] sortInsert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
