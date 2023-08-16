package Algoritm.Algoritm.Sorting;
// модификация пузырька
// Сложность по времени в наихудшем случае O(n2)

//        1) Объявляем две дополнительные переменные для хранения границ с которых нужно начинать
//        проход по элементам последовательности (left и right соответственно) и переменную для
//        контроля наличия факта обмена (control). Устанавливаем значение left = 0, right — индексу
//        последнего элемента последовательности, control =right. Перейти к пункту 2.

//        2) Начиная от left и до right выполняем проход по элементам последовательности. Если текущий
//        элемент больше следующего элемента то провести их обмен и установить значение control
//        равной индексу текущего элемента. После прохода установить значение right равный control.
//        Перейти к пункту 3.

//        3) Начиная от right до left выполняем обратный проход по элементам последовательности. Если
//        текущий элемент меньше предыдущего то выполняем их обмен и устанавливаем значение
//        control равным индексу текущего элемента. После прохода устанавливаем значение left равным
//        control. Перейти в пункту 4.

//        4) Если left<right вернуться к пункту 2. В противном случае закончить алгоритм.


import java.util.Arrays;

public class MixedSorted {

    public static void main(String[] args) {

        int[] array = new int[]{5, 0, -2, 7, 3};

        coctailSort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void coctailSort(int[] sequince) {
        int left = 0;
        int right = sequince.length - 1;
        int control = right;
        for (; left < right; ) {
            for (int i = left; i < right; i++) {
                if (sequince[i] > sequince[i + 1]) {
                    swap(sequince, i, i + 1);
                    control = i;
                }
            }
            right = control;
            for (int i = right; i > left; i--) {
                if (sequince[i] < sequince[i - 1]) {
                    swap(sequince, i, i - 1);
                    control = i;
                }
            }
            left = control;
        }
    }

    public static void swap(int[] sequince, int i, int j) {
        int temp = sequince[i];
        sequince[i] = sequince[j];
        sequince[j] = temp;
    }

}
