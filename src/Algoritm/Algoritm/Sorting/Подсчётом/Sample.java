package Algoritm.Algoritm.Sorting.Подсчётом;
//https://www.youtube.com/watch?v=oGJuM4XKFfs&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=39

import java.util.Arrays;

/**
 * Сложность по времени в наихудшем случае O(n)
 * Требует дополнительно памяти в размере диапазона чисел
 * <p>
 * Сортировка подсчетом используется для сортировки массивов целых чисел, значения которых
 * лежат в относительно узком диапазоне. Например если существует массив целых чисел размером
 * 1000000, значения которых лежат в диапазоне [0..1000], то этот алгоритм покажет очень хорошее
 * быстродействие. Отдельно стоит отметить такую особенность этого алгоритма сортировки, как
 * отсутствие операции сравнения ключей.
 * <p>
 * Очень крутой алгоритм. При определенных условиях кладет Шелла на лопатки
 */

public class Sample {

	public static void main(String[] args) {

		int[] sort = new int[]{5, 0, -2, 7, 3};
		System.out.println(Arrays.toString(sort));
		countingSort(sort);
		System.out.println(Arrays.toString(sort));

	}

	public static void countingSort(int[] sort) {
		int[] minMax = findMinMax(sort);
		int minValue = minMax[0];
		int maxValue = minMax[1];
		int[] support = new int[maxValue - minValue + 1];
		for (int element : sort) {
			support[element - minValue] += 1;
		}
		int index = 0;
		for (int i = 0; i < support.length; i++) {
			for (int j = 0; j < support[i]; j++) {
				sort[index] = i + minValue;
				index += 1;
			}

		}
	}

	public static int[] findMinMax(int[] array) {
		int min = array[0];
		int max = array[0];
		for (int element : array) {
			if (min > element) {
				min = element;
			}
			if (max < element) {
				max = element;
			}
		}
		return new int[]{min, max};
	}
}
