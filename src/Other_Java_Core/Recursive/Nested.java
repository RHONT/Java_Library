package Other_Java_Core.Recursive;


import java.util.Arrays;
import java.util.Random;

// Рекурсивный метод суммирования массива

public class Nested {
    public static void main(String[] args) {
        int[] array = new Random().ints(5, 1, 20).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(addition(array, 0, array.length - 1));


    }

    private static int addition(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        }

        int mid = start + (end - start) / 2;
        int left = addition(array, start, mid);
        int right = addition(array, mid + 1, end);

        return merge(left, right);
    }

    private static int merge(int left, int right) {
        return left + right;
    }
}
