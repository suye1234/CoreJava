package org.suye.corejava.thread.blockingqueue;

import java.util.List;

/**
 * Created by suye on 2017/3/10.
 */
public class WaitNotifyConsumer implements Runnable {
    private List<Task> buffer;

    public WaitNotifyConsumer(List<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i =0; i< 10; i++) {
            synchronized(buffer) {
                while(buffer.isEmpty()) {
                    try {
                        System.out.println("WaitNotifyConsumer: the buffer is empty, wait.....");

                        buffer.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Task task = buffer.remove(0);
                buffer.notifyAll();
                System.out.println("WaitNotifyConsumer[" + Thread.currentThread().getName() + "] got " + task);
            }
        }
    }
}
