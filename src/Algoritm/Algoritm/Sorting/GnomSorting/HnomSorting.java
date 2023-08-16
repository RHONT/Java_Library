package Algoritm.Algoritm.Sorting.GnomSorting;

import java.util.Arrays;
import java.util.Random;
//https://www.youtube.com/watch?v=uSHv3Q1Smv8&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=22


public class HnomSorting {
    public static void main(String[] args) {
        int[] array = new Random().ints(4, 1, 11).toArray();
        gnomSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void gnomSort(int[] array) {
        int rememberMe = 1;
        int i = 0;
        int temp;
        for (; i < array.length - 1; ) {
            if (array[i] <= array[i + 1]) {
                i = rememberMe;
                rememberMe++;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i--;
            }
            if (i < 0) {
                i = rememberMe;
                rememberMe++;
            }

        }
    }

}

/**
 * 1)  В качестве опорного берем первый элемент последовательности. Вводим
 * дополнительную переменную, для хранения индекса. Устанавливаем ее равной
 * индексу первого элемента.
 * <p>
 * 2)  Выполняем сравнение опорного и следующего за ним элемента. Если опорный
 * элемент является последним элементом последовательности заканчиваем
 * алгоритм. Если опорный элемент меньше или равен следующему элементу, то в
 * качестве опорного выбирают следующий элемент и повторяют пункт 2.
 * <p>
 * 3)  Если опорный элемент больше следующего, то устанавливаем значение
 * переменной для хранения индекса равным значению индекса следующего
 * элемента. Производим обмен опорного и следующего элемента. В качестве
 * опорного выбираем предыдущий. Повторяем до тех пор пока или не дойдем до
 * начала последовательности или опорный элемент не станет меньше следующего.
 * После чего в качестве опорного выбираем элемент индекс которого хранится во
 * вспомогательной переменной. И повторяем пункт 2.
 **/