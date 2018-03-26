package org.suye.corejava.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by suye on 2017/3/10.
 */
public class BlockingQueueConsumer implements Runnable {
    private BlockingQueue<Task> buffer;

    public BlockingQueueConsumer(BlockingQueue<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i =0; i< 10; i++) {
            try {
                Task task = buffer.take();
                System.out.println("Consumer[" + Thread.currentThread().getName() + "] got " + task);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
