package Algoritm.Algoritm.Sorting.Insert;

import java.util.Arrays;
import java.util.Random;
// Сортировка вставкой
//https://www.youtube.com/watch?v=hLetyfSVdJQ&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=16

public class InsertSorting {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 40).toArray();
        System.out.println(Arrays.toString(array));
        sortingInsert(array);

    }

    private static void sortingInsert(int[] array) {

        int pasteElement;

        for (int i = 0; i < array.length; i++) {
            pasteElement = array[i];
            int j; // эта вещь позволяет сохранять актуальность элемента внутреннего массива.
            for (j = i; j > 0; j--) {
                if (array[j - 1] <= pasteElement) {
                    break;
                }
                array[j] = array[j - 1];
            }
            array[j] = pasteElement;
        }

        System.out.println(Arrays.toString(array));
    }
}
