package org.suye.corejava.thread;

/**
 * Created by suye on 2017/2/16.
 */
public class SynchronizedIdGenerator {
    private  int value = 0;

    /**
     * 在方法上加synchronized关键字
     * @return
     */
    public synchronized int getNext1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return value++;
    }
    /**
     * 在代码块上加synchronized关键字
     * @return
     */
    public synchronized int getNext2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            return value++;
        }
    }


    public int getValue() {
        return value;
    }

}
