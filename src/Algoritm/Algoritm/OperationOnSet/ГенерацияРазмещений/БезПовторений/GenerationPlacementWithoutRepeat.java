package Algoritm.Algoritm.OperationOnSet.ГенерацияРазмещений.БезПовторений;
//https://www.youtube.com/watch?v=q-s-HcuLeyk&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=28

import java.util.Arrays;

/**
 * Создан на основе алгоритма Нарайана
 * Сложность по времени в наихудшем случае O(n!/(n-k)!)
 * Затраты памяти O(n+k)
 * <p>
 * OUTPUT: из массива {1, 2, 3, 4} Количество размещений: 3
 * Массив не привязан к сортировке и к значениям {100, 2, 30, 4} будет работать.
 * [1, 2, 3]
 * [1, 2, 4]
 * [1, 3, 2]
 * [1, 3, 4]
 * [1, 4, 2]
 * [1, 4, 3]
 * [2, 1, 3]
 * [2, 1, 4]
 * [2, 3, 1]
 * [2, 3, 4]
 * [2, 4, 1]
 * [2, 4, 3]
 * [3, 1, 2]
 * [3, 1, 4]
 * [3, 2, 1]
 * [3, 2, 4]
 * [3, 4, 1]
 * [3, 4, 2]
 * [4, 1, 2]
 * [4, 1, 3]
 * [4, 2, 1]
 * [4, 2, 3]
 * [4, 3, 1]
 * [4, 3, 2]
 */
public class GenerationPlacementWithoutRepeat {

    public static void main(String[] args) {

        int[] number = new int[]{1, 6, 50, 4};
        int k = 3;

        int[] perm = Arrays.copyOfRange(number, 0, k);
        for (; perm != null; ) {
            System.out.println(Arrays.toString(perm));
            perm = getNextKPermutation(k, number);
        }

    }

    public static int[] getNextKPermutation(int k, int[] number) {
        int n = number.length;
        int i = k;
        for (; i < n && number[i] < number[k - 1]; ) {
            i = i + 1;
        }
        if (i < n) {
            swap(number, i, k - 1);
        } else {
            reverse(number, k - 1);
            int j = k - 2;
            for (; j >= 0 && number[j] > number[j + 1]; ) {
                j = j - 1;
            }
            if (j < 0) {
                return null;
            } else {
                i = n - 1;
                for (; i > j; ) {
                    if (number[i] > number[j]) {
                        break;
                    }
                    i = i - 1;
                }
                swap(number, i, j);
                reverse(number, j);
            }
        }

        return Arrays.copyOfRange(number, 0, k);

    }

    public static void reverse(int[] permutation, int index) {
        int shift = index + 1;
        for (int i = 0; i < (permutation.length - shift) / 2; i++) {
            int temp = permutation[shift + i];
            permutation[shift + i] = permutation[permutation.length - i - 1];
            permutation[permutation.length - i - 1] = temp;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

/**
 * Сложность по времени в наихудшем случае O(n!/(n-k)!)
 * Затраты памяти O(n+k)
 * <p>
 * 1) Создаем последовательность длинной n. Заполняем ее значениями равными индексу элемента
 * (в дальнейшем предполагаем что индексация в последовательности начинается с нуля).
 * Выбираем k. Возвращаем первые k — элементов. Это первое размещение. Переходим к 2.
 * <p>
 * 2) Получаем значение стоящее на k-1 индексе в последовательности. Проводим поиск начиная от
 * k-го индекса и до конца. Ищем индекс минимального элемента который больше элемента
 * стоящего на k-1 индексе. Переходим к 3.
 * <p>
 * 3) Возможны два случая:
 * a) Если такой индекс был найден (в дальнейшем j) то производим обмен значений на k-1 и j
 * индексах. В качестве следующего размещения возвращаем первые k элементов. Переходим к
 * 2.
 * b) Индекс не найден. Переходим к 4.
 * <p>
 * 4) Проводим реверс от k-го индекса и до конца последовательности. Выполняем поиск начиная от
 * k-1 индекса и до 0 (обратный проход). Ищем такой элемент что s[i]<s[i+1]. Возможны два случая.
 * a) Такой элемент найден. Тогда выполняем поиск начиная с конца последовательности и до i.
 * Ищем индекс минимального элемента который будет больше чем s[i]. Меняем их местами и
 * производим реверс последовательности от i+1 индекса. Возвращаем первые k элементов.
 * Переход к 2.
 * b) Такой элемент не найден. Заканчиваем алгоритм.
 * <p>
 */
