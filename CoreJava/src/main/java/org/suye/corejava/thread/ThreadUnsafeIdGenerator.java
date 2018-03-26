package org.suye.corejava.thread;

/**
 * 模拟线程不安全的计数器.
 */
public class ThreadUnsafeIdGenerator {
    private int value = 0;

    public int getNext() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value++;
    }

    public int getValue() {
        return value;
    }
}