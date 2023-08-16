package Algoritm.Algoritm.OperationOnSet.ГенерацияПерестановок;
//https://www.youtube.com/watch?v=6L5mm_e3Hms&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=18

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Генерация перестановок Джонсона-Троттера
 * Суть в вспомогательном массиве, который показывает направления(влево, вправо). [-1, -1, -1, -1]
 * Сложность по времени в наихудшем случае O(n!)
 * Затраты памяти O(n)
 * <p>
 * С каждым элементом перестановки связываем направление. Направление — указатель на
 * соседний элемент (может указывать на элемент справа или слева). Элемент перестановки
 * называется мобильным, если его направление указывает на меньший соседний элемент.
 * 1) Создается первая перестановка. Ряд чисел по возрастанию 1, 2, 3, ... n. Направление каждого
 * элемента указывает влево.
 * 2) Ищем наибольший мобильный элемент. Если не находим, то алгоритм закончен.
 * 3) Производим обмен, найденного мобильного элемента с элементом на который указывает
 * направление найденного мобильного элемента.
 * 4) Меняем направление у всех элементов, которые больше чем найденный на шаге 2 элемент.
 * 5) Переходим к шагу 2.
 * <p>
 * Массив должен быть отсорирован.
 * <p>
 * <p>
 * OUTPUT:
 * [1, 2, 3]    : входной отсортированный массив
 * [-1, -1, -1] : массив с направлениями
 * ============
 * [1, 2, 3]
 * [1, 3, 2]
 * [3, 1, 2]
 * [3, 2, 1]
 * [2, 3, 1]
 * [2, 1, 3]
 * /////////////////
 * [10, 20, 45]
 * [10, 45, 20]
 * [45, 10, 20]
 * [45, 20, 10]
 * [20, 45, 10]
 * [20, 10, 45]
 * ////////////////
 * [10, 10, 45]
 * [10, 45, 10]
 * [45, 10, 10]
 */

public class Generation {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1, 3).toArray();
        int[] napr = IntStream.generate(() -> -1).limit(3).toArray();
        int[] test = new int[]{10, 10, 45};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(napr));
        System.out.println("======================");
        System.out.println(Arrays.toString(array));
        calcGeneration(test, napr);

    }

    private static void calcGeneration(int[] array, int[] napr) {
        int maxMobileIndex = findMobileIndex(array, napr);
        while (maxMobileIndex != -1) {
            int mobileElement = array[maxMobileIndex];
            int nextIndex = napr[maxMobileIndex] + maxMobileIndex;
            replace(array, napr, maxMobileIndex, nextIndex);
            changeNapr(array, napr, mobileElement);
            System.out.println(Arrays.toString(array));
            maxMobileIndex = findMobileIndex(array, napr);
        }
    }

    private static void changeNapr(int[] array, int[] napr, int mobileElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mobileElement) {
                napr[i] = napr[i] * (-1);
            }
        }
    }

    private static void replace(int[] array, int[] napr, int mobileElementIndex, int nextIndex) {

        int tempValueArray = array[mobileElementIndex];
        array[mobileElementIndex] = array[nextIndex];
        array[nextIndex] = tempValueArray;

        int tempValueNapr = napr[mobileElementIndex];
        napr[mobileElementIndex] = napr[nextIndex];
        napr[nextIndex] = tempValueNapr;

    }


    private static int findMobileIndex(int[] array, int[] napr) {
        int maxMobileIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int nextIndex = i + napr[i];
            if (nextIndex >= 0 && nextIndex < array.length) {
                if (array[i] > array[nextIndex]) {
                    if (maxMobileIndex == -1) {
                        maxMobileIndex = i;
                    } else {
                        if (array[i] > array[maxMobileIndex]) {
                            maxMobileIndex = i;
                        }
                    }
                }
            }
        }

        return maxMobileIndex;
    }
}
