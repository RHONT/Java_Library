package Threads.Lock_And_Condition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Quai {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private List<Integer> list = new ArrayList<>();

    public Quai() {
    }

    public void put(int i) {
        lock.lock();

        try {
            while (list.size() > 5) {
                condition.await();
            }

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        list.add(i);
    }

    public int remove() {
        lock.lock();
        int i = 0;

        try {
            while (list.isEmpty()) {
                condition.await();
            }
            i = list.get(0);
            list.remove(0);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


        return i;
    }

    public List<Integer> getList() {
        return list;
    }
}


