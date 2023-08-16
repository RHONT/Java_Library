package Algoritm.Algoritm.OperationOnSet.РазбиениеЧсел.ЛексиграфическийПорядок;
//https://www.youtube.com/watch?v=Y7djM_dUWnQ&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=31

/**
 * //Сложность по времени в наихудшем случае O(n)
 * //Затраты памяти O(n)
 * //Внимание это на одно разбиение!!!
 * <p>
 * OUTPUT: printAllNumberPartitions(8)
 * [1, 1, 1, 1, 1, 1, 1, 1]
 * [2, 1, 1, 1, 1, 1, 1]
 * [2, 2, 1, 1, 1, 1]
 * [2, 2, 2, 1, 1]
 * [2, 2, 2, 2]
 * [3, 1, 1, 1, 1, 1]
 * [3, 2, 1, 1, 1]
 * [3, 2, 2, 1]
 * [3, 3, 1, 1]
 * [3, 3, 2]
 * [4, 1, 1, 1, 1]
 * [4, 2, 1, 1]
 * [4, 2, 2]
 * [4, 3, 1]
 * [4, 4]
 * [5, 1, 1, 1]
 * [5, 2, 1]
 * [5, 3]
 * [6, 1, 1]
 * [6, 2]
 * [7, 1]
 * [8]
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int number = 8;
        printAllNumberPartitions(number);
    }

    public static int[] getNextPartition(int[] partition) {
        if (partition.length == 1) {
            return null;
        }
        int minIndex = 0;
        for (int i = 0; i < partition.length - 1; i++) {
            if (partition[i] < partition[minIndex]) {
                minIndex = i;
            }
        }
        partition[minIndex] += 1;
        partition[partition.length - 1] -= 1;
        minIndex += 1;
        int partSum = 0;
        for (int i = minIndex; i < partition.length; i++) {
            partSum += partition[i];
        }
        int[] nextPartiotion = Arrays.copyOf(partition, minIndex + partSum);
        for (int i = minIndex; i < nextPartiotion.length; i++) {
            nextPartiotion[i] = 1;
        }
        return nextPartiotion;
    }

    public static void printAllNumberPartitions(int number) {
        int[] partition = new int[number];
        Arrays.fill(partition, 1);
        for (; partition != null; ) {
            System.out.println(Arrays.toString(partition));
            partition = getNextPartition(partition);
        }
    }
}
