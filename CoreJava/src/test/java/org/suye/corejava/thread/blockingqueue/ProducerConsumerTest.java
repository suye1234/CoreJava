package org.suye.corejava.thread.blockingqueue;

import jdk.nashorn.internal.ir.Block;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by suye on 2017/3/10.
 */
public class ProducerConsumerTest {
    @Test
    public void testWaitNotifyProducerConsumerByThreadPool() throws InterruptedException {
        List<Task> buffer = new ArrayList<>(Constants.MAX_BUFFER_SIZE);
        ExecutorService es = Executors.newFixedThreadPool(Constants.NUM_OF_CONSUMER + Constants.NUM_OF_PRODUCER);
        for(int i = 1; i <= Constants.NUM_OF_PRODUCER; ++i) {
            es.execute(new WaitNotifyProducer(buffer));
        }
        for(int i = 1; i <= Constants.NUM_OF_CONSUMER; ++i) {
            es.execute(new WaitNotifyConsumer(buffer));
        }

        es.shutdown();

        while (!es.isTerminated()){}


        System.out.println("Finished!!!");
    }


    @Test
    public void testWaitNotifyProducerConsumerByJoin() throws InterruptedException {
        List<Task> buffer = new ArrayList<>(Constants.MAX_BUFFER_SIZE);


        for(int i =0; i< 10; i++){
            Thread producer = new Thread(new WaitNotifyProducer(buffer));
            Thread consumer = new Thread(new WaitNotifyConsumer(buffer));

            producer.start();
            consumer.start();
            producer.join();
            consumer.join();
        }

        System.out.println("Finished!!!!");



    }

    @Test
    public void testBlockingQueueProducerConsumerByJoin() throws InterruptedException {
        BlockingQueue<Task> buffer = new LinkedBlockingQueue<>(Constants.MAX_BUFFER_SIZE);

        for(int i =0; i< 10; i++){
            Thread producer = new Thread(new BlockingQueueProducer(buffer));
            Thread consumer = new Thread(new BlockingQueueConsumer(buffer));

            producer.start();
            consumer.start();
            producer.join();
            consumer.join();
        }

        System.out.println("Finished!!!!");
    }
}
