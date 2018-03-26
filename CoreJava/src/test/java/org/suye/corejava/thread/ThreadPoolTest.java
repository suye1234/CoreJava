package org.suye.corejava.thread;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by suye on 2017/2/16.
 */
public class ThreadPoolTest {
    private ExecutorService threadPoolExecutor = new ThreadPoolExecutor(100, 1000, 1, TimeUnit.HOURS, new ArrayBlockingQueue<Runnable>(100));

    @Test
    public void testThreadPool() {
        final SynchronizedIdGenerator synchronizedIdGenerator = new SynchronizedIdGenerator();

        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(synchronizedIdGenerator.getNext1());
                        System.out.println(threadPoolExecutor);
                    }
                }
            });
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("Current ID is : " + synchronizedIdGenerator.getValue());

        Assert.assertTrue(true);

    }
}
