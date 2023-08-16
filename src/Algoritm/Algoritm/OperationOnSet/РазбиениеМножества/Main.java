package Algoritm.Algoritm.OperationOnSet.РазбиениеМножества;

/**
 * Сложность по времени в наихудшем случае O(n)
 * Внимание это для создания одного разбиения !
 * <p>
 * Идея состоит в генерации всех ограниченно возрастающих
 * последовательностей (представляющих разбиения) в лексикографическом порядке.
 * После этого на основе каждой полученной последовательности и создавать разбиения.
 * <p>
 * В примере есть расклад о количестве разбиений для 4 позиций.
 * И реализация этого механизма для элементов List<></>
 */

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (int[] part : new PartitionSequenceGenerator(4)) {
            System.out.println(Arrays.toString(part));
        }


        List<String> setPartition = List.of("apple", "orange", "lemon");

        for (List<List<String>> part : new SetPartitionGenerator<>(setPartition)) {
            System.out.println(part);
        }

    }

}
