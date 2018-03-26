package org.suye.corejava.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by suye on 2017/3/18.
 */
public class BoundedQueue<T> {
    private Object[] items;

    private int addIndex, removeIndex, count;

    private Lock lock = new ReentrantLock();

    private Condition notEmpty = lock.newCondition();

    private Condition notFull = lock.newCondition();


    public BoundedQueue(int size) {
        items = new Object[size];
    }


    public void add(T t) throws InterruptedException {
        lock.lock();

        try {
            while (count == items.length) notFull.await();

            items[addIndex] = t;

            if (++addIndex == items.length) addIndex = 0;

            ++count;

            notEmpty.signal();

            System.out.println(Thread.currentThread().getName() + " add "+ t);
        } finally {
            lock.unlock();
        }
    }

    public T remove() throws InterruptedException {
        lock.lock();

        try {
            while(count == 0) notEmpty.await();

            Object x = items[removeIndex];

            if(++removeIndex == items.length) removeIndex = 0;

            --count;
            System.out.println(Thread.currentThread().getName() + " remove "+ x);

            notFull.signal();

            return (T) x;
        }finally {
            lock.unlock();
        }
    }

}
