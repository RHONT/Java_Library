package Algoritm.Algoritm.OperationOnSet.РазбиениеМножества;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

//этот класс вмещает в свои итератор объект создающий разбиение множества. И на основании итератора текущего объекта
// начинает вызываться паралельно итератор внутреннего(разбиение множества).
public class SetPartitionGenerator<T> implements Iterable<List<List<T>>> {

    private List<T> setSequence;

    public SetPartitionGenerator(List<T> setSequence) {
        super();
        this.setSequence = setSequence;
    }

    private class PartiotionIterator implements Iterator<List<List<T>>> {
        private Iterator<int[]> itr = new PartitionSequenceGenerator(setSequence.size()).iterator();

        @Override
        public boolean hasNext() {
            return itr.hasNext();
        }

        @Override
        public List<List<T>> next() {
            if (itr.hasNext() == false) {
                throw new NoSuchElementException();
            }
            int[] part = itr.next();
            List<List<T>> result = new ArrayList<>();
            for (int i = 0; i < part.length; i++) {
                if (result.size() < part[i] + 1) {
                    result.add(new ArrayList<>());
                }
                result.get(part[i]).add(setSequence.get(i));
            }
            return result;
        }
    }

    @Override
    public Iterator<List<List<T>>> iterator() {
        return new PartiotionIterator();
    }
}
