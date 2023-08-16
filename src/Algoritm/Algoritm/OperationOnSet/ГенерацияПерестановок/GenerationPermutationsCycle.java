package Algoritm.Algoritm.OperationOnSet.ГенерацияПерестановок;
//https://www.youtube.com/watch?v=oK8A7eIWXF8&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=26

import java.util.Arrays;


/**
 * Сложность по времени в наихудшем случае O(n!)
 * Затраты памяти O(n)
 * <p>
 * 1) Создать последовательность размером n. Заполнить ее значениями равными индексам
 * элементов. Создать вспомогательную переменную (в примере k). Установить ее значение
 * равное индексу последнего элемента. Перейти к пункту 2.
 * <p>
 * 2) Вывести на экран последовательность. Установить значение k равное индексу последнего
 * элемента. Перейти к пункту 3.
 * <p>
 * 3) Выполнить циклический сдвиг влево элементов последовательности от первого до k-го. Если k-
 * й элемент последовательности не равен k то перейти к пункту 2. В противном случае перейти к
 * пункту 4.
 * <p>
 * 4) Указать новое значение k = k-1. Если k равен индексу первого элемента последовательности то
 * закончить алгоритм. В противном случае перейти к пункту 3.
 * <p>
 * OUTPUT: printAllPermutation({0, 1, 2}) Работа с индексами! Не со значениями!
 * [0, 1, 2]
 * [1, 2, 0]
 * [2, 0, 1]
 * [1, 0, 2]
 * [0, 2, 1]
 * [2, 1, 0]
 **/

public class GenerationPermutationsCycle {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2};

        printAllPermutation(arr);

    }

    public static void printAllPermutation(int[] array) {
        int count = 1;
        int k = array.length - 1;
        int n = k;
        System.out.println(Arrays.toString(array));
        for (; k > 0; ) {
            leftShift(array, k);
            if (array[k] != k) {
                System.out.println(Arrays.toString(array));
                k = n;
                count++;
            } else {
                k = k - 1;
            }

        }
        System.out.println("Перестановок было = " + count);
    }

    public static void leftShift(int[] array, int k) {
        int temp = array[0];
        for (int i = 0; i < k; i++) {
            array[i] = array[i + 1];
        }
        array[k] = temp;
    }

}


