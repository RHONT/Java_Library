package Algoritm.Algoritm.OperationOnSet.ГенерацияСочетаний;
//https://www.youtube.com/watch?v=yTIRwioT8W4&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=25

/**
 * Генерируем все сочетания из n целых чисел [0,1,2...n-1] по k.
 * <p>
 * 1)  Создаем последовательность размером k+2 элемента. Первые k — элементов
 * устанавливаем равный индексу элемента. Элемент k+1 устанавливаем равным n, k+2
 * — равный 0.
 * <p>
 * 2)  Начиная с начала последовательности проверяем условие ki +1 = ki+1.
 * Если это так, то
 * устанавливаем элемент равный его индексу. Как только это условие нарушено, то
 * переходим к пункту 3.
 * <p>
 * 3)  Если индекс элемента где нарушено условие больше k заканчиваем алгоритм, если
 * нет то увеличиваем элемент, на который указывает индекс, на единицу.
 * Возвращаемся к пункту 2.
 * <p>
 * Для сочетания [4-3-2] - > [2-3-4] = это одно и тоже. Поэтому сочетания выдают уникальные по содержанию последовательности
 * OUTPUT: printAllCombination(5, 3)
 * [0,1,2]
 * [0,1,3]
 * [0,2,3]
 * [1,2,3]
 * [0,1,4]
 * [0,2,4]
 * [1,2,4]
 * [0,3,4]
 * [1,3,4]
 * [2,3,4]
 */

public class GenerateCombination {
    public static void main(String[] args) {

        printAllCombination(5, 3);
    }

    public static void printAllCombination(int n, int k) {
        int[] comb = new int[k + 2];
        for (int i = 0; i < k; i++) {
            comb[i] = i;
        }
        comb[k] = n;
        comb[k + 1] = 0;
        for (; ; ) {
            printArrayPart(comb, 0, k);
            int j = 0;
            for (; comb[j] + 1 == comb[j + 1]; ) {
                comb[j] = j;
                j = j + 1;
            }
            if (j < k) {
                comb[j]++;
            } else {
                break;
            }
        }
    }

    public static void printArrayPart(int[] array, int s, int e) {
        System.out.print("[");
        for (int i = s; i < e - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[e - 1] + "]");
    }
}


