package org.suye.corejava.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by suye on 2017/2/16.
 */
public class LockIdGenerator {
    //new ReentrantLock(true)是重载，使用更加公平的加锁机制，在锁被释放后，会优先给等待时间最长的线程，避免一些线程长期无法获得锁
    private Lock lock = new ReentrantLock();

    private  int value = 0;

    public int getNext() {
        lock.lock();      //进来就加锁，没有锁会等待
        try {
            return value++;//实际操作
        } finally {
            lock.unlock();//释放锁
        }
    }

    public int getValue() {
        return value;
    }
}
