package org.suye.corejava.thread.lock;

import org.junit.Test;

/**
 * Created by suye on 2017/3/18.
 */
public class ConditionTest {
    private static BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(5);

    @Test
    public void testCondition() throws InterruptedException {
        // 启动10个“写线程”，向BoundedBuffer中不断的写数据(写入0-9)；
        // 启动10个“读线程”，从BoundedBuffer中不断的读数据。
        for (int i = 0; i < 100; i++) {
            new PutThread("p" + i, i).start();
            new TakeThread("t" + i).start();
        }

        Thread.sleep(5000);
    }

    static class PutThread extends Thread {
        private int num;

        public PutThread(String name, int num) {
            super(name);
            this.num = num;
        }

        public void run() {
            try {
                Thread.sleep(1);    // 线程休眠1ms
                boundedQueue.add(num);        // 向BoundedBuffer中写入数据
            } catch (InterruptedException e) {
            }
        }
    }

    static class TakeThread extends Thread {
        public TakeThread(String name) {
            super(name);
        }

        public void run() {
            try {
                Thread.sleep(10);                    // 线程休眠1ms
                Integer num = (Integer) boundedQueue.remove();    // 从BoundedBuffer中取出数据
            } catch (InterruptedException e) {
            }
        }
    }
}
