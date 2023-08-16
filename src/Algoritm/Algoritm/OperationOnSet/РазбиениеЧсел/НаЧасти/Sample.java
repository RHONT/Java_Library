package Algoritm.Algoritm.OperationOnSet.РазбиениеЧсел.НаЧасти;

import java.util.Arrays;

/**
 * Сложность по времени в наихудшем случае O(m)
 * Сложность указанна для одного разбиения!
 * <p>
 * Разбиение целого числа n на m частей — представление числа n в виде кортежа
 * длинной m сумма элементов которого равна n. При этом должно выполняться условие,
 * что n≥m≥2.
 * <p>
 * OUTPUT printNumberPartition(8, 4)
 * [5, 1, 1, 1]
 * [4, 2, 1, 1]
 * [3, 3, 1, 1]
 * [3, 2, 2, 1]
 * [2, 2, 2, 2]
 */
public class Sample {

    public static void main(String[] args) {
        printNumberPartition(8, 4);
    }

    public static void printNumberPartition(int n, int m) {
        int[] part = new int[m];
        Arrays.fill(part, 1);
        part[0] = n - m + 1;
        for (; ; ) {
            System.out.println(Arrays.toString(part));
            if (part[1] < part[0] - 1) {
                part[0] -= 1;
                part[1] += 1;
            } else {
                int j = -1;
                int s = part[0] - 1;
                for (int i = 1; i < part.length; i++) {
                    if (part[i] < part[0] - 1) {
                        j = i;
                        break;
                    }
                    s += part[i];
                }
                if (j == -1) {
                    break;
                }
                part[j] += 1;
                for (int i = 1; i < j; i++) {
                    part[i] = part[j];
                    s -= part[j];
                }
                part[0] = s;
            }
        }
    }
}
