package org.suye.corejava.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by suye on 2017/3/10.
 */
public class BlockingQueueProducer implements Runnable {
    private BlockingQueue<Task> buffer;

    public BlockingQueueProducer(BlockingQueue<Task> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i =0; i< 10; i++) {
            try {
                Task task = new Task();
                buffer.put(task);
                System.out.println("Producer[" + Thread.currentThread().getName() + "] put " + task);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

