package org.suye.corejava.thread;

/**
 * Created by suye on 2017/2/16.
 */
public class ThreadLocalIdGenerator2 {
    private ThreadLocal<Integer> value = ThreadLocal.withInitial(() -> 0);

    public int getNext() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = value.get();
        value.set(value.get() + 1);
        return result;
    }

    public int getValue() {
        return value.get();
    }
}
