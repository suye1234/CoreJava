package org.suye.corejava.thread.producerconsumer;

/**
 * Created by suye on 2017/2/17.
 */
public class Resource {
    private int number = 0;

    private boolean waitFlag = false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        while (waitFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        waitFlag = true;
        notifyAll();
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!waitFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        waitFlag = false;
        notifyAll();
    }
}
