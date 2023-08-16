package Algoritm.Algoritm.Sorting.HairBrush;

import java.util.Arrays;
import java.util.Random;

//https://www.youtube.com/watch?v=qaICQwA0aNM&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=23
// улучшенная версия пузырька
public class HairBrush {

    public static void main(String[] args) {
        int[] array = new Random().ints(15, 1, 11).toArray();
        hairSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void hairSort(int[] array) {
        int step = (int) (array.length / 1.247);
        int count = 1;
        int temp;
        while (step > 1 || count > 0) {
            count = 0;
            for (int i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + step]) {
                    temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    count++;
                }
            }
            if (step > 1) {
                step /= 1.247;
            }

        }
    }


}

/*
    1)  Выбирается начальное значение шага сортировки. Рекомендуемым является шаг
        равный целой части деления размера последовательности на 1.247. Также добавляем
        переменную для хранения числа обменов за один проход.
    2)  Устанавливаем переменную для хранения числа обменов равной нулю. Начиная с
        первого элемента последовательности сравниваем текущий элемент с элементом,
        индекс которого равен индексу текущего элемента плюс шаг. Если текущий элемент
        больше элемента с которым сравниваем производим их обмен и увеличиваем
        переменную для хранения числа обменов на единицу.
    3)  В случае если на предыдущем шаге количество обменов равно 0 и шаг равен 1, то
        заканчиваем алгоритм. В противном случае устанавливаем значение шага равным
        целой части от деления предыдущего шага на 1.247 (в случае если получается
        нулевой шаг то устанавливаем его в 1) и возвращаемся у пункту 2.
        */
