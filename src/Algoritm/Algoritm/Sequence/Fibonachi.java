package Algoritm.Algoritm.Sequence;

import java.util.Arrays;
import java.util.Random;

// Бинарный поиск быстрее, но у Фибаначи есть фишка. В нем не используется деление.
// Подходит для убогих старых систем, не поддерживающих эту операцию.
// В таком ключе даже вникать не буду в этот едреный алгоритм, жалко времени.
//https://www.youtube.com/watch?v=x_mQ41D_Uao&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=11

public class Fibonachi {

    private int i;
    private int p;
    private int q;
    private boolean stop = false;

    public static void main(String[] args) {

        int[] array = new Random().ints(10, 1, 10).toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Fibonachi fibonachi = new Fibonachi();
        System.out.println(fibonachi.search(array, 5));

    }

    public long getFibonacciNumber(int k) {
        long firstNumber = 0;
        long secondNumber = 1;
        for (int i = 0; i < k; i++) {
            long temp = secondNumber;
            secondNumber += firstNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    private void init(int[] sequince) {
        stop = false;
        int k = 0;
        int n = sequince.length;
        for (; getFibonacciNumber(k + 1) < n + 1; ) {
            k += 1;
        }
        int m = (int) (getFibonacciNumber(k + 1) - (n + 1));
        i = (int) (getFibonacciNumber(k) - m);
        p = (int) getFibonacciNumber(k - 1);
        q = (int) getFibonacciNumber(k - 2);
    }

    private void downIndex() {
        if (q == 0)
            stop = true;
        i = i - q;
        int temp = q;
        q = p - q;
        p = temp;
    }

    private void upIndex() {
        if (p == 1)
            stop = true;
        i = i + q;
        p = p - q;
        q = q - p;
    }

    public int search(int[] sequince, int element) {
        init(sequince);
        int n = sequince.length;
        int resultIndex = -1;
        for (; !stop; ) {
            if (i < 0) {
                upIndex();
            } else if (i >= n) {
                downIndex();
            } else if (sequince[i] == element) {
                resultIndex = i;
                break;
            } else if (element < sequince[i]) {
                downIndex();
            } else if (element > sequince[i]) {
                upIndex();
            }
        }
        return resultIndex;
    }
}


