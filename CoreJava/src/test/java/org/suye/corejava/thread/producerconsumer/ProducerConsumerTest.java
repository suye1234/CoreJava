package org.suye.corejava.thread.producerconsumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by suye on 2017/2/17.
 */
public class ProducerConsumerTest {
    private ThreadPoolExecutor producerPool;

    private ThreadPoolExecutor consumerPool;

    public ProducerConsumerTest() {
        int corePoolSize = Runtime.getRuntime().availableProcessors() * 2;
        producerPool = new ThreadPoolExecutor(corePoolSize, corePoolSize, 10l, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2000));

        consumerPool = new ThreadPoolExecutor(corePoolSize, corePoolSize, 10l, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2000));
    }

    @Test
    public void testProducerConsumer(){
        Resource resource = new Resource();

        for (int i = 0; i < 10 ; i++) {
            consumerPool.execute(new Consumer(resource));
        }

        for (int i = 0; i < 2 ; i++) {
            producerPool.execute(new Producer(resource));
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(true);
    }

}
