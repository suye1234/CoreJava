package org.suye.corejava.thread.blockingqueue;

import java.util.List;

/**
 * Created by suye on 2017/3/10.
 */
public class WaitNotifyProducer implements Runnable {
    private List<Task> buffer;

    public WaitNotifyProducer(List<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i =0; i< 10; i++) {
            synchronized (buffer) {
                while(buffer.size() >= Constants.MAX_BUFFER_SIZE) {
                    try {
                        System.out.println("WaitNotifyProducer: the buffer is filled, wait.....");
                        buffer.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Task task = new Task();

                buffer.add(task);
                buffer.notifyAll();
                System.out.println("WaitNotifyProducer[" + Thread.currentThread().getName() + "] put " + task);
            }
        }
    }

}