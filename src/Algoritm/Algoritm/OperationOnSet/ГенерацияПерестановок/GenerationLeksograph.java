package Algoritm.Algoritm.OperationOnSet.ГенерацияПерестановок;
//https://www.youtube.com/watch?v=bp5_gvIdLEU&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=19

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Генерация перестановок. Алгоритм Нарайана. (Как и Троттер, но без участия дополнительного массива)
 * <p>
 * Сложность по времени в наихудшем случае O(n)
 * Затраты памяти O(n)
 * Внимание!! Это сложность генерации одной (следующей в лексикографическом
 * порядке) перестановки. Генерация всех перестановок имеет факториальную
 * сложность.
 *
 * <p>
 * OUTPUT: calcGenLekso(array) сортировка обязательна
 * [1, 3, 9]
 * [1, 9, 3]
 * [3, 1, 9]
 * [3, 9, 1]
 * [9, 1, 3]
 * [9, 3, 1]
 */

public class GenerationLeksograph {
    public static void main(String[] args) {

        int[] array = new Random().ints(3, 1, 10).toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        calcGenLekso(array);
    }

    private static void calcGenLekso(int[] array) {
        int count = 1;

        int firstIndex = findFirstIndex(array);
        while (firstIndex != -1) {
            count++;
            int firstSmall = array[firstIndex];
            int secondIndex = findSecondValueIndex(array, firstSmall);
            swap(array, firstIndex, secondIndex);
            reverse(array, firstIndex);
            System.out.println(Arrays.toString(array));
            firstIndex = findFirstIndex(array);
        }
        System.out.println("Всего было операций " + count);
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int findSecondValueIndex(int[] array, int firstValue) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > firstValue) {
                return i;
            }
        }
        return -1;
    }

    private static int findFirstIndex(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    private static void reverse(int[] permutation, int index) {
        int shift = index + 1;
        for (int i = 0; i < (permutation.length - shift) / 2; i++) {
            int temp = permutation[shift + i];
            permutation[shift + i] = permutation[permutation.length - i - 1];
            permutation[permutation.length - i - 1] = temp;
        }
    }
}

